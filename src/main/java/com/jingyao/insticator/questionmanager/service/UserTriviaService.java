package com.jingyao.insticator.questionmanager.service;

import com.jingyao.insticator.questionmanager.dao.TriviaRepository;
import com.jingyao.insticator.questionmanager.dao.UserTriviaRepository;
import com.jingyao.insticator.questionmanager.data.UserTrivia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTriviaService {

    @Autowired
    private UserTriviaRepository userTriviaRepository;

    public boolean addUserTrivia(UserTrivia userTrivia) {
        int uuid = userTrivia.getUuid();
        int tid = userTrivia.getTid();
        if (userTriviaRepository.findByUuidAndTid(uuid, tid) != null) {
            userTriviaRepository.save(userTrivia);
            return true;
        }
        return false;
    }
}
