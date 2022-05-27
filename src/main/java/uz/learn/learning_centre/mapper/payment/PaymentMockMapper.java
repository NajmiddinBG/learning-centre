package uz.learn.learning_centre.mapper.payment;

import org.mapstruct.Mapper;
import uz.learn.learning_centre.dto.paymentMock.PaymentMockCreateDto;
import uz.learn.learning_centre.dto.paymentMock.PaymentMockDto;
import uz.learn.learning_centre.dto.paymentMock.PaymentMockUpdateDto;
import uz.learn.learning_centre.entity.PaymentMock;
import uz.learn.learning_centre.mapper.base.GenericMapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaymentMockMapper extends GenericMapper<PaymentMock, PaymentMockDto, PaymentMockCreateDto, PaymentMockUpdateDto> {


    @Override
    PaymentMock fromDto(PaymentMockDto dto);

    @Override
    List<PaymentMock> fromDto(List<PaymentMockDto> dtos);

    @Override
    PaymentMockDto toDto(PaymentMock entity);

    @Override
    List<PaymentMockDto> toDto(List<PaymentMock> entities);

    @Override
    PaymentMock fromUpdateDto(PaymentMockUpdateDto paymentMockUpdateDto);


    @Override
    List<PaymentMock> fromUpdateDto(List<PaymentMockUpdateDto> ud);

    @Override
    PaymentMock fromCreateDto(PaymentMockCreateDto paymentMockCreateDto);

    @Override
    List<PaymentMock> fromCreateDto(List<PaymentMockCreateDto> cd);
}
