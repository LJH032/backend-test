package com.example.demo.repository;

import com.example.demo.model.Pill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PillRepository extends JpaRepository<Pill, Long> {
}
