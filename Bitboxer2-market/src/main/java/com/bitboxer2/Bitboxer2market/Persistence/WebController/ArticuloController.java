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
    @CrossOrigin(origins = "http://localhost:3000")
    public ArticuloDTO getArticuloById(@PathVariable("itemid") int itemid){
        return (ArticuloDTO) articuloDTOService.getArticuloById(itemid);
    }


    @GetMapping("code/{code}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ArticuloDTO getArticuloByCode(@PathVariable("code") int code){
        return (ArticuloDTO) articuloDTOService.getArticuloByCode(code);
    }

    @PostMapping("save")
    public void save(@RequestBody ArticuloDTO articuloDTO){
        ArticuloDTO prueba = articuloDTO;
        articuloDTOService.save(articuloDTO);
    }



}
