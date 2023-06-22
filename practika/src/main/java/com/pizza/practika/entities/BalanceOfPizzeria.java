package com.pizza.practika.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="balanceOfPizzeria")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class BalanceOfPizzeria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
