package com.microservice.question.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.microservice.question.entity.Question;

public interface QuestionDAO extends JpaRepository<Question, Long> {

	List<Question> findByCategoryAndDifficultyLevel(String category, String difficultyLevel);

	@Query(value = "SELECT question_id FROM question WHERE category = ?1 AND difficulty_level = ?2 ORDER BY RAND() LIMIT ?3", nativeQuery = true)
	List<Long> findRandomQuestions(String category, String difficultyLevel, int numberOfQuestions);

}
