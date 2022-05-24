package uz.learn.learning_centre.dto.pictures;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import uz.learn.learning_centre.dto.base.GenericDto;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PictureDto extends GenericDto {
    private CommonsMultipartFile file;
}
