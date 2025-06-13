package iti.jets.user.mapper;



import iti.jets.user.dto.OrderDTO;
import iti.jets.user.entity.Order;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    @Mapping(source = "user.userId", target = "userId")
    OrderDTO toDTO(Order order);

    @Mapping(source = "userId", target = "user.userId")
    Order toEntity(OrderDTO dto);

    List<OrderDTO> toDTOs(List<Order> orders);

    List<Order> toEntities(List<OrderDTO> orderDTOs);
}
