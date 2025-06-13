package iti.jets.order.mapper;




import iti.jets.order.dto.ProductDTO;
import iti.jets.order.entity.Product;
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
