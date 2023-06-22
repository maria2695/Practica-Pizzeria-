package com.pizza.practika.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="drinks")
@Setter
@Getter
@ToString
@RequiredArgsConstructor
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="price", nullable = false)
    private double price;
    @Column(name="presence", nullable = false)
    private boolean presence;

}

