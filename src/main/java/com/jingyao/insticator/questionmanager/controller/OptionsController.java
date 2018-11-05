package com.jingyao.insticator.questionmanager.controller;

import com.jingyao.insticator.questionmanager.data.Options;
import com.jingyao.insticator.questionmanager.service.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//This controller is used for questioner to do CRUD process for Options, which would be used for matric questions
@RestController
@RequestMapping("options")
public class OptionsController {

    @Autowired
    private OptionsService optionsService;

    @GetMapping("findAll")
    public List<Options> getAllOptions() {
        return optionsService.getAllOptions();
    }

    @GetMapping("findById/{oid}")
    public Options getOptionsById(@PathVariable("oid") Integer oid) {
        return optionsService.getOptionsById(oid);
    }

    @GetMapping("findByName/{oname}")
    public List<Options> getOptionsByQuestion(@PathVariable("oname") String oname) {
        return optionsService.getOptionsByName(oname);
    }

    @GetMapping("findByChoices/{ochoices}")
    public List<Options> getOptionsByChoices(@PathVariable("ochoices") String ochoices) {
        return optionsService.getOptionsByChoices(ochoices);
    }

    @PostMapping("add")
    private boolean addOptions(@RequestBody Options options) {
        return optionsService.addOptions(options);
    }

    @PostMapping("update")
    private boolean updateOptions(@RequestBody Options options) {
        return optionsService.updateOptions(options);
    }

    @PostMapping("delete")
    private boolean deleteOptions(@RequestBody Options options) {
        return optionsService.deleteOptions(options);
    }

}
