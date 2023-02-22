package com.recetario.recetario.model.service;

import com.recetario.recetario.model.domain.RecetaEntity;
import com.recetario.recetario.model.repository.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecetaServiceImplement implements RecetaService {

    @Autowired
    private RecetaRepository recetaRepository;

    @Override
    public RecetaEntity saveReceta(RecetaEntity recetaEntity) {
        return recetaRepository.save(recetaEntity);
    }

    @Override
    public void deleteReceta(int id) {
       recetaRepository.deleteById(id);
    }

    @Override
    public List<RecetaEntity> getAllRecetas() {
        List<RecetaEntity> recetaEntityList = recetaRepository.findAll();
        return recetaEntityList;
    }

    @Override
    public Optional<RecetaEntity> getOneReceta(int id) {
        return recetaRepository.findById(id);
    }
}
