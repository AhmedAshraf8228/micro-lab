package iti.jets.product.mapper;




import iti.jets.product.dto.UserDTO;
import iti.jets.product.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring" )
public interface UserMapper {
    UserDTO toDTO(User user);
    User toEntity(UserDTO dto);
    List<UserDTO> toDTOs(List<User> users);
    List<User> toEntities(List<UserDTO> userDTOs);
}
