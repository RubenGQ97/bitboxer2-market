package com.bitboxer2.Bitboxer2market.Persistence.Mapper;

import com.bitboxer2.Bitboxer2market.domain.DTO.ReduccionDTO;
import com.bitboxer2.Bitboxer2market.Persistence.Entity.Reduccion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ArticuloMapper.class})
public interface ReduccionMapper {

    @Mappings({
            @Mapping(source = "idReduccion", target = "reductionId"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "fechaInicio", target = "startDate"),
            @Mapping(source = "fechaFin", target = "endDate"),
            @Mapping(source = "articulo", target = "item"),

    })
    ReduccionDTO toReduccionDto(Reduccion reduccion);
    List<ReduccionDTO> toReduccionDtos(List<Reduccion> reducciones);

    Reduccion toReduccion (ReduccionDTO reduccionDTO);
    List<Reduccion> toReduccions(List<ReduccionDTO> reduccionDTOS);

}
