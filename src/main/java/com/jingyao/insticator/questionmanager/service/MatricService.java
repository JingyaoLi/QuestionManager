package com.jingyao.insticator.questionmanager.service;

import com.jingyao.insticator.questionmanager.dao.MatricRepository;
import com.jingyao.insticator.questionmanager.dao.OptionsRepository;
import com.jingyao.insticator.questionmanager.dao.UserMatricRepository;
import com.jingyao.insticator.questionmanager.data.Matric;
import com.jingyao.insticator.questionmanager.data.Options;
import com.jingyao.insticator.questionmanager.data.UserMatric;
import com.jingyao.insticator.questionmanager.transfer.MatricTransfer;
import com.jingyao.insticator.questionmanager.view.MatricView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Service
public class MatricService {

    @Autowired
    private MatricRepository matricRepository;

    public List<MatricView> getAllMatric() {
        return MatricTransfer.transferToMatricViewList(matricRepository.findAll());
    }

    public MatricView getMatricById(Integer mid) {
        return MatricTransfer.transfer(matricRepository.findOne(mid));
    }

    public List<MatricView> getMatricByQuestion(String mquestion) {
        return MatricTransfer.transferToMatricViewList(matricRepository.findByMquestionContaining(mquestion));
    }

    @Autowired
    OptionsRepository optionsRepository;
    public List<MatricView> getMatricByOptions(String moptions) {
        List<Options> options = optionsRepository.findByOnameContaining(moptions);
        List<Matric> matrics = new LinkedList<Matric>();
        for (Options o : options) {
            if (matricRepository.findOne(o.getOid()) != null) {
                matrics.add(matricRepository.findOne(o.getOid()));
            }
        }
        return MatricTransfer.transferToMatricViewList(matrics);
    }

    //return false if there is a matric with the same id in table
    public boolean addMatric(MatricView matricView) {
        int mid = matricView.getMid();
        if (matricRepository.findOne(mid) == null) {
            matricRepository.save(MatricTransfer.transfer(matricView));
            return true;
        }
        return false;
    }

    //return false if there is no matric in table with the given id
    public boolean updateMatric(MatricView matricView) {
        int mid = matricView.getMid();
        if (matricRepository.findOne(mid) != null) {
            matricRepository.save(MatricTransfer.transfer(matricView));
            return true;
        }
        return false;
    }

    //return false if there is no matric with the given id in the table
    public boolean deleteMatric(MatricView matricView) {
        int mid = matricView.getMid();
        if (matricRepository.findOne(mid) != null) {
            matricRepository.delete(mid);
            return true;
        }
        return false;
    }

    @Autowired
    private UserMatricRepository userMatricRepository;

    public Matric getCheckBox(int uuid) {
        Set<Integer> answered = new HashSet<Integer>();
        for (UserMatric um : userMatricRepository.findByUuid(uuid)) {
            answered.add(um.getMid());
        }
        Matric matric = matricRepository.findFirstByMidNotIn(answered);
        return matric;
    }

}
