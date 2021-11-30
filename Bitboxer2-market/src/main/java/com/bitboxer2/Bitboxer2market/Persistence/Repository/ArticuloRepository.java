package com.bitboxer2.Bitboxer2market.Persistence.Repository;

import com.bitboxer2.Bitboxer2market.Persistence.Crud.ArticuloCrudRepository;
import com.bitboxer2.Bitboxer2market.Persistence.Entity.Proveedor;
import com.bitboxer2.Bitboxer2market.Persistence.Entity.Usuario;
import com.bitboxer2.Bitboxer2market.domain.DTO.ArticuloDTO;
import com.bitboxer2.Bitboxer2market.domain.DTO.ProveedorDTO;
import com.bitboxer2.Bitboxer2market.domain.repository.ItemRepository;
import com.bitboxer2.Bitboxer2market.Persistence.Entity.Articulo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class ArticuloRepository implements ItemRepository {

    @Autowired
    private ArticuloCrudRepository articuloCrudRepository;

    @Override
    public List<ArticuloDTO> getArticuloByState(boolean state) {
        List<ArticuloDTO> result = new ArrayList<ArticuloDTO>();
        for (Articulo a: articuloCrudRepository.findByEstado(state)) {
            result.add(toArticuloDTO(a));
        }
        return result;
    }

    @Override
    public List<ArticuloDTO> getAll(){
        List<ArticuloDTO> articuloDTOS= new ArrayList<ArticuloDTO>();
        for (Articulo lista :articuloCrudRepository.findAll()) {
            articuloDTOS.add(toArticuloDTO(lista));
        }
        return articuloDTOS;
    }



    @Override
    public  List<ArticuloDTO> getArticulosByCodigo(int codigo){
        List<ArticuloDTO> result= new ArrayList<ArticuloDTO>();
        for (Articulo a: articuloCrudRepository.findByCodigoStringStartsWith(codigo+"")) {
            result.add(toArticuloDTO(a));
        }
        return result;
    }

    @Override
    public ArticuloDTO getArticuloById(int idArticulo){
        Articulo result = articuloCrudRepository.findById(idArticulo);
        return toArticuloDTO(result);
    }
    @Override
    public void saveArticulo(ArticuloDTO articuloDTO){
        Articulo prueba= toArticulo(articuloDTO);
        articuloCrudRepository.save(prueba);
    }





    /*Transformaciones de DTOS a POJOS y VICEVERSA*/


    private ArticuloDTO toArticuloDTO(Articulo articulo){
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(articulo);
            ArticuloDTO result =mapper.readValue(json, ArticuloDTO.class);
            return result;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }



    private Articulo toArticulo(ArticuloDTO articuloDTO){


            Articulo result = new Articulo();
            Usuario aux = new Usuario();
            Set<Proveedor> aux2 = new HashSet<Proveedor>();
            if(articuloDTO.getCreador() != null)BeanUtils.copyProperties(articuloDTO.getCreador(),aux);
            if(articuloDTO.getProveedor() != null){
                for (ProveedorDTO p: articuloDTO.getProveedor()) {
                    Proveedor auxiliar= new Proveedor();
                    BeanUtils.copyProperties(p,auxiliar);
                    aux2.add(auxiliar);
                }
                result.setProveedor(aux2);
            }

            BeanUtils.copyProperties(articuloDTO, result);
            result.setCreador(aux);

            return result;
    }

}
