package uz.learn.learning_centre.service.lesson;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import uz.learn.learning_centre.criteria.lesson.LessonCriteria;
import uz.learn.learning_centre.dto.lesson.LessonCreateDto;
import uz.learn.learning_centre.dto.lesson.LessonDto;
import uz.learn.learning_centre.dto.lesson.LessonUpdateDto;
import uz.learn.learning_centre.entity.Lesson;
import uz.learn.learning_centre.exceptions.BadRequestException;
import uz.learn.learning_centre.exceptions.NotFoundException;
import uz.learn.learning_centre.mapper.lesson.LessonMapper;
import uz.learn.learning_centre.repository.lesson.LessonRepository;
import uz.learn.learning_centre.response.AppErrorDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.base.AbstractService;
import uz.learn.learning_centre.service.base.GenericCrudService;
import uz.learn.learning_centre.service.base.GenericService;
import uz.learn.learning_centre.validator.lesson.LessonValidator;

import java.util.List;
import java.util.Optional;

@Service
public class LessonService extends AbstractService<LessonMapper, LessonValidator, LessonRepository>
        implements GenericCrudService<LessonDto, LessonCreateDto, LessonUpdateDto>,
        GenericService<LessonDto, LessonCriteria> {


    public LessonService(LessonMapper mapper, LessonValidator validator, LessonRepository repository) {
        super(mapper, validator, repository);
    }

    @Override
    public ResponseEntity<DataDto<Long>> create(LessonCreateDto lessonCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(LessonUpdateDto lessonUpdateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<LessonDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<LessonDto>>> getAll(LessonCriteria criteria) {
        return null;
    }
}