package com.jingyao.insticator.questionmanager.service;

import com.jingyao.insticator.questionmanager.dao.UserMatricRepository;
import com.jingyao.insticator.questionmanager.data.UserMatric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMatricService {

    @Autowired
    private UserMatricRepository userMatricRepository;

    public boolean addUserMatric(UserMatric userMatric) {
        int uuid = userMatric.getUuid();
        int mid = userMatric.getMid();
        if (userMatricRepository.findByUuidAndMid(uuid, mid) != null) {
            userMatricRepository.save(userMatric);
            return true;
        }
        return false;
    }
}
