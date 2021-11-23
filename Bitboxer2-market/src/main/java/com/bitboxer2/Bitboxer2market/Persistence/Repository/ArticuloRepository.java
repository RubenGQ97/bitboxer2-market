package com.bitboxer2.Bitboxer2market.Persistence.Repository;

import com.bitboxer2.Bitboxer2market.Persistence.Crud.ArticuloCrudRepository;
import com.bitboxer2.Bitboxer2market.domain.DTO.ArticuloDTO;
import com.bitboxer2.Bitboxer2market.domain.repository.ItemRepository;
import com.bitboxer2.Bitboxer2market.Persistence.Entity.Articulo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticuloRepository implements ItemRepository {

    @Autowired
    private ArticuloCrudRepository articuloCrudRepository;

    /*@Autowired
    private ArticuloMapper articuloMapper;*/

    @Override
    public List<ArticuloDTO> getAll(){

        List<Articulo> articulos = (List<Articulo>) articuloCrudRepository.findAll();
        List<ArticuloDTO> articuloDTOS= new ArrayList<ArticuloDTO>();
        for (Articulo lista :articulos) {
            articuloDTOS.add(toArticuloDTO(lista));
        }
        return articuloDTOS;
    }

    @Override
    public List<ArticuloDTO> getTable() {
        //List<String> result = articuloCrudRepository.getAllCodigo();
        return null;
    }

    @Override
    public  ArticuloDTO getArticulosByCodigo(int codigo){
        Articulo result = articuloCrudRepository.findByCodigo(codigo);
        return toArticuloDTO(result);
    }

    @Override
    public ArticuloDTO getArticuloById(int idArticulo){
        Articulo result = articuloCrudRepository.findById(idArticulo);
        return toArticuloDTO(result);
    }
    @Override
    public void saveArticulo(ArticuloDTO articuloDTO){
        articuloCrudRepository.save(toArticulo(articuloDTO));
    }





    /*Transformaciones de DTOS a POJOS y VICEVERSA*/


    private ArticuloDTO toArticuloDTO(Articulo articulo){
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(articulo);
            ArticuloDTO result =mapper.readValue(json, ArticuloDTO.class);
            toArticulo(result);
            return result;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }



    private Articulo toArticulo(ArticuloDTO articuloDTO){
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(articuloDTO);
            Articulo result =mapper.readValue(json, Articulo.class);
            return result;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
