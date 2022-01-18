package WorldOffice.TallerAutomotriz.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WorldOffice.TallerAutomotriz.Interfaces.IregVehiculoService;
import WorldOffice.TallerAutomotriz.Models.RegVehiculo;
import WorldOffice.TallerAutomotriz.Repositories.RegVehiculoRepository;


@Service
public class RegVehiculoService implements IregVehiculoService {
	@Autowired
	private RegVehiculoRepository regVehiculoRepository;
	
	public Optional<RegVehiculo> findById(Long id) {
		return regVehiculoRepository.findById(id);	
	}



	public List<RegVehiculo> existSoat(Boolean soat ) {
		
		return regVehiculoRepository.existSoat(soat);
	}

	public void deleteById(Long id) {
		regVehiculoRepository.deleteById(id);
	}

	@Override
	public RegVehiculo crearRegistroV(RegVehiculo regvehiculo) {
		return regVehiculoRepository.save(regvehiculo);
	}
	





}