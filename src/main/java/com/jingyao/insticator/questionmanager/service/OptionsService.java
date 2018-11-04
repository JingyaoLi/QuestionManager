package com.jingyao.insticator.questionmanager.service;

import com.jingyao.insticator.questionmanager.dao.OptionsRepository;
import com.jingyao.insticator.questionmanager.data.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OptionsService {

    @Autowired
    private OptionsRepository optionsRepository;

    public List<Options> getAllOptions() {
        return optionsRepository.findAll();
    }

    public Options getOptionsById(Integer oid) {
        return optionsRepository.findOne(oid);
    }

    public List<Options> getOptionsByName(String oname) {
        return optionsRepository.findByOnameContaining(oname);
    }

    public List<Options> getOptionsByChoices(String ochoices) {
        return optionsRepository.findByOchoicesContaining(ochoices);
    }

    //return false if there is a options with the same id in table
    public boolean addOptions(Options options) {
        int oid = options.getOid();
        if (optionsRepository.findOne(oid) == null) {
            optionsRepository.save(options);
            return true;
        }
        return false;
    }

    //return false if there is no options in table with the given id
    public boolean updateOptions(Options options) {
        int oid = options.getOid();
        if (optionsRepository.findOne(oid) != null) {
            optionsRepository.save(options);
            return true;
        }
        return false;
    }

    //return false if there is no options with the given id in the table
    public boolean deleteOptions(Options options) {
        int oid = options.getOid();
        if (optionsRepository.findOne(oid) != null) {
            optionsRepository.delete(oid);
            return true;
        }
        return false;
    }
}
