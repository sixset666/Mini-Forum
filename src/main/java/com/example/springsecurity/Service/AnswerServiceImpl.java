//package com.example.springsecurity.Service;
//
//import com.example.springsecurity.Entity.Answer;
//import com.example.springsecurity.Repository.AnswerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
//public class AnswerServiceImpl implements AnswerService{
//    private final AnswerRepository answerRepository;
//
//    @Autowired
//    public AnswerServiceImpl(AnswerRepository answerRepository) {
//        this.answerRepository = answerRepository;
//    }
//
//    @Override
//    public List<Answer> getAllAnswers() {
//        return answerRepository.findAll();
//    }
//
//    @Override
//    public void saveAnswer(Answer answer) {
//        answerRepository.save(answer);
//    }
//}
