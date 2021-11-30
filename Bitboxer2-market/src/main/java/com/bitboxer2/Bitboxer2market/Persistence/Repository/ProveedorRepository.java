package com.bitboxer2.Bitboxer2market.Persistence.Repository;

import com.bitboxer2.Bitboxer2market.Persistence.Crud.SuplierCrudRepository;
import com.bitboxer2.Bitboxer2market.Persistence.Entity.Proveedor;
import com.bitboxer2.Bitboxer2market.domain.DTO.ArticuloDTO;
import com.bitboxer2.Bitboxer2market.domain.DTO.ProveedorDTO;
import com.bitboxer2.Bitboxer2market.domain.repository.SuplierRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProveedorRepository implements SuplierRepository {

    @Autowired
    private SuplierCrudRepository suplierCrudRepository;

    @Override
    public Integer getIdByNombre(String name) {
        return suplierCrudRepository.findByNombre(name).getIdProveedor();
    }

    @Override
    public List<ProveedorDTO> getAll() {
        List<ProveedorDTO> result = new ArrayList<ProveedorDTO>();
        for (Proveedor p:suplierCrudRepository.findAll()) {
            result.add(pojotoDTO(p));
        }
        return result;
    }




    private ProveedorDTO pojotoDTO(Proveedor proveedor){
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(proveedor);
            ProveedorDTO result =mapper.readValue(json, ProveedorDTO.class);
            return result;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
