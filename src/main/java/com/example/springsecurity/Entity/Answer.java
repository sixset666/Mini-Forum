//package com.example.springsecurity.Entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Entity
//    @Getter
//    @Setter
//    @NoArgsConstructor
//    @AllArgsConstructor
//    @Table(name = "answer")
//    public class Answer {
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Long id;
//
//        @ManyToOne // Многие ответы к одному вопросу
//        @JoinColumn(name = "question_id", nullable = false)
//        private Question question;
//
//        private String text;
//    }
//
