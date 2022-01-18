package WorldOffice.TallerAutomotriz.Controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import WorldOffice.TallerAutomotriz.Interfaces.IclienteService;
import WorldOffice.TallerAutomotriz.Models.Cliente;

@RestController
@RequestMapping("clientes")
public class ClienteController {

	@Autowired
	private IclienteService clienteService;

	@GetMapping("/pconsultas/{id}")
	public Optional<Cliente> findById(@PathVariable Long id) {
		return clienteService.findById(id);
	}

	@GetMapping("/pbuscar/")
	public List<Cliente> findAll() {
		return clienteService.findAll();
	}

	@GetMapping("/pnombre")
	public Optional<Cliente> findByNombreAndApellido(@RequestParam String nombre, @RequestParam String apellido) {
		return clienteService.findByNombreAndApellido(nombre, apellido);
	}

	@PostMapping("/pcrear/")
	public void save(@RequestBody Cliente cliente) {
		clienteService.save(cliente);
	}

	@DeleteMapping("/peliminar/{id}")
	public ResponseEntity<?> deletePersona(@PathVariable Long id) {
		Map<String, Object> response = new HashMap<>();
		try {
			clienteService.deleteById(id);
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al eliminar cliente!");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("mensaje", "Cliente eliminado con exito!");
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);

	}
	
	
	@PutMapping("/actualizar/{id}")
	public Cliente actualizarCliente(@RequestBody Cliente cliente) {
	
			 return clienteService.save(cliente);
		
	}	

}
