package uz.learn.learning_centre.service.mock;

import org.springframework.stereotype.Service;
import uz.learn.learning_centre.criteria.lesson.LessonCriteria;
import uz.learn.learning_centre.dto.mock.MockCreateDto;
import uz.learn.learning_centre.dto.mock.MockDto;
import uz.learn.learning_centre.dto.mock.MockUpdateDto;
import uz.learn.learning_centre.mapper.mock.MockMapper;
import uz.learn.learning_centre.repository.mock.MockRepository;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.base.AbstractService;
import uz.learn.learning_centre.service.base.GenericCrudService;
import uz.learn.learning_centre.service.base.GenericService;
import uz.learn.learning_centre.validator.mock.MockValidator;

import java.util.List;
import java.util.Optional;

@Service
public class MockService extends AbstractService<MockMapper, MockValidator, MockRepository>
        implements GenericCrudService<MockDto, MockCreateDto, MockUpdateDto>,
        GenericService<MockDto, LessonCriteria> {

    public MockService(MockMapper mapper, MockValidator validator, MockRepository repository) {
        super(mapper, validator, repository);
    }



    @Override
    public ResponseEntity<DataDto<Long>> create(MockCreateDto mockCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(MockUpdateDto mockUpdateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<MockDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<MockDto>>> getAll(LessonCriteria criteria) {
        return null;
    }
}
