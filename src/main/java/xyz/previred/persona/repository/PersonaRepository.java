package xyz.previred.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import xyz.previred.persona.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
