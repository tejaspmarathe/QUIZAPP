package com.microservice.quiz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class QuestionWrapper {
	
	private long questionId;
	private String questionTitle;
	private String option1;
	private String option2;
	private String option3;
	private String option4;

}
