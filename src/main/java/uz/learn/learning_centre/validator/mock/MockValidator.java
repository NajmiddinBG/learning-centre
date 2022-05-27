package uz.learn.learning_centre.validator.mock;

import org.springframework.stereotype.Component;
import uz.learn.learning_centre.dto.mock.MockCreateDto;
import uz.learn.learning_centre.dto.mock.MockDto;
import uz.learn.learning_centre.dto.mock.MockUpdateDto;
import uz.learn.learning_centre.entity.Mock;
import uz.learn.learning_centre.exceptions.BadRequestException;
import uz.learn.learning_centre.validator.base.GenericValidator;

import java.util.Objects;

@Component
public class MockValidator implements
        GenericValidator<Mock, MockDto, MockCreateDto, MockUpdateDto, Long> {


    @Override
    public void validOnUpdate(MockUpdateDto mockUpdateDto) {

    }

    @Override
    public void validOnCreate(MockCreateDto mockCreateDto) {

    }

    @Override
    public void validOnId(Long id) {

    }
}
