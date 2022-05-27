package uz.learn.learning_centre.dto.news;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.BaseDto;

@Getter
@Setter
public class NewsCreateDto implements BaseDto {

    private Long createdBy;

    private String tittle;

    private Long pictureId;

    private String description;


}
