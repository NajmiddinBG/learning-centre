package uz.learn.learning_centre.service.payment;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import uz.learn.learning_centre.criteria.base.AbstractCriteria;
import uz.learn.learning_centre.dto.payment.PaymentCreateDto;
import uz.learn.learning_centre.dto.payment.PaymentDto;
import uz.learn.learning_centre.dto.payment.PaymentUpdateDto;
import uz.learn.learning_centre.entity.Payment;
import uz.learn.learning_centre.exceptions.BadRequestException;
import uz.learn.learning_centre.mapper.payment.PaymentMapper;
import uz.learn.learning_centre.repository.payment.PaymentRepository;
import uz.learn.learning_centre.response.AppErrorDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.base.AbstractService;
import uz.learn.learning_centre.service.base.GenericCrudService;
import uz.learn.learning_centre.service.base.GenericService;
import uz.learn.learning_centre.validator.payment.PaymentValidator;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService extends AbstractService<PaymentMapper, PaymentValidator, PaymentRepository>
        implements GenericCrudService<PaymentDto, PaymentCreateDto, PaymentUpdateDto>,
        GenericService<PaymentDto, AbstractCriteria> {


    public PaymentService(PaymentMapper mapper, PaymentValidator validator, PaymentRepository repository) {
        super(mapper, validator, repository);
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

    @Override
    public ResponseEntity<DataDto<PaymentDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<PaymentDto>>> getAll(AbstractCriteria criteria) {
        return null;
    }
}
