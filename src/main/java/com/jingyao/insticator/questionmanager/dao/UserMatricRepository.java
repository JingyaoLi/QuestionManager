package com.jingyao.insticator.questionmanager.dao;

import com.jingyao.insticator.questionmanager.data.UserMatric;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserMatricRepository extends JpaRepository<UserMatric, Integer> {

    public UserMatric findByUuidAndMid(int uuid, int mid);
}
