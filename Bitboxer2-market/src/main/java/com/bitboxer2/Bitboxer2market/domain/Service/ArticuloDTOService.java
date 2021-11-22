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

    public Optional<ArticuloDTO> getArticulo(int articuloId){
        return itemRepository.getArticuloById(articuloId);
    }

    public void saveArticulo(ArticuloDTO articuloDTO){
        itemRepository.saveArticulo(articuloDTO);
    }

    public List<ArticuloDTO> getArticuloById(int codigo){
        return itemRepository.getArticulosByCodigo(codigo);
    }

}
