package uz.learn.learning_centre.dto.pictures;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;
import uz.learn.learning_centre.dto.base.BaseDto;

@Getter
@Setter
@AllArgsConstructor
public class PictureCreateDto implements BaseDto {
    private MultipartFile file;
}
