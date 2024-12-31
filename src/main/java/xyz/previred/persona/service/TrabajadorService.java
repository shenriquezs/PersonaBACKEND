package xyz.previred.persona.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;
import xyz.previred.persona.model.Trabajador;
import xyz.previred.persona.repository.TrabajadorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TrabajadorService {

    @Autowired
    private TrabajadorRepository trabajadorRepository;

    public List<Trabajador> findAll() {
        return trabajadorRepository.findAll();
    }

    public List<Trabajador> findAll(Sort sort) {
        return trabajadorRepository.findAll(sort);
    }


    public Page<Trabajador> findAll(Pageable pageable) {
        return trabajadorRepository.findAll(pageable);
    }

    public <S extends Trabajador> S save(S entity) {
        return trabajadorRepository.save(entity);
    }

    public Optional<Trabajador> findById(Long id) {
        return trabajadorRepository.findById(id);
    }


    public Boolean deleteById(Long id) {
        if (trabajadorRepository.existsById(id)) {
            trabajadorRepository.deleteById(id);
            return !trabajadorRepository.existsById(id);
        }
        return false;
    }

    public void delete(Trabajador entity) {
        trabajadorRepository.delete(entity);
    }



}
