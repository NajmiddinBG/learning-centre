package uz.learn.learning_centre.mapper.speciality;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import uz.learn.learning_centre.dto.speciality.SpecialityCreateDto;
import uz.learn.learning_centre.dto.speciality.SpecialityDto;
import uz.learn.learning_centre.dto.speciality.SpecialityUpdateDto;
import uz.learn.learning_centre.entity.Speciality;
import uz.learn.learning_centre.mapper.base.GenericMapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SpecialityMapper extends GenericMapper<Speciality, SpecialityDto, SpecialityCreateDto, SpecialityUpdateDto> {

    @Override
    default Speciality fromDto(SpecialityDto dto) {
        return null;
    }

    @Override
    default List<Speciality> fromDto(List<SpecialityDto> dtos) {
        return null;
    }

    @Override
    default SpecialityDto toDto(Speciality entity) {
        return null;
    }

    @Override
    default List<SpecialityDto> toDto(List<Speciality> entities) {
        return null;
    }

    @Override
    default Speciality fromUpdateDto(SpecialityUpdateDto specialityUpdateDto) {
        return null;
    }

    @Override
    default Speciality fromUpdateDto(SpecialityUpdateDto specialityUpdateDto,@MappingTarget Speciality speciality) {
        return null;
    }

    @Override
    default List<Speciality> fromUpdateDto(List<SpecialityUpdateDto> ud) {
        return null;
    }

    @Override
    default Speciality fromCreateDto(SpecialityCreateDto specialityCreateDto) {
        return null;
    }

    @Override
    default List<Speciality> fromCreateDto(List<SpecialityCreateDto> cd) {
        return null;
    }
}
