package WorldOffice.TallerAutomotriz.Interfaces;

import java.util.List;
import java.util.Optional;

import WorldOffice.TallerAutomotriz.Models.Cliente;


public interface IclienteService {
	
	
List<Cliente>listar();
List<Cliente> findAll();
Optional<Cliente> findById(Long id);
Cliente save (Cliente cliente);
void deleteById(Long id);
Optional<Cliente> findByNombreAndApellido (String nombre, String apellido);

}

