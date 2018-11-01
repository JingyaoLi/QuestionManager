package com.jingyao.insticator.questionmanager.transfer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.jingyao.insticator.questionmanager.data.UserCheckbox;
import com.jingyao.insticator.questionmanager.view.UserCheckboxView;

import java.util.Arrays;
import java.util.List;

public class UserCheckBoxTransfer {

    public static UserCheckbox transfer(UserCheckboxView userCheckboxView) {
        UserCheckbox userCheckbox = new UserCheckbox();
        userCheckbox.setUuid(userCheckboxView.getUuid());
        userCheckbox.setCid(userCheckboxView.getCid());
        userCheckbox.setUcanswer(userCheckboxView.getUcanswer().toString());
        return userCheckbox;
    }

    public static UserCheckboxView transfer(UserCheckbox userCheckbox) {
        UserCheckboxView userCheckboxView = new UserCheckboxView();
        userCheckboxView.setUuid(userCheckbox.getUuid());
        userCheckboxView.setCid(userCheckbox.getCid());
        String ucanswer = userCheckbox.getUcanswer();
        String[] uc = ucanswer.substring(1, ucanswer.length() - 1).split(",");
        userCheckboxView.setUcanswer(Arrays.asList(uc));
        return userCheckboxView;
    }

}
