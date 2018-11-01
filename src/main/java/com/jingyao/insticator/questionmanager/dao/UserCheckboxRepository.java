package com.jingyao.insticator.questionmanager.dao;

import com.jingyao.insticator.questionmanager.data.UserCheckbox;
import com.jingyao.insticator.questionmanager.data.UserTrivia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserCheckboxRepository extends JpaRepository<UserCheckbox, Integer> {
    public UserCheckbox findByUuidAndCid(int uuid, int cid);
}
