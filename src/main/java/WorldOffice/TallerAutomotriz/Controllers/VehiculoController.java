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
import org.springframework.web.bind.annotation.RestController;

import WorldOffice.TallerAutomotriz.Interfaces.IvehiculoService;
import WorldOffice.TallerAutomotriz.Models.Vehiculo;

@RestController
@RequestMapping("vehiculos")
public class VehiculoController {

	@Autowired
	private IvehiculoService vehiculoService;

	@GetMapping("/vconsultar/{placa}")
	public List<Vehiculo> findByPlaca(@PathVariable String placa) {
		return vehiculoService.findByPlaca(placa);
	}

	
	@GetMapping("/vcolor/{color}")
	public Optional<Vehiculo> findByColor(@PathVariable String color) {
		return vehiculoService.findByColor(color);

	}
	
	
	@GetMapping("/ConsultarT/{tipovehiculo}")
	public Optional<Vehiculo> findBytipovehiculo (@PathVariable String tipovehiculo){
		return vehiculoService.findByTipovehiculo(tipovehiculo);
	}
	
	
	@PostMapping("/vcrear")
	public ResponseEntity<Vehiculo> save(@RequestBody Vehiculo vehiculo) {
		return new ResponseEntity<Vehiculo>(this.vehiculoService.save(vehiculo), HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public Vehiculo actualizarVehiculo(@RequestBody Vehiculo vehiculo) {
	
			return vehiculoService.save(vehiculo);
		
	}	
	
	@DeleteMapping("/borrar/{id}")
	public ResponseEntity<?> deleteVehiculo(@PathVariable Long id) {
		Map<String, Object> response = new HashMap<>();
		try {
			vehiculoService.deleteById(id);
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al eliminar vehiculo!");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("mensaje", "Vehiculo eliminado con exito!");
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);

	}



}