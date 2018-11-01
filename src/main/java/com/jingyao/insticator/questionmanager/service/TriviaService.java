package com.jingyao.insticator.questionmanager.service;

import com.jingyao.insticator.questionmanager.dao.TriviaRepository;
import com.jingyao.insticator.questionmanager.dao.UserCheckboxRepository;
import com.jingyao.insticator.questionmanager.data.Trivia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class TriviaService {

    @Autowired
    private TriviaRepository triviaRepository;

    public List<Trivia> getAllTrivia() {
        return triviaRepository.findAll();
    }

    public Trivia getTriviaById(Integer tid) {
        return triviaRepository.findOne(tid);
    }

    public List<Trivia> getTriviaByQuestion(String tquestion) {
        return triviaRepository.findByTquestionContaining(tquestion);
    }

    public List<Trivia> getTriviaByAnswer(String tanswer) {
        return triviaRepository.findByTanswerContaining(tanswer);
    }

    public List<Trivia> getTriviaByChoices(String tchoices) {
        return triviaRepository.findByTchoicesContaining(tchoices);
    }

    //return false if there is a trivia with the same id in table
    public boolean addTrivia(Trivia trivia) {
        int tid = trivia.getTid();
        if (triviaRepository.findOne(tid) == null) {
            triviaRepository.save(trivia);
            return true;
        }
        return false;
    }

    //return false if there is no trivia in table with the given id
    public boolean updateTrivia(Trivia trivia) {
        int tid = trivia.getTid();
        if (triviaRepository.findOne(tid) != null) {
            triviaRepository.save(trivia);
            return true;
        }
        return false;
    }

    //return false if there is no trivia with the given id in the table
    public boolean deleteTrivia(Trivia trivia) {
        int tid = trivia.getTid();
        if (triviaRepository.findOne(tid) != null) {
            triviaRepository.delete(tid);
            return true;
        }
        return false;
    }
}
