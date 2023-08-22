package com.QuizApplication.QuizApplication.Repo;

import com.QuizApplication.QuizApplication.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
    List<Question> findBycategory(String category);
}
