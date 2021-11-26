package com.bitboxer2.Bitboxer2market.Persistence.Repository;

import com.bitboxer2.Bitboxer2market.Persistence.Crud.UsuarioCrudRepository;
import com.bitboxer2.Bitboxer2market.Persistence.Entity.Usuario;
import com.bitboxer2.Bitboxer2market.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository implements UserRepository{

    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;

    @Override
    public String getPasswordByUserName(String nombre) {
        Usuario usuario=usuarioCrudRepository.findByNombre(nombre);
        return usuario.getContrasenia();
    }
}
