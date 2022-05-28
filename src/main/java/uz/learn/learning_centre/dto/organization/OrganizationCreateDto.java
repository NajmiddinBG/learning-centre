package uz.learn.learning_centre.dto.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.BaseDto;

import javax.persistence.Column;

/**
 * @author Botirov Najmiddin, Fri 11:48 PM. 5/27/2022
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationCreateDto implements BaseDto {
    private String name;

    private String logo;

    private String registrationNumber;

    private String phoneNumber;

    private Boolean blocked;
}
