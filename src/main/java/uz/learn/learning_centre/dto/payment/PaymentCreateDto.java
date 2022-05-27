package uz.learn.learning_centre.dto.payment;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.BaseDto;
import uz.learn.learning_centre.enums.PaymentType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
public class PaymentCreateDto implements BaseDto {

    private Double price;

    private Long studentId;

    private Long subjectId;// write relationship

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType; // cash / card

}
