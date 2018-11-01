package com.jingyao.insticator.questionmanager.dao;

import com.jingyao.insticator.questionmanager.data.UserTrivia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserTriviaRepository extends JpaRepository<UserTrivia, Integer> {

    public UserTrivia findByUuidAndTid(int uuid, int tid);
}
