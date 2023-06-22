package com.pizza.practika.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="pizzas")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nameOfPizza", nullable = false)
    private String nameOfPizza;
    @OneToMany(mappedBy = "pizza")
    private List<Ingredient> listOfIngredients;
}
