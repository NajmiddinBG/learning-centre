package uz.learn.learning_centre.mapper.grouping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;
import uz.learn.learning_centre.dto.grouping.GroupingCreateDto;
import uz.learn.learning_centre.dto.grouping.GroupingDto;
import uz.learn.learning_centre.dto.grouping.GroupingUpdateDto;
import uz.learn.learning_centre.entity.Grouping;
import uz.learn.learning_centre.mapper.base.GenericMapper;
import uz.learn.learning_centre.validator.base.BaseValidator;

import java.util.List;
@Component
@Mapper( componentModel = "spring")
public interface GroupingMapper extends GenericMapper<
        Grouping,
        GroupingDto,
        GroupingCreateDto,
        GroupingUpdateDto>, BaseValidator {

    @Override
    Grouping fromDto( GroupingDto dto );

    @Override
    List<Grouping> fromDto( List<GroupingDto> dtos );

    @Override
    GroupingDto toDto( Grouping entity );

    @Override
    List<GroupingDto> toDto( List<Grouping> entities );

    @Override
    Grouping fromUpdateDto( GroupingUpdateDto groupingUpdateDto );

    @Override
    List<Grouping> fromUpdateDto( List<GroupingUpdateDto> ud );

    @Override
    @Mapping( target = "students",ignore = true)
    Grouping fromUpdateDto( GroupingUpdateDto groupingUpdateDto , @MappingTarget Grouping grouping );

    @Override
    Grouping fromCreateDto( GroupingCreateDto groupingCreateDto );

    @Override
    List<Grouping> fromCreateDto( List<GroupingCreateDto> cd );
}
