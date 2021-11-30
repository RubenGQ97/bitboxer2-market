package com.bitboxer2.Bitboxer2market.Persistence.Crud;

import com.bitboxer2.Bitboxer2market.Persistence.Entity.Proveedor;
import org.springframework.data.repository.CrudRepository;

public interface SuplierCrudRepository extends CrudRepository<Proveedor,Integer> {

    Proveedor findByNombre(String name);
}
