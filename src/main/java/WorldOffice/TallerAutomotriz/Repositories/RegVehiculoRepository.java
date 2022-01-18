package WorldOffice.TallerAutomotriz.Repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import WorldOffice.TallerAutomotriz.Models.RegVehiculo;



@Repository
public interface RegVehiculoRepository extends JpaRepository<RegVehiculo, Long>{

	@Query ("SELECT v FROM RegVehiculo v WHERE v.soat = true")
	List<RegVehiculo> existSoat (Boolean soat);



	}


