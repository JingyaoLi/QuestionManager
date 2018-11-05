package com.jingyao.insticator.questionmanager.controller;

import com.jingyao.insticator.questionmanager.data.*;
import com.jingyao.insticator.questionmanager.service.*;
import com.jingyao.insticator.questionmanager.transfer.UserCheckBoxTransfer;
import com.jingyao.insticator.questionmanager.transfer.UserMatricTransfer;
import com.jingyao.insticator.questionmanager.view.TriviaView;
import com.jingyao.insticator.questionmanager.view.UserCheckboxView;
import com.jingyao.insticator.questionmanager.view.UserMatricView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//This controller is used for user to get and answer the questions
@RestController
@RequestMapping("user/")
public class UserController {

    @Autowired
    private UserTriviaService userTriviaService;
    private TriviaService triviaService;

    @GetMapping("trivial/get/{uuid}")
    public TriviaView getTrivia(@PathVariable("uuid") Integer uuid) {
        return triviaService.getTriviaView(uuid);
    }

    @PostMapping("trivial/answer")
    public boolean answerTrivia(@RequestBody UserTrivia userTrivia) {
        return userTriviaService.addUserTrivia(userTrivia);
    }

    @Autowired
    private UserPollService userPollService;
    private PollService pollService;

    @GetMapping("poll/get/{uuid}")
    public Poll getPoll(@PathVariable("uuid") Integer uuid) {
        return pollService.getPoll(uuid);
    }

    @PostMapping("poll/answer")
    private boolean answerPoll(@RequestBody UserPoll userPoll) {
        return userPollService.addUserPoll(userPoll);
    }

    @Autowired
    private UserCheckBoxService userCheckBoxService;
    private CheckBoxService checkBoxService;

    @GetMapping("checkbox/get/{uuid}")
    public CheckBox getCheckBox(@PathVariable("uuid") Integer uuid) {
        return checkBoxService.getCheckBox(uuid);
    }

    @PostMapping("checkbox/answer")
    private boolean answerCheckBox(@RequestBody UserCheckboxView userCheckboxView) {
        UserCheckbox userCheckbox = UserCheckBoxTransfer.transfer(userCheckboxView);
        return userCheckBoxService.addUserCheckBox(userCheckbox);
    }

    @Autowired
    private UserMatricService userMatricService;
    private MatricService matricService;

    @GetMapping("matric/get/{uuid}")
    public Matric getMatric(@PathVariable("uuid") Integer uuid) {
        return matricService.getCheckBox(uuid);
    }

    @PostMapping("matric")
    private boolean answerMatric(@RequestBody UserMatricView userMatricView) {
        UserMatric userMatric = UserMatricTransfer.transfer(userMatricView);
        return userMatricService.addUserMatric(userMatric);
    }

}
