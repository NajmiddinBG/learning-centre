package uz.learn.learning_centre.repository.grouping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import uz.learn.learning_centre.entity.Grouping;
import uz.learn.learning_centre.repository.base.BaseRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface GroupingRepository extends JpaRepository<Grouping, Long>, BaseRepository {

}
