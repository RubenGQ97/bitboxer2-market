package com.bitboxer2.Bitboxer2market.Persistence.Mapper;

import com.bitboxer2.Bitboxer2market.domain.DTO.UsuarioDTO;
import com.bitboxer2.Bitboxer2market.Persistence.Entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ArticuloMapper.class})
public interface UsuarioMapper {

    @Mappings({
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "contrasenia", target = "passwd"),
            @Mapping(source = "articulosCreados", target = "createdItem")
    })
    UsuarioDTO toUsuarioDTO(Usuario usuario);
    List<UsuarioDTO> toUsuarioDtos(List<Usuario> usuarios);

    @InheritInverseConfiguration
    Usuario toUsuario(UsuarioDTO usuarioDTO);
    List<Usuario> toUsuarios(List<UsuarioDTO> usuarioDTOS);
}
