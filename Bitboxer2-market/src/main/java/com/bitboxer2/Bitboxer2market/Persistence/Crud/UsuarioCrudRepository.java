package com.bitboxer2.Bitboxer2market.Persistence.Crud;

import com.bitboxer2.Bitboxer2market.Persistence.Entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer>{


    Usuario findByNombre(String nombre);
}
