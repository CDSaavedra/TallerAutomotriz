package WorldOffice.TallerAutomotriz.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WorldOffice.TallerAutomotriz.Interfaces.IclienteService;
import WorldOffice.TallerAutomotriz.Models.Cliente;
import WorldOffice.TallerAutomotriz.Repositories.ClienteRepository;



@Service
public class ClienteService implements IclienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
	@Override
	public Optional<Cliente> findById(Long id) {	
		return clienteRepository.findById(id);
	}

	@Override
	public List<Cliente> findAll() {
		
		return clienteRepository.findAll();
	}

	@Override 
	public  Cliente save(Cliente cliente) {
	return clienteRepository.save(cliente);
		
	}
	
	@Override
	public void deleteById(Long id) {
		  clienteRepository.deleteById(id);
		
	}
	@Override
	public Optional<Cliente> findByNombreAndApellido(String nombre, String apellido) {		
		return clienteRepository.findByNombreAndApellido(nombre,apellido);
	}

	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	
	
	}