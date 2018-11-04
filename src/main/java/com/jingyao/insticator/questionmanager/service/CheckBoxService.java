package com.jingyao.insticator.questionmanager.service;

import com.jingyao.insticator.questionmanager.dao.CheckBoxRepository;
import com.jingyao.insticator.questionmanager.data.CheckBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CheckBoxService {

    @Autowired
    private CheckBoxRepository checkBoxRepository;

    public List<CheckBox> getAllCheckBox() {
        return checkBoxRepository.findAll();
    }

    public CheckBox getCheckBoxById(Integer cid) {
        return checkBoxRepository.findOne(cid);
    }

    public List<CheckBox> getCheckBoxByQuestion(String cquestion) {
        return checkBoxRepository.findByCquestionContaining(cquestion);
    }

    public List<CheckBox> getCheckBoxByChoices(String cchoices) {
        return checkBoxRepository.findByCchoicesContaining(cchoices);
    }

    //return false if there is a checkbox with the same id in table
    public boolean addCheckBox(CheckBox checkbox) {
        int cid = checkbox.getCid();
        if (checkBoxRepository.findOne(cid) == null) {
            checkBoxRepository.save(checkbox);
            return true;
        }
        return false;
    }

    //return false if there is no checkbox in table with the given id
    public boolean updateCheckBox(CheckBox checkbox) {
        int cid = checkbox.getCid();
        if (checkBoxRepository.findOne(cid) != null) {
            checkBoxRepository.save(checkbox);
            return true;
        }
        return false;
    }

    //return false if there is no checkbox with the given id in the table
    public boolean deleteCheckBox(CheckBox checkbox) {
        int cid = checkbox.getCid();
        if (checkBoxRepository.findOne(cid) != null) {
            checkBoxRepository.delete(cid);
            return true;
        }
        return false;
    }
}
