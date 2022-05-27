package uz.learn.learning_centre.dto.news;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.GenericDto;

@Getter
@Setter
public class NewsUpdateDto extends GenericDto {

    private Long updatedBy;

    private String tittle;

    private Long pictureId;

    private String description;


}
