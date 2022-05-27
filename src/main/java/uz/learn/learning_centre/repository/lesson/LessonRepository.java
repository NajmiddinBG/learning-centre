package uz.learn.learning_centre.repository.lesson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.learn.learning_centre.entity.Lesson;
import uz.learn.learning_centre.repository.base.BaseRepository;


public interface LessonRepository extends JpaRepository<Lesson, Long>, BaseRepository {


}
