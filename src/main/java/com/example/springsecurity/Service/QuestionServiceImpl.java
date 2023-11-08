package com.example.springsecurity.Service;

import com.example.springsecurity.Entity.Question;
import com.example.springsecurity.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question findById(Long id) {
        Optional<Question> result = questionRepository.findById(id);

        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RuntimeException("Question with id " + id + " not found");
        }
    }

    @Override
    public void saveQuestion(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void deleteById(Long id) {
        questionRepository.deleteById(id);
    }
}
