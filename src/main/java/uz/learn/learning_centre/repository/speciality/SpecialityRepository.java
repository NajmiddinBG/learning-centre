package uz.learn.learning_centre.repository.speciality;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.learn.learning_centre.entity.Speciality;
import uz.learn.learning_centre.repository.base.BaseRepository;

import java.util.List;

public interface SpecialityRepository extends JpaRepository<Speciality, Long>, BaseRepository {

}
