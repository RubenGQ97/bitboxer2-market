package com.bitboxer2.Bitboxer2market.Persistence.Crud;

import com.bitboxer2.Bitboxer2market.Persistence.Entity.Articulo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticuloCrudRepository extends CrudRepository<Articulo,Integer> {

    List<Articulo> findByCodigo(int codigo);
}
