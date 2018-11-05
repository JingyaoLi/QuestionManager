package com.jingyao.insticator.questionmanager.controller;

import com.jingyao.insticator.questionmanager.service.MatricService;
import com.jingyao.insticator.questionmanager.view.MatricView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//This controller is used for questioner to do CRUD process for Matric
@RestController
@RequestMapping("matric")
public class MatricController {

    @Autowired
    private MatricService matricService;

    @GetMapping("findAll")
    public List<MatricView> getAllMatric() {
        return matricService.getAllMatric();
    }

    @GetMapping("findById/{mid}")
    public MatricView getMatricById(@PathVariable("mid") Integer mid) {
        return matricService.getMatricById(mid);
    }

    @GetMapping("findByQuestion/{mquestion}")
    public List<MatricView> getMatricByQuestion(@PathVariable("mquestion") String mquestion) {
        return matricService.getMatricByQuestion(mquestion);
    }

    @GetMapping("findByChoices/{moptions}")
    public List<MatricView> getMatricByChoices(@PathVariable("moptions") String moptions) {
        return matricService.getMatricByOptions(moptions);
    }

    @PostMapping("add")
    private boolean addMatric(@RequestBody MatricView matricView) {
        return matricService.addMatric(matricView);
    }

    @PostMapping("update")
    private boolean updateMatric(@RequestBody MatricView matricView) {
        return matricService.updateMatric(matricView);
    }

    @PostMapping("delete")
    private boolean deleteMatric(@RequestBody MatricView matricView) {
        return matricService.deleteMatric(matricView);
    }
}
