package uz.learn.learning_centre.service.mockExam;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import uz.learn.learning_centre.criteria.mockExam.MockExamCriteria;
import uz.learn.learning_centre.dto.mockExam.MockExamCreateDto;
import uz.learn.learning_centre.dto.mockExam.MockExamDto;
import uz.learn.learning_centre.dto.mockExam.MockExamUpdateDto;
import uz.learn.learning_centre.entity.MockExam;
import uz.learn.learning_centre.exceptions.BadRequestException;
import uz.learn.learning_centre.mapper.mockExam.MockExamMapper;
import uz.learn.learning_centre.repository.mockExam.MockExamRepository;
import uz.learn.learning_centre.response.AppErrorDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.base.AbstractService;
import uz.learn.learning_centre.service.base.GenericCrudService;
import uz.learn.learning_centre.service.base.GenericService;
import uz.learn.learning_centre.validator.mockExam.MockExamValidator;

import java.util.List;

@Service
public class MockExamService extends AbstractService<MockExamMapper, MockExamValidator, MockExamRepository>
        implements GenericCrudService<MockExamDto, MockExamCreateDto, MockExamUpdateDto>,
        GenericService<MockExamDto, MockExamCriteria> {

    public MockExamService(MockExamMapper mapper, MockExamValidator validator, MockExamRepository repository) {
        super(mapper, validator, repository);
    }


    @Override
    public ResponseEntity<DataDto<Long>> create(MockExamCreateDto mockExamCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(MockExamUpdateDto mockExamUpdateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<MockExamDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<MockExamDto>>> getAll(MockExamCriteria criteria) {
        return null;
    }
}
