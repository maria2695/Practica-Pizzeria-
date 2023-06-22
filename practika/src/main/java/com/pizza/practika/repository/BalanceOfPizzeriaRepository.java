package com.pizza.practika.repository;

import com.pizza.practika.entities.BalanceOfPizzeria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceOfPizzeriaRepository extends JpaRepository<BalanceOfPizzeria, Long> {
}
