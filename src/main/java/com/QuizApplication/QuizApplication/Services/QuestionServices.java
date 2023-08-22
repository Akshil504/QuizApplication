package com.QuizApplication.QuizApplication.Services;

import com.QuizApplication.QuizApplication.Model.Question;
import com.QuizApplication.QuizApplication.Repo.QuestionRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class QuestionServices {

    @Autowired
    private QuestionRepo questionRepo;

    public List<Question> getAllQuestion() {
        return questionRepo.findAll();
    }

    public List<Question> getQuestionByCategory(String category) {
        return questionRepo.findBycategory(category);
    }

    public List<Question> addAllQuestions(List<Question> questions) {
        return questionRepo.saveAll(questions);
    }

    public Question addQuestions(Question question) {
        return questionRepo.save(question);
    }
}
