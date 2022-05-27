package uz.learn.learning_centre.service.exam;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import uz.learn.learning_centre.criteria.exam.ExamCriteria;
import uz.learn.learning_centre.dto.exam.ExamCreateDto;
import uz.learn.learning_centre.dto.exam.ExamDto;
import uz.learn.learning_centre.dto.exam.ExamUpdateDto;
import uz.learn.learning_centre.entity.Exam;
import uz.learn.learning_centre.exceptions.BadRequestException;
import uz.learn.learning_centre.mapper.exam.ExamMapper;
import uz.learn.learning_centre.repository.exam.ExamRepository;
import uz.learn.learning_centre.response.AppErrorDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.base.AbstractService;
import uz.learn.learning_centre.service.base.GenericCrudService;
import uz.learn.learning_centre.service.base.GenericService;
import uz.learn.learning_centre.validator.exam.ExamValidator;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ExamService extends AbstractService<ExamMapper, ExamValidator, ExamRepository>
        implements GenericCrudService<ExamDto, ExamCreateDto, ExamUpdateDto>,
        GenericService<ExamDto, ExamCriteria> {


    public ExamService(ExamMapper mapper, ExamValidator validator, ExamRepository repository) {
        super(mapper, validator, repository);
    }


    @Override
    public ResponseEntity<DataDto<Long>> create(ExamCreateDto examCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(ExamUpdateDto examUpdateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<ExamDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<ExamDto>>> getAll(ExamCriteria criteria) {
        return null;
    }
}
