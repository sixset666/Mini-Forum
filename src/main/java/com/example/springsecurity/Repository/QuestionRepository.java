package com.example.springsecurity.Repository;

import com.example.springsecurity.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    void deleteById(Long id);

}
