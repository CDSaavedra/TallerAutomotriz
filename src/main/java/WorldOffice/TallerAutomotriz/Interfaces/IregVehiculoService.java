package WorldOffice.TallerAutomotriz.Interfaces;


import java.util.List;
import java.util.Optional;

import WorldOffice.TallerAutomotriz.Models.RegVehiculo;



public  interface IregVehiculoService {
	
Optional<RegVehiculo> findById(Long id);

List<RegVehiculo> existSoat (Boolean soat);

void deleteById(Long id);
RegVehiculo crearRegistroV(RegVehiculo regvehiculo);

}