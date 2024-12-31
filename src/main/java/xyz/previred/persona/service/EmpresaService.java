package xyz.previred.persona.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import xyz.previred.persona.model.Empresa;

import xyz.previred.persona.repository.EmpresaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;


    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public List<Empresa> findAll(Sort sort) {
        return empresaRepository.findAll(sort);
    }


    public Page<Empresa> findAll(Pageable pageable) {
        return empresaRepository.findAll(pageable);
    }

    public <S extends Empresa> S save(S entity) {
        return empresaRepository.save(entity);
    }

    public Optional<Empresa> findById(Long id) {
        return empresaRepository.findById(id);
    }


    public Boolean deleteById(Long id) {
        if (empresaRepository.existsById(id)) {
            empresaRepository.deleteById(id);
            return !empresaRepository.existsById(id);
        }
        return false;
    }

    public void delete(Empresa entity) {
        empresaRepository.delete(entity);
    }
}
