package uz.learn.learning_centre.mapper.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mapstruct.Mapper;
import uz.learn.learning_centre.dto.organization.OrganizationCreateDto;
import uz.learn.learning_centre.dto.organization.OrganizationDto;
import uz.learn.learning_centre.dto.organization.OrganizationUpdateDto;
import uz.learn.learning_centre.entity.Organization;
import uz.learn.learning_centre.mapper.base.GenericMapper;

/**
 * @author Botirov Najmiddin, Fri 11:54 PM. 5/27/2022
 */
@Mapper(componentModel = "spring")
public interface OrganizationMapper extends GenericMapper<Organization, OrganizationDto, OrganizationCreateDto, OrganizationUpdateDto> {

}
