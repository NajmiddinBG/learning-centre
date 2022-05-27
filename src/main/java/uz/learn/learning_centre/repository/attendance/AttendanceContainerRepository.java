package uz.learn.learning_centre.repository.attendance;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.learn.learning_centre.entity.AttendanceContainer;
import uz.learn.learning_centre.repository.base.BaseRepository;

import java.util.List;

public interface AttendanceContainerRepository extends JpaRepository<AttendanceContainer, Long>, BaseRepository {

}
