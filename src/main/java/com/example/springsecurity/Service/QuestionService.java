package com.example.springsecurity.Service;

import com.example.springsecurity.Entity.Question;
import com.example.springsecurity.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {
    List<Question> findAll();
    Question findById(Long id);
    void saveQuestion(Question question);
    void deleteById(Long id);

}
