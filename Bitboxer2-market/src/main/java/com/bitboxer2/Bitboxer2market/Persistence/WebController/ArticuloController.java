package com.bitboxer2.Bitboxer2market.Persistence.WebController;


import com.bitboxer2.Bitboxer2market.domain.DTO.ArticuloDTO;
import com.bitboxer2.Bitboxer2market.domain.DTO.UsuarioDTO;
import com.bitboxer2.Bitboxer2market.domain.Service.ArticuloDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articulos")
public class ArticuloController {

    @Autowired
    private ArticuloDTOService articuloDTOService;

    @GetMapping("all")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<ArticuloDTO> getAll(){
        return articuloDTOService.getAll();
    }

    @GetMapping("/{itemid}")
    public ArticuloDTO getArticuloById(@PathVariable("itemid") int itemid){
        return (ArticuloDTO) articuloDTOService.getArticuloById(itemid);
    }


    @GetMapping("code/{code}")
    public List<ArticuloDTO> getArticuloByCode(@PathVariable("code") int code){
        return articuloDTOService.getArticuloByCode(code);
    }


    @GetMapping("estado/{estado}")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<ArticuloDTO> getArticuloByEstado(@PathVariable("estado") boolean estado){
        return articuloDTOService.getArticuloByEstado(estado);
    }

    @PostMapping("save")
    public void save(@RequestBody ArticuloDTO articuloDTO){
        ArticuloDTO prueba = articuloDTO;
        articuloDTOService.save(articuloDTO);
    }



}
