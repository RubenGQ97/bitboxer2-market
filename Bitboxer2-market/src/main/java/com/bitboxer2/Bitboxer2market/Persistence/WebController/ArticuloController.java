package com.bitboxer2.Bitboxer2market.Persistence.WebController;


import com.bitboxer2.Bitboxer2market.domain.DTO.ArticuloDTO;
import com.bitboxer2.Bitboxer2market.domain.Service.ArticuloDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articulos")
public class ArticuloController {

    @Autowired
    private ArticuloDTOService articuloDTOService;

    @GetMapping("all")
    public List<ArticuloDTO> getAll(){
        return articuloDTOService.getAll();
    }

    /*@GetMapping("id")
    public ArticuloDTO getArticuloById(){
        return articuloDTOService.getArticuloById();
    }*/


    @GetMapping("prueba")
    public String prueba(){
        return "hola";
    }
}
