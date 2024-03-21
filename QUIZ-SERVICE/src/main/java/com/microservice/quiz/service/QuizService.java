package com.microservice.quiz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice.quiz.entity.QuestionWrapper;
import com.microservice.quiz.entity.Quiz;
import com.microservice.quiz.entity.QuizResponse;

@Service
public interface QuizService {
	

	Quiz createNewQuiz(String title,String difficultyLevel,String category,int noOfQue);

	List<QuestionWrapper> getQuizByID(long quizId);

	int calcResult(List<QuizResponse> quizResponse);

}
