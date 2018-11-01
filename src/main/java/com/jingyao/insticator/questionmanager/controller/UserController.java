package com.jingyao.insticator.questionmanager.controller;

import com.jingyao.insticator.questionmanager.data.*;
import com.jingyao.insticator.questionmanager.service.UserCheckBoxService;
import com.jingyao.insticator.questionmanager.service.UserMatricService;
import com.jingyao.insticator.questionmanager.service.UserPollService;
import com.jingyao.insticator.questionmanager.service.UserTriviaService;
import com.jingyao.insticator.questionmanager.transfer.UserCheckBoxTransfer;
import com.jingyao.insticator.questionmanager.transfer.UserMatricTransfer;
import com.jingyao.insticator.questionmanager.view.UserCheckboxView;
import com.jingyao.insticator.questionmanager.view.UserMatricView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserTriviaService userTriviaService;

    @PostMapping("trivial")
    public boolean answerTrivia(@RequestBody UserTrivia userTrivia) {
        return userTriviaService.addUserTrivia(userTrivia);
    }

    @Autowired
    private UserPollService userPollService;

    @PostMapping("poll")
    private boolean answerPoll(@RequestBody UserPoll userPoll) {
        return userPollService.addUserPoll(userPoll);
    }

    @Autowired
    private UserCheckBoxService userCheckBoxService;

    @PostMapping("checkbox")
    private boolean answerCheckBox(@RequestBody UserCheckboxView userCheckboxView) {
        UserCheckbox userCheckbox = UserCheckBoxTransfer.transfer(userCheckboxView);
        return userCheckBoxService.addUserCheckBox(userCheckbox);
    }

    @Autowired
    private UserMatricService userMatricService;

    @PostMapping("matric")
    private boolean answerMatric(@RequestBody UserMatricView userMatricView) {
        UserMatric userMatric = UserMatricTransfer.transfer(userMatricView);
        return userMatricService.addUserMatric(userMatric);
    }




}
