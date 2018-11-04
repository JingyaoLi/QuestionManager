package com.jingyao.insticator.questionmanager.controller;

import com.jingyao.insticator.questionmanager.data.CheckBox;
import com.jingyao.insticator.questionmanager.service.CheckBoxService;
import com.sun.jnlp.CheckServicePermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("checkbox")
public class CheckBoxController {

    @Autowired
    private CheckBoxService checkBoxService;

    @GetMapping("findAll")
    public List<CheckBox> getAllCheckBox() {
        return checkBoxService.getAllCheckBox();
    }

    @GetMapping("findById/{cid}")
    public CheckBox getCheckBoxById(@PathVariable("cid") Integer cid) {
        return checkBoxService.getCheckBoxById(cid);
    }

    @GetMapping("findByQuestion/{cquestion}")
    public List<CheckBox> getTCheckBoxByQuestion(@PathVariable("cquestion") String cquestion) {
        return checkBoxService.getCheckBoxByQuestion(cquestion);
    }

    @GetMapping("findByAnswer/{cchoices}")
    public List<CheckBox> getCheckBoxByChoices(@PathVariable("cchoices") String cchoices) {
        return checkBoxService.getCheckBoxByChoices(cchoices);
    }

    @PostMapping("add")
    private boolean addCheckBox(@RequestBody CheckBox checkBox) {
        return checkBoxService.addCheckBox(checkBox);
    }

    @PostMapping("update")
    private boolean updateCheckBox(@RequestBody CheckBox checkBox) {
        return checkBoxService.updateCheckBox(checkBox);
    }

    @PostMapping("delete")
    private boolean deleteCheckBox(@RequestBody CheckBox checkBox) {
        return checkBoxService.deleteCheckBox(checkBox);
    }
}
