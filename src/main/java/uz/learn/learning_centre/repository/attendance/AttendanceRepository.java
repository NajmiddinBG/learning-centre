package uz.learn.learning_centre.repository.attendance;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.learn.learning_centre.entity.Attendance;
import uz.learn.learning_centre.repository.base.BaseRepository;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Long>, BaseRepository {
}
