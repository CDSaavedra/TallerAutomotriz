package WorldOffice.TallerAutomotriz.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import WorldOffice.TallerAutomotriz.Models.Cliente;



@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	 
	@Query("SELECT p FROM Cliente p WHERE p.edad = ?1")
	List<Cliente> findByedad(String edad);
	
	@Query("SELECT p FROM Cliente p WHERE p.fecharegisto = ?1")
	List<Cliente> findByfecharegisto (String fecharegisto);
	
	
	@Query ("SELECT p FROM Cliente p WHERE p.nombre = ?1 AND p.apellido = ?2")
	Optional<Cliente> findByNombreAndApellido (String nombre, String apellido);
	

	
}
