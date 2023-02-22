package com.recetario.recetario.controller;

import com.recetario.recetario.model.domain.RecetaEntity;
import com.recetario.recetario.model.service.RecetaServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/recetas")
public class RecetarioController {

    @Autowired
    private RecetaServiceImplement recetaServiceImplement;

    @PostMapping("/add")
    public ResponseEntity<?> addReceta(@RequestBody RecetaEntity recetaEntity) {
        ResponseEntity<?> responseEntity = null;
        RecetaEntity savaReceta = recetaServiceImplement.saveReceta(recetaEntity);
        if (savaReceta != null) {
            responseEntity = ResponseEntity.status(HttpStatus.OK).body(savaReceta);
        }
        return responseEntity;
    }

    @GetMapping("/all")
    public ResponseEntity<?> allRecetas() {
        List<RecetaEntity> recetaEntityList = recetaServiceImplement.getAllRecetas();
        return new ResponseEntity<>(recetaEntityList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable(value = "id") Integer recetaId) {
        ResponseEntity<?> responseEntity = null;
        Optional<RecetaEntity> oneReceta = recetaServiceImplement.getOneReceta(recetaId);
        if (oneReceta == null) {
            responseEntity = ResponseEntity.notFound().build();
        } else {
            responseEntity = ResponseEntity.ok(oneReceta);
        }
        return responseEntity;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteReceta(@PathVariable(value = "id") Integer recetaId) {
        recetaServiceImplement.deleteReceta(recetaId);
    }

}
