package com.bitboxer2.Bitboxer2market.Persistence.WebController;


import com.bitboxer2.Bitboxer2market.Persistence.Repository.ProveedorRepository;
import com.bitboxer2.Bitboxer2market.Persistence.Repository.UsuarioRepository;
import com.bitboxer2.Bitboxer2market.domain.DTO.ArticuloDTO;
import com.bitboxer2.Bitboxer2market.domain.DTO.ProveedorDTO;
import com.bitboxer2.Bitboxer2market.domain.DTO.UsuarioDTO;
import com.bitboxer2.Bitboxer2market.domain.Service.ArticuloDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/articulos")
public class ArticuloController {

    @Autowired
    private ArticuloDTOService articuloDTOService;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ProveedorRepository proveedorRepository;


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
    public List<ArticuloDTO> getArticuloByCode(@PathVariable("code") int code){
        return articuloDTOService.getArticuloByCode(code);
    }


    @GetMapping("estado/{estado}")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<ArticuloDTO> getArticuloByEstado(@PathVariable("estado") boolean estado){
        return articuloDTOService.getArticuloByEstado(estado);
    }

    @PostMapping("save")
    @CrossOrigin(origins = "http://localhost:3000")
    public void save(@RequestBody ArticuloDTO articuloDTO){
        ArticuloDTO prueba = articuloDTO;
        if(prueba.getCreador().getIdUsuario()==null){
            prueba.getCreador().setIdUsuario(usuarioRepository.getIdByUserName(prueba.getCreador().getNombre()));
        }
        Set<ProveedorDTO> aux = new HashSet<ProveedorDTO>();
        if(prueba.getProveedor() != null ){
            for (ProveedorDTO p: prueba.getProveedor()) {
                if(p.getNombre()==null)continue;
                p.setIdProveedor(proveedorRepository.getIdByNombre(p.getNombre()));
                aux.add(p);
            }
        }
        articuloDTO.setProveedor(aux);
        articuloDTOService.save(articuloDTO);
    }



    @GetMapping("suplier")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<ProveedorDTO> getAllSuplier(){
        return proveedorRepository.getAll();
    }


}
