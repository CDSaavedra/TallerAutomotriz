package WorldOffice.TallerAutomotriz.Interfaces;

import java.util.List;
import java.util.Optional;

import WorldOffice.TallerAutomotriz.Models.Vehiculo;


public interface IvehiculoService {

	List<Vehiculo> findByPlaca (String placa);
	
	Optional<Vehiculo> findByColor(String color);
	
	Vehiculo  save(Vehiculo vehiculo);

	void deleteById(Long id);
	
	Optional<Vehiculo> findByTipovehiculo(String tipovehiculo);

	void update(Vehiculo vehiculo);
}
