package uz.learn.learning_centre.dto.mock;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.GenericDto;

@Getter
@Setter
public class MockUpdateDto extends GenericDto {

    private String name;

    private String date;

    private String location;

    private String beginTime;

    private String endTime;

}
