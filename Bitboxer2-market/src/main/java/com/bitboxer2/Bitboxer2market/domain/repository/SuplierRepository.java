package com.bitboxer2.Bitboxer2market.domain.repository;

import com.bitboxer2.Bitboxer2market.Persistence.Entity.Proveedor;
import com.bitboxer2.Bitboxer2market.domain.DTO.ProveedorDTO;

import java.util.List;

public interface SuplierRepository {
    Integer getIdByNombre(String name);
    List<ProveedorDTO> getAll();
}
