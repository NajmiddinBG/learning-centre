package uz.learn.learning_centre.mapper.lesson;


import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import uz.learn.learning_centre.dto.lesson.LessonCreateDto;
import uz.learn.learning_centre.dto.lesson.LessonDto;
import uz.learn.learning_centre.dto.lesson.LessonUpdateDto;
import uz.learn.learning_centre.entity.Lesson;
import uz.learn.learning_centre.mapper.base.GenericMapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LessonMapper extends GenericMapper<Lesson, LessonDto, LessonCreateDto, LessonUpdateDto> {


    @Override
    Lesson fromDto(LessonDto dto);

    @Override
    List<Lesson> fromDto(List<LessonDto> dtos);

    @Override
    LessonDto toDto(Lesson entity);

    @Override
    List<LessonDto> toDto(List<Lesson> entities);

    @Override
    Lesson fromUpdateDto(LessonUpdateDto lessonUpdateDto);

    @Override
    Lesson fromUpdateDto(LessonUpdateDto lessonUpdateDto,@MappingTarget Lesson lesson);

    @Override
    List<Lesson> fromUpdateDto(List<LessonUpdateDto> ud);

    @Override
    Lesson fromCreateDto(LessonCreateDto lessonCreateDto);

    @Override
    List<Lesson> fromCreateDto(List<LessonCreateDto> cd);
}
