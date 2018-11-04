package com.jingyao.insticator.questionmanager.service;

import com.jingyao.insticator.questionmanager.dao.MatricRepository;
import com.jingyao.insticator.questionmanager.data.Matric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatricService {

    @Autowired
    private MatricRepository matricRepository;

    public List<Matric> getAllCheckBox() {
        return matricRepository.findAll();
    }

    public Matric getMatricById(Integer mid) {
        return matricRepository.findOne(mid);
    }

    public List<Matric> getMatricByQuestion(String mquestion) {
        return matricRepository.findByMquestionContaining(mquestion);
    }

    public List<Matric> getMatricByChoices(String moptions) {
        return matricRepository.findByMoptionsContaining(moptions);
    }

    //return false if there is a matric with the same id in table
    public boolean addMatric(Matric matric) {
        int mid = matric.getMid();
        if (matricRepository.findOne(mid) == null) {
            matricRepository.save(matric);
            return true;
        }
        return false;
    }

    //return false if there is no matric in table with the given id
    public boolean updateMatric(Matric matric) {
        int mid = matric.getMid();
        if (matricRepository.findOne(mid) != null) {
            matricRepository.save(matric);
            return true;
        }
        return false;
    }

    //return false if there is no matric with the given id in the table
    public boolean deleteMatric(Matric matric) {
        int mid = matric.getMid();
        if (matricRepository.findOne(mid) != null) {
            matricRepository.delete(mid);
            return true;
        }
        return false;
    }


}
