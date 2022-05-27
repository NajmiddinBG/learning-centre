package uz.learn.learning_centre.validator.lesson;

import org.springframework.stereotype.Component;
import uz.learn.learning_centre.dto.lesson.LessonCreateDto;
import uz.learn.learning_centre.dto.lesson.LessonDto;
import uz.learn.learning_centre.dto.lesson.LessonUpdateDto;
import uz.learn.learning_centre.entity.Lesson;
import uz.learn.learning_centre.exceptions.BadRequestException;
import uz.learn.learning_centre.validator.base.GenericValidator;

import java.util.Objects;


@Component
public class LessonValidator implements GenericValidator<Lesson, LessonDto, LessonCreateDto, LessonUpdateDto, Long> {


    @Override
    public void validOnUpdate(LessonUpdateDto lessonUpdateDto) {

    }

    @Override
    public void validOnCreate(LessonCreateDto lessonCreateDto) {

    }

    @Override
    public void validOnId(Long id) {

    }
}
