package WorldOffice.TallerAutomotriz.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import WorldOffice.TallerAutomotriz.Models.Vehiculo;

@Repository

public interface ClienteRepoCriteria extends JpaRepository<Vehiculo, Long>, 
JpaSpecificationExecutor<Vehiculo> {

}