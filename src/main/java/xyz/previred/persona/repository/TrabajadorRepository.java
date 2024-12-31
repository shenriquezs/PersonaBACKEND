package xyz.previred.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import xyz.previred.persona.model.Trabajador;

@Repository
public interface TrabajadorRepository extends JpaRepository<Trabajador, Long> {
}
