package uz.learn.learning_centre.controller.mock;

import org.springframework.web.bind.annotation.*;
import uz.learn.learning_centre.controller.base.AbstractController;
import uz.learn.learning_centre.controller.base.GenericController;
import uz.learn.learning_centre.controller.base.GenericCrudController;
import uz.learn.learning_centre.criteria.lesson.LessonCriteria;
import uz.learn.learning_centre.dto.mock.MockCreateDto;
import uz.learn.learning_centre.dto.mock.MockDto;
import uz.learn.learning_centre.dto.mock.MockUpdateDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.mock.MockService;

import java.util.List;

@RestController
@RequestMapping(value = "/mock/")
public class MockController extends AbstractController<MockService>
        implements GenericCrudController<MockCreateDto, MockUpdateDto>,
        GenericController<MockDto, LessonCriteria> {

    public MockController(MockService service) {
        super(service);
    }

    @Override
    public ResponseEntity<DataDto<MockDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<MockDto>>> getAll(LessonCriteria criteria) {
        return null;
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
}
