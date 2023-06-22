package com.pizza.practika.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="staff")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "firstname", nullable = false)
    private String firstName;
    @Column(name = "lastName", nullable = false)
    private String lastName;
    @Column(name="position", nullable = false)
    private String position;
    @Column(name="salary", nullable = false)
    private String weeklySalary;

}
