package uz.learn.learning_centre.repository.mock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import uz.learn.learning_centre.entity.Mock;
import uz.learn.learning_centre.repository.base.BaseRepository;

import java.util.Optional;

public interface MockRepository extends JpaRepository<Mock, Long>, BaseRepository {

}
