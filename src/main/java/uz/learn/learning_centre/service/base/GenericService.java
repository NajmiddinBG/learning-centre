package uz.learn.learning_centre.service.base;

import uz.learn.learning_centre.criteria.base.BaseCriteria;
import uz.learn.learning_centre.dto.base.GenericDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;

import java.util.List;

public interface GenericService<D extends GenericDto, C extends BaseCriteria> {

    ResponseEntity<DataDto<D>> get(Long id);

    ResponseEntity<DataDto<List<D>>> getAll(C criteria);


}
