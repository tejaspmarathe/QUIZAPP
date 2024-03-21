package com.microservice.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.quiz.entity.Quiz;

public interface QuizDAO extends JpaRepository<Quiz, Long> {

}
