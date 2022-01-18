package WorldOffice.TallerAutomotriz.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WorldOffice.TallerAutomotriz.Interfaces.IvehiculoService;
import WorldOffice.TallerAutomotriz.Models.Vehiculo;
import WorldOffice.TallerAutomotriz.Repositories.VehiculoRepository;


@Service

public class VehiculoService implements IvehiculoService {

	
	@Autowired
	private VehiculoRepository vehiculoRepository;
	
	public  List<Vehiculo> findByPlaca(String placa) {
		
		return vehiculoRepository.findByPlaca(placa);
	}

	@Override
	public Optional<Vehiculo> findByColor(String color) {
		return vehiculoRepository.findByColor(color);
	}


	@Override
	public  Vehiculo save(Vehiculo vehiculo) {
		return vehiculoRepository.save(vehiculo);
		
	}

	@Override
	public  void deleteById(Long id) {
		vehiculoRepository.deleteById(id);
	}

	@Override
	public void update(Vehiculo vehiculo) {

		vehiculoRepository.save(vehiculo);
				
	}

	@Override
	public Optional<Vehiculo> findByTipovehiculo(String tipovehiculo) {
		return vehiculoRepository.findByTipovehiculo(tipovehiculo);
	}

	public VehiculoService(VehiculoRepository vehiculoRepository) {
		this.vehiculoRepository = vehiculoRepository;
	}






	
	
	}

