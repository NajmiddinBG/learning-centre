package uz.learn.learning_centre.validator.grouping;

import org.springframework.stereotype.Component;
import uz.learn.learning_centre.dto.grouping.GroupingCreateDto;
import uz.learn.learning_centre.dto.grouping.GroupingDto;
import uz.learn.learning_centre.dto.grouping.GroupingUpdateDto;
import uz.learn.learning_centre.entity.Grouping;
import uz.learn.learning_centre.exceptions.BadRequestException;
import uz.learn.learning_centre.validator.base.GenericValidator;

import java.util.Objects;

@Component
public class GroupingValidator implements GenericValidator<Grouping, GroupingDto, GroupingCreateDto, GroupingUpdateDto, Long> {

    @Override
    public void validOnUpdate(GroupingUpdateDto groupingUpdateDto) {

    }

    @Override
    public void validOnCreate(GroupingCreateDto groupingCreateDto) {

    }

    @Override
    public void validOnId(Long id) {

    }
}
