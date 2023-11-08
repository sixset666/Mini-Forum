package com.example.springsecurity.Controller;

import com.example.springsecurity.Entity.Question;

import java.beans.PropertyEditorSupport;

public class QuestionEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        // Преобразовать строку в объект Question
        setValue(new Question(text));
    }

    @Override
    public String getAsText() {
        // Преобразовать объект Question в строку
        Question question = (Question) getValue();
        return question != null ? question.toString() : "";
    }
}
