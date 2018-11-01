package com.jingyao.insticator.questionmanager.transfer;

import com.jingyao.insticator.questionmanager.data.UserMatric;
import com.jingyao.insticator.questionmanager.view.UserMatricView;

import java.util.Arrays;

public class UserMatricTransfer {

    public static UserMatric transfer(UserMatricView userMatricView) {
        UserMatric userMatric = new UserMatric();
        userMatric.setUuid(userMatricView.getUuid());
        userMatric.setMid(userMatricView.getMid());
        userMatric.setUmanswer(userMatricView.getUmanswer().toString());
        return userMatric;
    }

    public static UserMatricView transfer(UserMatric userMatric) {
        UserMatricView userMatricView = new UserMatricView();
        userMatricView.setUuid(userMatric.getUuid());
        userMatricView.setMid(userMatric.getMid());
        String umanswer = userMatric.getUmanswer();
        String[] um = umanswer.substring(1, umanswer.length() - 1).split(",");
        userMatricView.setUmanswer(Arrays.asList(um));
        return userMatricView;
    }

}
