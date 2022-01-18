package WorldOffice.TallerAutomotriz.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import WorldOffice.TallerAutomotriz.Models.Vehiculo;


	@Repository
	public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

		List<Vehiculo> findByPlaca(String placa);

		@Query("SELECT p FROM Vehiculo p WHERE p.tipovehiculo = ?1")
		Optional<Vehiculo> findByTipovehiculo(String tipovehiculo);

		@Query("SELECT p FROM Vehiculo p WHERE p.color = ?1")
        Optional<Vehiculo> findByColor(String color);

	}

	