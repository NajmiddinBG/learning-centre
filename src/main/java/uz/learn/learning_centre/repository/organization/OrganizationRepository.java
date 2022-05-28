package uz.learn.learning_centre.repository.organization;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.learn.learning_centre.entity.Organization;
import uz.learn.learning_centre.repository.base.BaseRepository;

/**
 * @author Botirov Najmiddin, Fri 11:53 PM. 5/27/2022
 */
public interface OrganizationRepository extends JpaRepository<Organization, Long>, BaseRepository {

}
