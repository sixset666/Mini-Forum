package com.example.springsecurity.Controller;


import com.example.springsecurity.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.example.springsecurity.Entity.Question;
import com.example.springsecurity.Repository.QuestionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/list")
    public String listQuestions(Model model) {
        List<Question> questions = questionService.findAll();
        model.addAttribute("questions", questions);
        return "questions/list";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        Question question = new Question();
        model.addAttribute("question", question);
        return "questions/add";
    }

    @PostMapping("/save")
    public String saveQuestion(@ModelAttribute("question") Question question) {
        questionService.saveQuestion(question);
        return "redirect:/questions/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("questionId") Long id, Model model) {
        Question question = questionService.findById(id);
        model.addAttribute("question", question);
        return "questions/edit";
    }

    @GetMapping("/delete")
    public String deleteQuestion(@RequestParam("questionId") Long id) {
        questionService.deleteById(id);
        return "redirect:/questions/list";
    }
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Question.class, new QuestionEditor());
    }


}