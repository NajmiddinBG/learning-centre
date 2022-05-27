package uz.learn.learning_centre.dto.payment;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.GenericDto;
import uz.learn.learning_centre.enums.PaymentType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Getter
@Setter
public class PaymentDto extends GenericDto {


    private LocalDate createdAt;

    private Double price;

    private Long studentId;

    private Long subjectId;// write relationship

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType; // cash / card

    private boolean successful;


}
