package iti.jets.order.mapper;




import iti.jets.order.dto.UserDTO;
import iti.jets.order.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring" )
public interface UserMapper {
    UserDTO toDTO(User user);
    User toEntity(UserDTO dto);
    List<UserDTO> toDTOs(List<User> users);
    List<User> toEntities(List<UserDTO> userDTOs);
}
