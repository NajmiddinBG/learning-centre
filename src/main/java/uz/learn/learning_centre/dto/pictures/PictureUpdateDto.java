package uz.learn.learning_centre.dto.pictures;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;
import uz.learn.learning_centre.dto.base.GenericDto;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PictureUpdateDto extends GenericDto {
    MultipartFile file;
}
