package com.recetario.recetario.model.repository;

import com.recetario.recetario.model.domain.RecetaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RecetaRepository extends MongoRepository<RecetaEntity, Integer> {
}
