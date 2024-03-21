package com.microservice.quiz.entity;

import lombok.Data;

@Data
public class QuizResponse {
	
	private long questionID;
	private String response;

}
