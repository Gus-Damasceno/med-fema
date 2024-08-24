package med.fema.api.controller;

import med.fema.api.entity.Medico;
import med.fema.api.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    MedicoService medicoService;

    @GetMapping()
    public ResponseEntity<List<Medico>> listarTodos(){
        List<Medico> medicos = medicoService.getAll();
        return ResponseEntity.ok().body(medicos);
    }

    @PostMapping()
    public void criarNovo(@RequestBody Medico medico){

        medicoService.create(medico);


    }

}
