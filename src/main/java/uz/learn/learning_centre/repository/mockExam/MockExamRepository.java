package uz.learn.learning_centre.repository.mockExam;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.learn.learning_centre.entity.MockExam;
import uz.learn.learning_centre.repository.base.BaseRepository;

public interface MockExamRepository extends JpaRepository<MockExam, Long>, BaseRepository {

}
