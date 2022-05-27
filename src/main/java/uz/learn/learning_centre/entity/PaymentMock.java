package uz.learn.learning_centre.entity;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.entity.base.Auditable;
import uz.learn.learning_centre.enums.PaymentType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "payment_mock")
public class PaymentMock extends Auditable {

    private Double price;

    private Long studentId;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType; // cash / card

    private boolean deleted;

    private boolean successful;

    private Long MockId;

}
