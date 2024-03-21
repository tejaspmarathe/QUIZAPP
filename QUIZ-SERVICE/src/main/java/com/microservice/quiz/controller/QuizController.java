package com.microservice.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.quiz.entity.QuestionWrapper;
import com.microservice.quiz.entity.Quiz;
import com.microservice.quiz.entity.QuizResponse;
import com.microservice.quiz.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	private QuizService quizService;
	
	
	@GetMapping("/createquiz")
	public ResponseEntity<Quiz> createNewQuiz(@RequestParam("title") String title,
			@RequestParam("difficultyLevel") String difficultyLevel, @RequestParam("category") String category,
			@RequestParam("noOfQue") int noOfQue) {
		Quiz quiz = this.quizService.createNewQuiz(title, difficultyLevel, category, noOfQue);
		return new ResponseEntity<Quiz>(quiz, HttpStatus.CREATED);
	}

	@GetMapping("/getquiz/{quizId}")
	public ResponseEntity<List<QuestionWrapper>> getQuiz(@PathVariable("quizId") long quizId) {
		List<QuestionWrapper> quiz = this.quizService.getQuizByID(quizId);
		return new ResponseEntity<List<QuestionWrapper>>(quiz, HttpStatus.OK);
	}

	@PostMapping("/submitquiz")
	public ResponseEntity<Integer> submitQuiz(@RequestBody List<QuizResponse> quizResponse) {
		int result = this.quizService.calcResult(quizResponse);
		return new ResponseEntity<Integer>(result, HttpStatus.OK);
	}

}
