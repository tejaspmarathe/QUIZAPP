package com.microservice.quiz.entity;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long quizId;

	private String quizTitle;

	
	// AS we not storing question only id	
	//@ManyToMany
	@ElementCollection
	private List<Long> questionsID;

}
