package com.jingyao.insticator.questionmanager.dao;

import com.jingyao.insticator.questionmanager.data.Trivia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface TriviaRepository extends JpaRepository<Trivia, Integer> {

    public List<Trivia> findByTquestionContaining(String tquestion);

    public List<Trivia> findByTanswerContaining(String tanswer);

    public List<Trivia> findByTchoicesContaining(String tchoices);

    public Trivia findFirstByTidNotIn(Collection<Integer> tid);
}
