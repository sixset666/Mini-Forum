//package com.example.springsecurity.Controller;
//
//
//import com.example.springsecurity.Entity.Answer;
//import com.example.springsecurity.Service.AnswerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/answers")
//public class AnswerController {
//    private final AnswerService answerService;
//
//    @Autowired
//    public AnswerController(AnswerService answerService) {
//        this.answerService = answerService;
//    }
//
//    @GetMapping("/list")
//    public String listAnswers(Model model) {
//        List<Answer> answers = answerService.getAllAnswers();
//        model.addAttribute("answers", answers);
//        return "answer/list";
//    }
//
//    @GetMapping("/showFormForAdd")
//    public String showFormForAdd(Model model) {
//        Answer answer = new Answer();
//        model.addAttribute("answer", answer);
//        return "answer/add";
//    }
//
//    @PostMapping("/save")
//    public String saveAnswer(@ModelAttribute("answer") Answer answer) {
//        answerService.saveAnswer(answer);
//        return "redirect:/answers/list";
//    }
//}
