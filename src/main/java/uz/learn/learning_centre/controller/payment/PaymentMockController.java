package uz.learn.learning_centre.controller.payment;

import org.springframework.web.bind.annotation.*;
import uz.learn.learning_centre.controller.base.AbstractController;
import uz.learn.learning_centre.controller.base.GenericController;
import uz.learn.learning_centre.controller.base.GenericCrudController;
import uz.learn.learning_centre.criteria.payment.PaymentMockCriteria;
import uz.learn.learning_centre.dto.paymentMock.PaymentMockCreateDto;
import uz.learn.learning_centre.dto.paymentMock.PaymentMockDto;
import uz.learn.learning_centre.dto.paymentMock.PaymentMockUpdateDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.payment.PaymentMockService;

import java.util.List;

@RestController
@RequestMapping(value = "/payment-mock/")
public class PaymentMockController extends AbstractController<PaymentMockService>
        implements GenericCrudController<PaymentMockCreateDto, PaymentMockUpdateDto>,
        GenericController<PaymentMockDto, PaymentMockCriteria> {


    public PaymentMockController(PaymentMockService service) {
        super(service);
    }


    @Override
    public ResponseEntity<DataDto<PaymentMockDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<PaymentMockDto>>> getAll(PaymentMockCriteria criteria) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> create(PaymentMockCreateDto paymentMockCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(PaymentMockUpdateDto paymentMockUpdateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }
}
