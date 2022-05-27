package uz.learn.learning_centre.mapper.mock;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import uz.learn.learning_centre.dto.mock.MockCreateDto;
import uz.learn.learning_centre.dto.mock.MockDto;
import uz.learn.learning_centre.dto.mock.MockUpdateDto;
import uz.learn.learning_centre.entity.Mock;
import uz.learn.learning_centre.mapper.base.GenericMapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MockMapper extends GenericMapper<Mock, MockDto, MockCreateDto, MockUpdateDto> {

    @Override
    Mock fromDto(MockDto dto);

    @Override
    List<Mock> fromDto(List<MockDto> dtos);

    @Override
    MockDto toDto(Mock entity);

    @Override
    List<MockDto> toDto(List<Mock> entities);

    @Override
    @Mapping(target = "date", ignore = true)
    Mock fromUpdateDto(MockUpdateDto mockUpdateDto, @MappingTarget Mock mock);

    @Override
    List<Mock> fromUpdateDto(List<MockUpdateDto> ud);

    @Override
    @Mapping(target = "date", ignore = true)
    Mock fromCreateDto(MockCreateDto mockCreateDto);

    @Override
    List<Mock> fromCreateDto(List<MockCreateDto> cd);
}
