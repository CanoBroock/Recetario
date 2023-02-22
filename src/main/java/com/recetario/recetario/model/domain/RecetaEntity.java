package com.recetario.recetario.model.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "recetas")
public class RecetaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

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
