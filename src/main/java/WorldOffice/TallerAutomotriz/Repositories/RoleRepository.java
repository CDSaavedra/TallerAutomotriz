package WorldOffice.TallerAutomotriz.Repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WorldOffice.TallerAutomotriz.Models.Auth.Role;




@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

	
}
