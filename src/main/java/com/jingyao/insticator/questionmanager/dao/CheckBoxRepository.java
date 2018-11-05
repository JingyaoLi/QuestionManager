package com.jingyao.insticator.questionmanager.dao;

import com.jingyao.insticator.questionmanager.data.CheckBox;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface CheckBoxRepository extends JpaRepository<CheckBox, Integer> {

    public List<CheckBox> findByCquestionContaining(String cquestion);

    public List<CheckBox> findByCchoicesContaining(String cchoices);

    public CheckBox findFirstByCidNotIn(Collection<Integer> cid);
}
