package com.recetario.recetario.model.service;

import com.recetario.recetario.model.domain.RecetaEntity;

import java.util.List;
import java.util.Optional;

public interface RecetaService {

    RecetaEntity saveReceta(RecetaEntity recetaEntity);

    void deleteReceta(int id);

    List<RecetaEntity> getAllRecetas();

    Optional<RecetaEntity> getOneReceta(int id);

}
