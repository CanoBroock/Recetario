package com.recetario.recetario.model.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "recetas")
public class RecetaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recetaID;
    @Column(name = "Nombre_receta")
    private String nombre;
    @Column(name = "Ingredientes")
    private List<IngredientesEntity> ingredientes;
    @Column(name = "Tipo")
    private String tipo;
    @Column(name = "preparación")
    private String preparacion;

    public RecetaEntity(List<IngredientesEntity> ingredientes) {
        this.ingredientes = new ArrayList<>();
    }
}
