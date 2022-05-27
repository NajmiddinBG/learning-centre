package uz.learn.learning_centre.validator.payment;

import org.springframework.stereotype.Component;
import uz.learn.learning_centre.dto.paymentMock.PaymentMockCreateDto;
import uz.learn.learning_centre.dto.paymentMock.PaymentMockDto;
import uz.learn.learning_centre.dto.paymentMock.PaymentMockUpdateDto;
import uz.learn.learning_centre.entity.PaymentMock;
import uz.learn.learning_centre.validator.base.GenericValidator;

@Component
public class PaymentMockValidator implements GenericValidator<PaymentMock, PaymentMockDto, PaymentMockCreateDto, PaymentMockUpdateDto, Long> {

    @Override
    public void validOnUpdate(PaymentMockUpdateDto paymentMockUpdateDto) {

    }

    @Override
    public void validOnCreate(PaymentMockCreateDto paymentMockCreateDto) {

    }

    @Override
    public void validOnId(Long id) {

    }
}
