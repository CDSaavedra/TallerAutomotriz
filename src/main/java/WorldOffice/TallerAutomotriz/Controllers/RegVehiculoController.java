package WorldOffice.TallerAutomotriz.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import WorldOffice.TallerAutomotriz.Interfaces.IregVehiculoService;
import WorldOffice.TallerAutomotriz.Models.RegVehiculo;


@RestController
@RequestMapping("registro")
public class RegVehiculoController {

	@Autowired
	private IregVehiculoService regVehiculoService;	
	
	
	//Consultar atributos definidos en las entidades de RegistroVehiculo
	
	
	@GetMapping("/CReVehiculo/{id}")
	public Optional<RegVehiculo> findById (@PathVariable Long id){
		return regVehiculoService.findById(id);	
	}
	
	@GetMapping("/RegSoat/{soat}")
	public List<RegVehiculo> existSoat (@PathVariable Boolean soat){
		return regVehiculoService.existSoat(soat);	
	}

	
	//Crear RegistroVehiculo
	
	@PostMapping("crear/")
	public void crearRegistroV(@RequestBody RegVehiculo regVehiculo) {
		regVehiculoService.crearRegistroV(regVehiculo);
	}
	

	//Actualizar registro
	/*@PutMapping("/update/{id}")
	public RegVehiculo actualizarRegV(@RequestBody RegVehiculo regVehiculo) {
			return regVehiculoService.save(regVehiculo);
	}	 
	*/
	/*@PutMapping("/actualizar/{id}")
	public RegVehiculo actualizarRegV(@RequestBody RegVehiculo newRegVehiculo, @PathVariable Long id) {
		return regVehiculoService.actualizarR(newRegVehiculo, id);
	}*/
	
	@DeleteMapping("/deleteReg/{id}")
	public void borrarReg(@PathVariable Long id) {
	        regVehiculoService.deleteById(id);
	
	}
}
