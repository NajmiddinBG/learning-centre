package uz.learn.learning_centre.validator.payment;


import org.springframework.stereotype.Component;
import uz.learn.learning_centre.dto.payment.PaymentCreateDto;
import uz.learn.learning_centre.dto.payment.PaymentDto;
import uz.learn.learning_centre.dto.payment.PaymentUpdateDto;
import uz.learn.learning_centre.entity.Payment;
import uz.learn.learning_centre.exceptions.BadRequestException;
import uz.learn.learning_centre.validator.base.GenericValidator;

import java.util.Objects;

@Component
public class PaymentValidator implements GenericValidator<Payment, PaymentDto, PaymentCreateDto, PaymentUpdateDto, Long> {

    @Override
    public void validOnUpdate(PaymentUpdateDto paymentUpdateDto) {

    }

    @Override
    public void validOnCreate(PaymentCreateDto paymentCreateDto) {

    }

    @Override
    public void validOnId(Long id) {

    }
}
