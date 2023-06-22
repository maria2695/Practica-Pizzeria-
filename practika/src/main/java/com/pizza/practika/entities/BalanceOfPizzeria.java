package com.pizza.practika.entities;

import jakarta.persistence.*;

@Entity
@Table(name="balanceOfPizzeria")
public class BalanceOfPizzeria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
