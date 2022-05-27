package uz.learn.learning_centre.mapper.mockExam;

import org.mapstruct.Mapper;
import uz.learn.learning_centre.dto.mockExam.MockExamCreateDto;
import uz.learn.learning_centre.dto.mockExam.MockExamDto;
import uz.learn.learning_centre.dto.mockExam.MockExamUpdateDto;
import uz.learn.learning_centre.entity.MockExam;
import uz.learn.learning_centre.mapper.base.GenericMapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MockExamMapper extends GenericMapper<MockExam, MockExamDto, MockExamCreateDto, MockExamUpdateDto> {

    @Override
    MockExam fromDto(MockExamDto dto);

    @Override
    List<MockExam> fromDto(List<MockExamDto> dtos);

    @Override
    MockExamDto toDto(MockExam entity);

    @Override
    List<MockExamDto> toDto(List<MockExam> entities);

    @Override
    MockExam fromUpdateDto(MockExamUpdateDto mockExamUpdateDto);

    @Override
    List<MockExam> fromUpdateDto(List<MockExamUpdateDto> ud);

    @Override
    MockExam fromCreateDto(MockExamCreateDto mockExamCreateDto);

    @Override
    List<MockExam> fromCreateDto(List<MockExamCreateDto> cd);
}
