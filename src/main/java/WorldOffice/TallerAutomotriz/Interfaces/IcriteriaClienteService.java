package WorldOffice.TallerAutomotriz.Interfaces;

import java.util.List;

import WorldOffice.TallerAutomotriz.Models.Vehiculo;

public interface IcriteriaClienteService {

	
	
	List<Vehiculo> findVehiculoByPlacaAndModelo(String placa, String modelo);
}
