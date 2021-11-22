package com.bitboxer2.Bitboxer2market.Persistence.Mapper;

import com.bitboxer2.Bitboxer2market.domain.DTO.ProveedorDTO;
import com.bitboxer2.Bitboxer2market.Persistence.Entity.Proveedor;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ArticuloMapper.class})
public interface ProveedorMapper {
    @Mappings({
            @Mapping(source = "idProveedor", target = "suplierid"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "pais", target = "country"),
            @Mapping(source = "articulo", target = "item")
    })
    ProveedorDTO toProveedorDto(Proveedor proveedor);
    List<ProveedorDTO> toProveedorDtos(List<Proveedor> proveedores);

    @InheritInverseConfiguration
    Proveedor toProveedor(ProveedorDTO proveedorDTO);
    List<Proveedor> toProveedores(List<ProveedorDTO> proveedorDTOS);
}
