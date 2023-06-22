package com.pizza.practika.entities;

import jakarta.persistence.*;


@Entity
@Table(name="ingredients")
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

    public Ingredient() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAcquisitionCost() {
        return acquisitionCost;
    }

    public void setAcquisitionCost(double acquisitionCost) {
        this.acquisitionCost = acquisitionCost;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int getCountOfSales() {
        return countOfSales;
    }

    public void setCountOfSales(int countOfSales) {
        this.countOfSales = countOfSales;
    }

    public int getCountOfIngredients() {
        return countOfIngredients;
    }

    public void setCountOfIngredients(int countOfIngredients) {
        this.countOfIngredients = countOfIngredients;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", acquisitionCost=" + acquisitionCost +
                ", retailPrice=" + retailPrice +
                ", countOfSales=" + countOfSales +
                ", countOfIngredients=" + countOfIngredients +
                '}';
    }
}

