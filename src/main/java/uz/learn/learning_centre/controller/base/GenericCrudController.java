package uz.learn.learning_centre.controller.base;


import uz.learn.learning_centre.dto.base.BaseDto;
import uz.learn.learning_centre.dto.base.GenericDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;

public interface GenericCrudController<CD extends BaseDto, UD extends GenericDto> {

    ResponseEntity<DataDto<Long>> create(CD cd);

    ResponseEntity<DataDto<Long>> update(UD ud);

    ResponseEntity<DataDto<Boolean>> delete(Long id);

}
