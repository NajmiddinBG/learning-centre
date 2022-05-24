package uz.learn.learning_centre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.learn.learning_centre.entity.Picture;
import uz.learn.learning_centre.repository.base.BaseRepository;

import java.util.List;

@Repository
public interface FileRepository extends JpaRepository<Picture,Long>, BaseRepository {

}
