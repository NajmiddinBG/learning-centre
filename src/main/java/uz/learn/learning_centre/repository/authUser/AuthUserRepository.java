package uz.learn.learning_centre.repository.authUser;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.learn.learning_centre.entity.AuthUser;
import uz.learn.learning_centre.enums.AuthRole;
import uz.learn.learning_centre.repository.base.BaseRepository;

import java.util.List;

public interface AuthUserRepository extends JpaRepository<AuthUser, Long>, BaseRepository {

    List<AuthUser> findAllByRole(AuthRole role, Pageable pageable);

    AuthUser findAuthUserByPhoneNumber(String phoneNumber);

}
