package com.recetario.recetario.controller;

import com.recetario.recetario.model.domain.RecetaEntity;
import com.recetario.recetario.model.service.RecetaServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recetas")
public class RecetarioController {

    @Autowired
    private RecetaServiceImplement recetaServiceImplement;

    @PostMapping("/add")
    public ResponseEntity<?>addReceta(@RequestBody RecetaEntity recetaEntity){
        ResponseEntity<?> responseEntity =null;
        RecetaEntity savaReceta = recetaServiceImplement.saveReceta(recetaEntity);
        if(savaReceta !=null){
            responseEntity = ResponseEntity.status(HttpStatus.OK).body(savaReceta);
        }
        return responseEntity;
    }

}
