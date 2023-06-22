package com.pizza.practika.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="pizzas")
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nameOfPizza", nullable = false)
    private String nameOfPizza;
    @OneToMany(mappedBy = "pizza")
    private List<Ingredient> listOfIngredients;

    public Pizza() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOfPizza() {
        return nameOfPizza;
    }

    public void setNameOfPizza(String nameOfPizza) {
        this.nameOfPizza = nameOfPizza;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", nameOfPizza='" + nameOfPizza + '\'' +
                '}';
    }
}
