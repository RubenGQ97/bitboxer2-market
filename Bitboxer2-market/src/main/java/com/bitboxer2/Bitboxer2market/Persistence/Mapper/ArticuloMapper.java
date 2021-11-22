package com.bitboxer2.Bitboxer2market.Persistence.Mapper;

import com.bitboxer2.Bitboxer2market.domain.DTO.ArticuloDTO;
import com.bitboxer2.Bitboxer2market.Persistence.Entity.Articulo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UsuarioMapper.class, ProveedorMapper.class, ReduccionMapper.class})
public interface ArticuloMapper {

    @Mappings({
            @Mapping(source = "idArticulo", target = "itemId"),
            @Mapping(source = "codigo", target = "code"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "fechaDeCreacion", target = "dateOfCreation"),
            @Mapping(source = "creador", target = "creator"),
            @Mapping(source = "proveedor", target = "suplier"),
            @Mapping(source = "reduccion", target = "reduction")
    })
    ArticuloDTO toArticuloDTO(Articulo articulo);
    List<ArticuloDTO> toArticuloDtos(List<Articulo> articulos);

    @InheritInverseConfiguration
    Articulo toArticulo(ArticuloDTO articuloDTO);
    List<Articulo> toArticulos(List<ArticuloDTO> articulosDTO);
}
