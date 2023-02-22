package com.recetario.recetario.model.repository;

import com.recetario.recetario.model.domain.RecetaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RecetaRepository extends JpaRepository<RecetaEntity, Integer> {
    void delete(Optional<RecetaEntity> recetaEntity);
}
