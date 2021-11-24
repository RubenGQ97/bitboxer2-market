package com.bitboxer2.Bitboxer2market.domain.repository;

import com.bitboxer2.Bitboxer2market.domain.DTO.ArticuloDTO;

import java.util.List;
import java.util.Optional;

public interface ItemRepository {

    public List<ArticuloDTO> getAll();
    public ArticuloDTO getArticulosByCodigo(int codigo);
    public ArticuloDTO getArticuloById(int idArticulo);
    public void saveArticulo(ArticuloDTO articuloDTO);
}
