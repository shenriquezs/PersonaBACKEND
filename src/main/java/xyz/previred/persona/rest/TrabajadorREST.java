package xyz.previred.persona.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.previred.persona.model.Trabajador;
import xyz.previred.persona.service.TrabajadorService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/trabajador/")
public class TrabajadorREST {

    @Autowired
    private TrabajadorService trabajadorService;

    @GetMapping
    private ResponseEntity<List<Trabajador>> getAllTrabajadores (){
        return ResponseEntity.ok(trabajadorService.findAll());
    }

    @PostMapping
    private ResponseEntity<Trabajador> saveTrabajador (@RequestBody Trabajador trabajador){
        try {
            Trabajador trabajadorGuardado = trabajadorService.save(trabajador);
            return ResponseEntity.created(new URI("/trabajadores/"+trabajadorGuardado.getId())).body(trabajadorGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping (value = "delete/{id}")
    private ResponseEntity<Boolean> deleteTrabajador (@PathVariable ("id") Long id){
        return ResponseEntity.ok(trabajadorService.deleteById(id));
    }
}
