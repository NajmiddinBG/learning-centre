package uz.learn.learning_centre.entity;


import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.entity.base.Auditable;
import uz.learn.learning_centre.enums.PaymentType;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "payment")
public class Payment extends Auditable {

    private Double price;

    private Long studentId;

    @Column
    private Long month;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType; // cash / card

    private boolean deleted;

    private boolean successful;

    private Long organizationId;

}
