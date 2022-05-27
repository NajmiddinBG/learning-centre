package uz.learn.learning_centre.repository.payment;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import uz.learn.learning_centre.entity.PaymentMock;
import uz.learn.learning_centre.repository.base.BaseRepository;

import java.util.List;

public interface PaymentMockRepository extends JpaRepository<PaymentMock, Long>, BaseRepository {





}
