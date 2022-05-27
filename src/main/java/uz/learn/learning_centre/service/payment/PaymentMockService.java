package uz.learn.learning_centre.service.payment;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import uz.learn.learning_centre.criteria.payment.PaymentMockCriteria;
import uz.learn.learning_centre.dto.paymentMock.PaymentMockCreateDto;
import uz.learn.learning_centre.dto.paymentMock.PaymentMockDto;
import uz.learn.learning_centre.dto.paymentMock.PaymentMockUpdateDto;
import uz.learn.learning_centre.entity.PaymentMock;
import uz.learn.learning_centre.exceptions.BadRequestException;
import uz.learn.learning_centre.mapper.payment.PaymentMockMapper;
import uz.learn.learning_centre.repository.payment.PaymentMockRepository;
import uz.learn.learning_centre.response.AppErrorDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.base.AbstractService;
import uz.learn.learning_centre.service.base.GenericCrudService;
import uz.learn.learning_centre.service.base.GenericService;
import uz.learn.learning_centre.validator.payment.PaymentMockValidator;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentMockService extends AbstractService<PaymentMockMapper, PaymentMockValidator, PaymentMockRepository>
        implements GenericCrudService<PaymentMockDto, PaymentMockCreateDto, PaymentMockUpdateDto>,
        GenericService<PaymentMockDto, PaymentMockCriteria> {

    public PaymentMockService(PaymentMockMapper mapper, PaymentMockValidator validator, PaymentMockRepository repository) {
        super(mapper, validator, repository);
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

    @Override
    public ResponseEntity<DataDto<PaymentMockDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<PaymentMockDto>>> getAll(PaymentMockCriteria criteria) {
        return null;
    }
}
