package iti.jets.user.mapper;



import iti.jets.user.dto.ProductDTO;
import iti.jets.user.entity.Product;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(source = "order.orderId", target = "orderId")
    ProductDTO toDTO(Product product);

    @Mapping(source = "orderId", target = "order.orderId")
    Product toEntity(ProductDTO dto);

    List<ProductDTO> toDTOs(List<Product> products);

    List<Product> toEntities(List<ProductDTO> productDTOs);
}
