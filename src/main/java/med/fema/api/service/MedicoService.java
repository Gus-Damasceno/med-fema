package med.fema.api.service;

import med.fema.api.entity.Medico;
import med.fema.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public List<Medico> getAll(){
        return medicoRepository.findAll();
    }
    public Optional<Medico> getById(Long id){
        return medicoRepository.findById(id);
    }

    public void create(Medico medico){
        Medico novoMedico = medico;

        medicoRepository.save(medico);
    }

}
