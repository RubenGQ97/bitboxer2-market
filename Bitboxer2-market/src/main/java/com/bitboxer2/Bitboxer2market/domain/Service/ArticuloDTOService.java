package com.bitboxer2.Bitboxer2market.domain.Service;


import com.bitboxer2.Bitboxer2market.domain.DTO.ArticuloDTO;
import com.bitboxer2.Bitboxer2market.domain.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloDTOService {
    @Autowired
    private ItemRepository itemRepository;

    public List<ArticuloDTO> getAll(){
        return itemRepository.getAll();
    }

    public ArticuloDTO getArticuloByCode(int code){
        return itemRepository.getArticulosByCodigo(code);
    }

    public void saveArticulo(ArticuloDTO articuloDTO){
        itemRepository.saveArticulo(articuloDTO);
    }

    public ArticuloDTO getArticuloById(int codigo){
        return itemRepository.getArticuloById(codigo);
    }

    public void save(ArticuloDTO articuloDTO){
        itemRepository.saveArticulo(articuloDTO);
    }

    public List<ArticuloDTO> getTable(){
        return itemRepository.getTable();
    }

}
