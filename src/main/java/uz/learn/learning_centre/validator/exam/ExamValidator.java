package uz.learn.learning_centre.validator.exam;

import org.springframework.stereotype.Component;
import uz.learn.learning_centre.dto.exam.ExamCreateDto;
import uz.learn.learning_centre.dto.exam.ExamDto;
import uz.learn.learning_centre.dto.exam.ExamUpdateDto;
import uz.learn.learning_centre.entity.Exam;
import uz.learn.learning_centre.exceptions.BadRequestException;
import uz.learn.learning_centre.validator.base.GenericValidator;

import java.util.Objects;


@Component
public class ExamValidator implements GenericValidator<Exam, ExamDto, ExamCreateDto, ExamUpdateDto, Long> {


    @Override
    public void validOnUpdate(ExamUpdateDto examUpdateDto) {

    }

    @Override
    public void validOnCreate(ExamCreateDto examCreateDto) {

    }

    @Override
    public void validOnId(Long id) {

    }
}
