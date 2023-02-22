package com.recetario.recetario.model.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "recetas")
public class RecetaEntity {
    @Id
    private int recetaID;
    private String nombre;
    private List<IngredientesEntity> ingredientes;
    private String tipo;
    private String preparacion;

    public RecetaEntity(List<IngredientesEntity> ingredientes) {
        this.ingredientes = new ArrayList<>();
    }
}
