package com.pizza.practika.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="clients")
@Setter
@Getter
@ToString
@RequiredArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "firstname", nullable = false)
    private String firstName;
    @Column(name = "lastName", nullable = false)
    private String lastName;
    @Column(name = "creditBalance", nullable = false)
    private double creditBalance;
    @Column(name = "login", nullable = false, unique = true)
    private String login;
    @Column(name = "password")
    private String password;
}
