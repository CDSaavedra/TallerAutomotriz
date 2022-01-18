package WorldOffice.TallerAutomotriz.Repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WorldOffice.TallerAutomotriz.Models.HistoricoRep;



@Repository
public interface HistoricoRepRepository extends JpaRepository<HistoricoRep, Long>{

	void  deleteById(Long id);



	


	
}
