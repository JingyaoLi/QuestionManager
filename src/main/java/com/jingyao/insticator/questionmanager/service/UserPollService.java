package com.jingyao.insticator.questionmanager.service;

import com.jingyao.insticator.questionmanager.dao.UserPollRepository;
import com.jingyao.insticator.questionmanager.data.UserPoll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPollService {

    @Autowired
    private UserPollRepository userPollRepository;

    public boolean addUserPoll(UserPoll userPoll) {
        int uuid = userPoll.getUuid();
        int pid = userPoll.getPid();
        if (userPollRepository.findByUuidAndPid(uuid, pid) != null) {
            userPollRepository.save(userPoll);
            return true;
        }
        return false;
    }
}
