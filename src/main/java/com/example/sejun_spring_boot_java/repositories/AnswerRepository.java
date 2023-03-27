package com.example.sejun_spring_boot_java.repositories;

import com.example.sejun_spring_boot_java.entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
