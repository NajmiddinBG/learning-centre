package uz.learn.learning_centre.controller.mockExam;

import org.springframework.web.bind.annotation.*;
import uz.learn.learning_centre.controller.base.AbstractController;
import uz.learn.learning_centre.controller.base.GenericController;
import uz.learn.learning_centre.controller.base.GenericCrudController;
import uz.learn.learning_centre.criteria.mockExam.MockExamCriteria;
import uz.learn.learning_centre.dto.mockExam.MockExamCreateDto;
import uz.learn.learning_centre.dto.mockExam.MockExamDto;
import uz.learn.learning_centre.dto.mockExam.MockExamUpdateDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.mock.MockService;
import uz.learn.learning_centre.service.mockExam.MockExamService;

import java.util.List;

@RestController
@RequestMapping("/mock-exam/")
public class MockExamController extends AbstractController<MockExamService>
        implements GenericCrudController<MockExamCreateDto, MockExamUpdateDto>,
        GenericController<MockExamDto, MockExamCriteria> {

    private final MockService mockService;

    public MockExamController(MockExamService service, MockService mockService) {
        super(service);
        this.mockService = mockService;
    }


    @Override
    public ResponseEntity<DataDto<MockExamDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<MockExamDto>>> getAll(MockExamCriteria criteria) {
        return null;
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
}
