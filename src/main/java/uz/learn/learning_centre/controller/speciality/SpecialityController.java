package uz.learn.learning_centre.controller.speciality;

import org.springframework.web.bind.annotation.*;
import uz.learn.learning_centre.controller.base.AbstractController;
import uz.learn.learning_centre.controller.base.GenericController;
import uz.learn.learning_centre.controller.base.GenericCrudController;
import uz.learn.learning_centre.criteria.speciality.SpecialityCriteria;
import uz.learn.learning_centre.dto.speciality.SpecialityCreateDto;
import uz.learn.learning_centre.dto.speciality.SpecialityDto;
import uz.learn.learning_centre.dto.speciality.SpecialityUpdateDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.speciality.SpecialityService;

import java.util.List;

@RestController
@RequestMapping("/speciality")
public class SpecialityController extends AbstractController<SpecialityService>
        implements GenericCrudController<SpecialityCreateDto, SpecialityUpdateDto>, GenericController<SpecialityDto, SpecialityCriteria> {

    public SpecialityController(SpecialityService service) {
        super(service);
    }


    @Override
    public ResponseEntity<DataDto<SpecialityDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<SpecialityDto>>> getAll(SpecialityCriteria criteria) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> create(SpecialityCreateDto specialityCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(SpecialityUpdateDto specialityUpdateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }
}
