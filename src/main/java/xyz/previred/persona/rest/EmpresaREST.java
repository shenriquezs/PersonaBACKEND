package xyz.previred.persona.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.previred.persona.model.Empresa;
import xyz.previred.persona.service.EmpresaService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/empresas/")
public class EmpresaREST {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    private ResponseEntity<List<Empresa>> getAllEmpresas (){
        return ResponseEntity.ok(empresaService.findAll());
    }



    @PostMapping
    private ResponseEntity<Empresa> saveEmpresa (@RequestBody Empresa empresa){
        try {
            Empresa empresaGuardada = empresaService.save(empresa);
            return ResponseEntity.created(new URI("/empresa/"+empresaGuardada.getId())).body(empresaGuardada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping (value = "delete/{id}")
    private ResponseEntity<Boolean> deleteEmpresa (@PathVariable ("id") Long id){
        return ResponseEntity.ok(empresaService.deleteById(id));
    }

}
