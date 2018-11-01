package com.jingyao.insticator.questionmanager.controller;

import com.jingyao.insticator.questionmanager.dao.TriviaRepository;
import com.jingyao.insticator.questionmanager.data.Trivia;
import com.jingyao.insticator.questionmanager.service.TriviaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("questioner")
public class QuestionerController {

    @Autowired
    private TriviaService triviaRepository;

    @GetMapping("findAll")
    public List<Trivia> getAllTrivia() {
        return triviaRepository.findAll();
    }

    @GetMapping("findById/{tid}")
    public Trivia getTriviaById(@PathVariable("tid") Integer tid) {
        return triviaRepository.findOne(tid);
    }

//    @GetMapping("findByQuestion/{tquestion}")
//    public List<Trivia> getTriviaByQuestion(@PathVariable("tquestion") String question) {
//
//    }
}
