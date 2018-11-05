package com.jingyao.insticator.questionmanager.controller;

import com.jingyao.insticator.questionmanager.data.Trivia;
import com.jingyao.insticator.questionmanager.service.TriviaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This controller is used for questioner to do CRUD process for Trivia
@RestController
@RequestMapping("trivia")
public class TriviaController {

    @Autowired
    private TriviaService triviaService;

    @GetMapping("findAll")
    public List<Trivia> getAllTrivia() {
        return triviaService.getAllTrivia();
    }

    @GetMapping("findById/{tid}")
    public Trivia getTriviaById(@PathVariable("tid") Integer tid) {
        return triviaService.getTriviaById(tid);
    }

    @GetMapping("findByQuestion/{tquestion}")
    public List<Trivia> getTriviaByQuestion(@PathVariable("tquestion") String tquestion) {
        return triviaService.getTriviaByQuestion(tquestion);
    }

    @GetMapping("findByAnswer/{tanswer}")
    public List<Trivia> getTriviaByAnswer(@PathVariable("tanswer") String tanswer) {
        return triviaService.getTriviaByAnswer(tanswer);
    }

    @GetMapping("findByChoices/{tchoices}")
    public List<Trivia> getTriviaByChoices(@PathVariable("tchoices") String tchoices) {
        return triviaService.getTriviaByChoices(tchoices);
    }

    @PostMapping("add")
    private boolean addTrivia(@RequestBody Trivia trivia) {
        return triviaService.addTrivia(trivia);
    }

    @PostMapping("update")
    private boolean updateTrivia(@RequestBody Trivia trivia) {
        return triviaService.updateTrivia(trivia);
    }

    @PostMapping("delete")
    private boolean deleteTrivia(@RequestBody Trivia trivia) {
        return triviaService.deleteTrivia(trivia);
    }

}
