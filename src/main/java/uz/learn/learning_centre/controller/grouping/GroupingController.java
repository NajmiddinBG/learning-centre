package uz.learn.learning_centre.controller.grouping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.learn.learning_centre.controller.base.AbstractController;
import uz.learn.learning_centre.controller.base.GenericController;
import uz.learn.learning_centre.controller.base.GenericCrudController;
import uz.learn.learning_centre.criteria.grouping.GroupingCriteria;
import uz.learn.learning_centre.dto.grouping.GroupingCreateDto;
import uz.learn.learning_centre.dto.grouping.GroupingDto;
import uz.learn.learning_centre.dto.grouping.GroupingUpdateDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.grouping.GroupingService;

import java.util.List;

@RestController
@RequestMapping(value = "/grouping")
public class GroupingController extends AbstractController<GroupingService>
        implements GenericCrudController<GroupingCreateDto, GroupingUpdateDto>, GenericController<GroupingDto, GroupingCriteria> {

    @Autowired
    public GroupingController( GroupingService service ) {
        super( service );
    }


    @Override
    public ResponseEntity<DataDto<GroupingDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<GroupingDto>>> getAll(GroupingCriteria criteria) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> create(GroupingCreateDto groupingCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(GroupingUpdateDto groupingUpdateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }
}
