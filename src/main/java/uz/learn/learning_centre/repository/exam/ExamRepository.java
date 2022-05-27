package uz.learn.learning_centre.repository.exam;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.learn.learning_centre.entity.Exam;
import uz.learn.learning_centre.repository.base.BaseRepository;

import java.util.List;

public interface ExamRepository extends JpaRepository<Exam,Long>, BaseRepository {
    List<Exam> findAllByGroupId(Long groupId, Pageable pageable);
}
