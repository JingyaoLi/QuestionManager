package com.jingyao.insticator.questionmanager.service;

import com.jingyao.insticator.questionmanager.dao.PollRepository;
import com.jingyao.insticator.questionmanager.dao.UserPollRepository;
import com.jingyao.insticator.questionmanager.data.Poll;
import com.jingyao.insticator.questionmanager.data.UserPoll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PollService {

    @Autowired
    private PollRepository pollRepository;

    public List<Poll> getAllPoll() {
        return pollRepository.findAll();
    }

    public Poll getPollById(Integer pid) {
        return pollRepository.findOne(pid);
    }

    public List<Poll> getPollByQuestion(String pquestion) {
        return pollRepository.findByPquestionContaining(pquestion);
    }

    public List<Poll> getPollByChoices(String pchoices) {
        return pollRepository.findByPchoicesContaining(pchoices);
    }

    //return false if there is a poll with the same id in table
    public boolean addPoll(Poll poll) {
        int pid = poll.getPid();
        if (pollRepository.findOne(pid) == null) {
            pollRepository.save(poll);
            return true;
        }
        return false;
    }

    //return false if there is no poll in table with the given id
    public boolean updatePoll(Poll poll) {
        int pid = poll.getPid();
        if (pollRepository.findOne(pid) != null) {
            pollRepository.save(poll);
            return true;
        }
        return false;
    }

    //return false if there is no poll with the given id in the table
    public boolean deletePoll(Poll poll) {
        int pid = poll.getPid();
        if (pollRepository.findOne(pid) != null) {
            pollRepository.delete(pid);
            return true;
        }
        return false;
    }

    @Autowired
    private UserPollRepository userPollRepository;

    public Poll getPoll(int uuid) {
        Set<Integer> answered = new HashSet<Integer>();
        for (UserPoll up : userPollRepository.findByUuid(uuid)) {
            answered.add(up.getPid());
        }
        Poll poll = pollRepository.findFirstByPidNotIn(answered);
        return poll;
    }

}
