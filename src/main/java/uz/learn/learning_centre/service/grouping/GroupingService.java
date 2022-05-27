package uz.learn.learning_centre.service.grouping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import uz.learn.learning_centre.criteria.grouping.GroupingCriteria;
import uz.learn.learning_centre.dto.grouping.GroupingCreateDto;
import uz.learn.learning_centre.dto.grouping.GroupingDto;
import uz.learn.learning_centre.dto.grouping.GroupingUpdateDto;
import uz.learn.learning_centre.entity.Grouping;
import uz.learn.learning_centre.exceptions.NotFoundException;
import uz.learn.learning_centre.mapper.grouping.GroupingMapper;
import uz.learn.learning_centre.repository.grouping.GroupingRepository;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.base.AbstractService;
import uz.learn.learning_centre.service.base.GenericCrudService;
import uz.learn.learning_centre.service.base.GenericService;
import uz.learn.learning_centre.validator.grouping.GroupingValidator;

import java.util.List;
import java.util.Optional;

@Service
public class GroupingService extends AbstractService<GroupingMapper, GroupingValidator, GroupingRepository>
        implements GenericCrudService<GroupingDto, GroupingCreateDto, GroupingUpdateDto>,
        GenericService<GroupingDto, GroupingCriteria> {

    @Autowired
    public GroupingService(GroupingMapper mapper , GroupingValidator validator , GroupingRepository repository ) {
        super( mapper , validator , repository );
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

    @Override
    public ResponseEntity<DataDto<GroupingDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<GroupingDto>>> getAll(GroupingCriteria criteria) {
        return null;
    }
}
