package com.bitboxer2.Bitboxer2market.Persistence.Crud;

import com.bitboxer2.Bitboxer2market.Persistence.Entity.Articulo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticuloCrudRepository extends CrudRepository<Articulo,Integer> {

    @Query("from Articulo where CAST(codigo as text) like CONCAT(:codigo, '%')")
    List<Articulo> findByCodigoStringStartsWith(String codigo);

    List<Articulo> findByEstado(boolean estado);
    Articulo findById(int idArticulo);
}
