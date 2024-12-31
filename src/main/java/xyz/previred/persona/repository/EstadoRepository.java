package xyz.previred.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import xyz.previred.persona.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

}
