package com.QuizApplication.QuizApplication.Controller;

import com.QuizApplication.QuizApplication.Model.Question;
import com.QuizApplication.QuizApplication.Services.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QuestionController {
    @Autowired
    private QuestionServices questionServices;

    @GetMapping("allQuestion")
    public List<Question> getAllQuestion() {
        return questionServices.getAllQuestion();
    }
    @GetMapping("category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category) {
        return questionServices.getQuestionByCategory(category);
    }

    @PostMapping("addQuestions")
    public List<Question> addAllQuestions(@RequestBody List<Question> questions) {
        return questionServices.addAllQuestions(questions);
    }

    @PostMapping("addQuestion")
    public Question addQuestions(@RequestBody Question question) {
        return questionServices.addQuestions(question);
    }
}
