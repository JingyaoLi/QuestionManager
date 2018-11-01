package com.jingyao.insticator.questionmanager.service;

import com.jingyao.insticator.questionmanager.dao.UserCheckboxRepository;
import com.jingyao.insticator.questionmanager.data.UserCheckbox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCheckBoxService {

    @Autowired
    private UserCheckboxRepository userCheckboxRepository;

    public boolean addUserCheckBox(UserCheckbox userCheckbox) {
        int uuid = userCheckbox.getUuid();
        int cid = userCheckbox.getCid();
        if (userCheckboxRepository.findByUuidAndCid(uuid, cid) != null) {
            userCheckboxRepository.save(userCheckbox);
            return true;
        }
        return false;
    }
}