package com.example.sejun_spring_boot_java.repositories;

import com.example.sejun_spring_boot_java.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
