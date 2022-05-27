package uz.learn.learning_centre.validator.mockExam;

import org.springframework.stereotype.Component;
import uz.learn.learning_centre.dto.mockExam.MockExamCreateDto;
import uz.learn.learning_centre.dto.mockExam.MockExamDto;
import uz.learn.learning_centre.dto.mockExam.MockExamUpdateDto;
import uz.learn.learning_centre.entity.MockExam;
import uz.learn.learning_centre.validator.base.GenericValidator;


@Component
public class MockExamValidator implements
        GenericValidator<MockExam, MockExamDto, MockExamCreateDto, MockExamUpdateDto, Long> {

    @Override
    public void validOnUpdate(MockExamUpdateDto mockExamUpdateDto) {
    }

    @Override
    public void validOnCreate(MockExamCreateDto mockExamCreateDto) {
    }

    @Override
    public void validOnId(Long id) {
    }
}
