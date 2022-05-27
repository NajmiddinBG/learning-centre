package uz.learn.learning_centre.repository.payment;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.learn.learning_centre.entity.Payment;
import uz.learn.learning_centre.repository.base.BaseRepository;

import java.util.List;
import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long>, BaseRepository {



}
