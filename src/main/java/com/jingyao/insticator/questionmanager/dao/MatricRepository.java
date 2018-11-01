package com.jingyao.insticator.questionmanager.dao;

import com.jingyao.insticator.questionmanager.data.Matric;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatricRepository extends JpaRepository<Matric, Integer> {

    public List<Matric> findByMquestionContaining(String mquestion);

    public List<Matric> findByMoptionsContaining(String moptions);


}
