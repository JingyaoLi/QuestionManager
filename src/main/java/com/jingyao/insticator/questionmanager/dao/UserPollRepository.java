package com.jingyao.insticator.questionmanager.dao;

import com.jingyao.insticator.questionmanager.data.UserPoll;
import com.jingyao.insticator.questionmanager.data.UserTrivia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserPollRepository extends JpaRepository<UserPoll, Integer> {

    public UserPoll findByUuidAndPid(int uuid, int pid);

    public List<UserPoll> findByUuid(int uuid);
}
