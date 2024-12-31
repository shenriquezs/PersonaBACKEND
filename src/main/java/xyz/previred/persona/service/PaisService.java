package xyz.previred.persona.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.previred.persona.model.Pais;
import xyz.previred.persona.repository.PaisRepository;

import java.util.List;

@Service
public class PaisService {
	

	@Autowired
	private PaisRepository paisRepository;


	public List<Pais> findAll() {
		return paisRepository.findAll();
	}


}
