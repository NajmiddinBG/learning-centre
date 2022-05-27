package uz.learn.learning_centre.repository.news;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.learn.learning_centre.entity.News;
import uz.learn.learning_centre.repository.base.BaseRepository;


public interface NewsRepository extends JpaRepository<News, Long>, BaseRepository {

}
