package com.jingyao.insticator.questionmanager.controller;

import com.jingyao.insticator.questionmanager.data.Poll;
import com.jingyao.insticator.questionmanager.service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("poll")
public class PollController {

    @Autowired
    private PollService pollService;

    @GetMapping("findAll")
    public List<Poll> getAllPoll() {
        return pollService.getAllPoll();
    }

    @GetMapping("findById/{pid}")
    public Poll getPollById(@PathVariable("pid") Integer pid) {
        return pollService.getPollById(pid);
    }

    @GetMapping("findByQuestion/{pquestion}")
    public List<Poll> getPollByQuestion(@PathVariable("pquestion") String pquestion) {
        return pollService.getPollByQuestion(pquestion);
    }

    @GetMapping("findByAnswer/{pchoices}")
    public List<Poll> getPollByChoices(@PathVariable("pchoices") String pchoices) {
        return pollService.getPollByChoices(pchoices);
    }

    @PostMapping("add")
    private boolean addPoll(@RequestBody Poll poll) {
        return pollService.addPoll(poll);
    }

    @PostMapping("update")
    private boolean updatePoll(@RequestBody Poll poll) {
        return pollService.updatePoll(poll);
    }

    @PostMapping("delete")
    private boolean deletePoll(@RequestBody Poll poll) {
        return pollService.deletePoll(poll);
    }

}
