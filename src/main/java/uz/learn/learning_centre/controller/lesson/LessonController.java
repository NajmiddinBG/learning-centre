package uz.learn.learning_centre.controller.lesson;

import org.springframework.web.bind.annotation.*;
import uz.learn.learning_centre.controller.base.AbstractController;
import uz.learn.learning_centre.criteria.lesson.LessonCriteria;
import uz.learn.learning_centre.dto.lesson.LessonCreateDto;
import uz.learn.learning_centre.dto.lesson.LessonDto;
import uz.learn.learning_centre.dto.lesson.LessonUpdateDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.base.GenericCrudService;
import uz.learn.learning_centre.service.base.GenericService;
import uz.learn.learning_centre.service.lesson.LessonService;

import java.util.List;


@RestController
@RequestMapping(value = "/lesson/")
public class LessonController extends AbstractController<LessonService>
        implements GenericCrudService<LessonDto, LessonCreateDto, LessonUpdateDto>,
        GenericService<LessonDto, LessonCriteria> {


    public LessonController(LessonService service) {
        super(service);
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
