package uz.learn.learning_centre.controller.exam;

import org.springframework.web.bind.annotation.*;
import uz.learn.learning_centre.controller.base.AbstractController;
import uz.learn.learning_centre.controller.base.GenericController;
import uz.learn.learning_centre.controller.base.GenericCrudController;
import uz.learn.learning_centre.criteria.exam.ExamCriteria;
import uz.learn.learning_centre.dto.exam.ExamCreateDto;
import uz.learn.learning_centre.dto.exam.ExamDto;
import uz.learn.learning_centre.dto.exam.ExamUpdateDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.exam.ExamService;

import java.util.List;

@RestController
@RequestMapping(value = "/exam")
public class ExamController extends AbstractController<ExamService>
        implements GenericCrudController<ExamCreateDto, ExamUpdateDto>,
        GenericController<ExamDto, ExamCriteria> {

    public ExamController(ExamService service) {
        super(service);
    }


    @Override
    @PostMapping("/create")
    public ResponseEntity<DataDto<Long>> create( ExamCreateDto examCreateDto) {
        return service.create(examCreateDto);
    }

    @Override
    @PostMapping("/update")
    public ResponseEntity<DataDto<Long>> update(ExamUpdateDto examUpdateDto) {
        return service.update(examUpdateDto);
    }

    @Override
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<DataDto<Boolean>> delete(@PathVariable(value = "id") Long id) {
        return service.delete(id);
    }

    @Override
    @GetMapping(value = "/get/{id}")
    public ResponseEntity<DataDto<ExamDto>> get(@PathVariable(value = "id") Long id) {
        return service.get(id);
    }

    @Override
    @GetMapping(value = "/list")
    public ResponseEntity<DataDto<List<ExamDto>>> getAll(ExamCriteria examCriteria) {
        return service.getAll(examCriteria);
    }
}
