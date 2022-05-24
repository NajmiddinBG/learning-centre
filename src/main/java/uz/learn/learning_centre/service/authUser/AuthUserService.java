package uz.learn.learning_centre.service.authUser;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.learn.learning_centre.criteria.authUser.AuthUserCriteria;
import uz.learn.learning_centre.dto.auth.AuthUserCreateDto;
import uz.learn.learning_centre.dto.auth.AuthUserDto;
import uz.learn.learning_centre.dto.auth.AuthUserUpdateDto;
import uz.learn.learning_centre.entity.AuthUser;
import uz.learn.learning_centre.enums.AuthRole;
import uz.learn.learning_centre.exceptions.NotFoundException;
import uz.learn.learning_centre.mapper.authUser.AuthUserMapper;
import uz.learn.learning_centre.repository.authUser.AuthUserRepository;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.base.AbstractService;
import uz.learn.learning_centre.service.base.GenericCrudService;
import uz.learn.learning_centre.service.base.GenericService;
import uz.learn.learning_centre.validator.authUser.AuthUserValidator;

import java.util.List;
import java.util.Objects;

@Service
public class AuthUserService extends AbstractService<AuthUserMapper, AuthUserValidator, AuthUserRepository> implements GenericCrudService<AuthUserDto, AuthUserCreateDto, AuthUserUpdateDto>, GenericService<AuthUserDto, AuthUserCriteria> {


    public AuthUserService( AuthUserMapper mapper , AuthUserValidator validator , AuthUserRepository repository) {
        super( mapper , validator , repository );
    }

    @Override
    public ResponseEntity<DataDto<Long>> create( AuthUserCreateDto authUserCreateDto ) {
        validator.validOnCreate( authUserCreateDto );
        AuthUser authUser = mapper.fromCreateDto( authUserCreateDto );
        AuthUser save = repository.save( authUser );
        return new ResponseEntity<>( new DataDto<>( save.getId() ) );
    }


    @Override
    public ResponseEntity<DataDto<Long>> update( AuthUserUpdateDto authUserUpdateDto ) {
        validator.validOnUpdate( authUserUpdateDto );
        AuthUser auth = repository.findById( authUserUpdateDto.getId() ).orElseThrow( () -> {
            throw new NotFoundException( "User not found" );
        } );
        AuthUser authUser = mapper.fromUpdateDto( authUserUpdateDto , auth );
        AuthUser save = repository.save( authUser );
        return new ResponseEntity<>( new DataDto<>( save.getId() ) );
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete( Long id ) {
        validator.validOnId( id );
        repository.deleteById( id );
        return new ResponseEntity<>( new DataDto<>( Boolean.valueOf( true ) ) );
    }

    @Override
    public ResponseEntity<DataDto<AuthUserDto>> get( Long id ) {
        validator.validOnId( id );
        AuthUser authUser = repository.findById( id ).orElseThrow( () -> {
            throw new NotFoundException( "user not found" );
        } );
        AuthUserDto authUserDto = mapper.toDto( authUser );
        return new ResponseEntity<>( new DataDto<>( authUserDto ) );
    }

    @Override
    public ResponseEntity<DataDto<List<AuthUserDto>>> getAll( AuthUserCriteria criteria ) {
        Pageable pageable = PageRequest.of( criteria.getPage() , criteria.getSize() );
        List<AuthUser> authUserList;
        if ( Objects.nonNull( criteria.getRole() ) && AuthRole.isAuthRole( criteria.getRole() ) ) {
            authUserList = repository.findAllByRole( criteria.getRole() , pageable );
        } else {
            authUserList = repository.findAll( pageable ).getContent();
        }
        List<AuthUserDto> authUserDtoList = mapper.toDto( authUserList );
        return new ResponseEntity<>( new DataDto<>( authUserDtoList ) );
    }

}
