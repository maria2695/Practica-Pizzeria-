package com.pizza.practika.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="ingredients")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "acquisitionCost", nullable = false)
    private double acquisitionCost;
    @Column(name = "retailPrice", nullable = false)
    private double retailPrice;
    @Column(name = "countOfSales", nullable = false)
    private int countOfSales;
    @Column(name = "countOfIngredients", nullable = false)
    private int countOfIngredients;

}

