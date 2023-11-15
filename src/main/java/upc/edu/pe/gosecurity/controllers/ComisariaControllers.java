package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.ComisariaDTO;
import upc.edu.pe.gosecurity.dtos.DCPxDTO;
import upc.edu.pe.gosecurity.entities.Comisaria;
import upc.edu.pe.gosecurity.servicesInterfaces.IComisariaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Comisaria")
public class ComisariaControllers {

    @Autowired
    private IComisariaService cS;
    @PostMapping
    public void Registrar(@RequestBody ComisariaDTO dto){
        ModelMapper m= new ModelMapper();
        Comisaria p=m.map(dto, Comisaria.class);
        cS.insert(p);
    }
    @GetMapping
    public List<ComisariaDTO> list() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComisariaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public ComisariaDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ComisariaDTO dto = m.map(cS.listId(id), ComisariaDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ComisariaDTO dto){
        ModelMapper m = new ModelMapper();
        Comisaria c = m.map(dto, Comisaria.class);
        cS.insert(c);
    }
    @GetMapping("/cantidadDCP")
    public List<DCPxDTO> cantidadDCP(){
        List<String[]> lista=cS.FindByDenunciasComisariaPolicia();
        List<DCPxDTO> listaDTO=new ArrayList<>();
        for (String[] data:lista){
            DCPxDTO dto= new DCPxDTO();
            dto.setId_comisaria(Integer.parseInt(data[0]));
            dto.setNombre_c(data[1]);
            dto.setCant_policia(Integer.parseInt(data[2]));
            dto.setCant_denuncias(Integer.parseInt(data[3]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
