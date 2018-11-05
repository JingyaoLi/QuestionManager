package com.jingyao.insticator.questionmanager.dao;

import com.jingyao.insticator.questionmanager.data.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface PollRepository extends JpaRepository<Poll, Integer> {

    public List<Poll> findByPquestionContaining(String pquestion);

    public List<Poll> findByPchoicesContaining(String pchoices);

    public Poll findFirstByPidNotIn(Collection<Integer> pid);
}
