package com.recetario.recetario.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientesEntity {
    private String ingrediene1;
    private int cantidad1;
    private String ingrediene2;
    private int cantidad2;
    private String ingrediene3;
    private int cantidad3;
    private String ingrediene4;
    private int cantidad4;

}
