package uz.learn.learning_centre.controller.payment;

import org.springframework.web.bind.annotation.*;
import uz.learn.learning_centre.controller.base.AbstractController;
import uz.learn.learning_centre.controller.base.GenericController;
import uz.learn.learning_centre.controller.base.GenericCrudController;
import uz.learn.learning_centre.criteria.base.AbstractCriteria;
import uz.learn.learning_centre.dto.payment.PaymentCreateDto;
import uz.learn.learning_centre.dto.payment.PaymentDto;
import uz.learn.learning_centre.dto.payment.PaymentUpdateDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.payment.PaymentService;

import java.util.List;

@RestController
@RequestMapping(value = "/payment/")
public class PaymentController extends AbstractController<PaymentService>
        implements GenericCrudController<PaymentCreateDto, PaymentUpdateDto>,
        GenericController<PaymentDto, AbstractCriteria> {


    public PaymentController(PaymentService service) {
        super(service);
    }


    @Override
    public ResponseEntity<DataDto<PaymentDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<PaymentDto>>> getAll(AbstractCriteria criteria) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> create(PaymentCreateDto paymentCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(PaymentUpdateDto paymentUpdateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }
}
