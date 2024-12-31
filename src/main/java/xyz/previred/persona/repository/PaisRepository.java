package xyz.previred.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import xyz.previred.persona.model.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long>{

}
