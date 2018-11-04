package com.jingyao.insticator.questionmanager.dao;

import com.jingyao.insticator.questionmanager.data.Options;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OptionsRepository extends JpaRepository<Options, Integer> {
    public List<Options> findByOnameContaining(String oname);

    public List<Options> findByOchoicesContaining(String ochoices);
}
