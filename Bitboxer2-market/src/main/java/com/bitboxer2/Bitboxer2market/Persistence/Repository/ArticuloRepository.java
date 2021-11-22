package com.bitboxer2.Bitboxer2market.Persistence.Repository;

import com.bitboxer2.Bitboxer2market.Persistence.Crud.ArticuloCrudRepository;
import com.bitboxer2.Bitboxer2market.domain.DTO.ArticuloDTO;
import com.bitboxer2.Bitboxer2market.domain.repository.ItemRepository;
import com.bitboxer2.Bitboxer2market.Persistence.Mapper.ArticuloMapper;
import com.bitboxer2.Bitboxer2market.Persistence.Entity.Articulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ArticuloRepository implements ItemRepository {

    @Autowired
    private ArticuloCrudRepository articuloCrudRepository;
    @Autowired
    private ArticuloMapper articuloMapper;

    @Override
    public List<ArticuloDTO> getAll(){
        return articuloMapper.toArticuloDtos((List<Articulo>) articuloCrudRepository.findAll());
    }

    @Override
    public  List<ArticuloDTO> getArticulosByCodigo(int codigo){
        return articuloMapper.toArticuloDtos((List<Articulo>)articuloCrudRepository.findByCodigo(codigo));
    }
    @Override
    public Optional<ArticuloDTO> getArticuloById(int idArticulo){

        return articuloCrudRepository.findById(idArticulo).map(articulo -> articuloMapper.toArticuloDTO(articulo));
    }
    @Override
    public void saveArticulo(ArticuloDTO articuloDTO){
        articuloCrudRepository.save(articuloMapper.toArticulo(articuloDTO));
    }
}
