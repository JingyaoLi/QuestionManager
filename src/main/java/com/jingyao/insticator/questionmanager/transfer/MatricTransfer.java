package com.jingyao.insticator.questionmanager.transfer;

import com.jingyao.insticator.questionmanager.dao.OptionsRepository;
import com.jingyao.insticator.questionmanager.data.Matric;
import com.jingyao.insticator.questionmanager.data.Options;
import com.jingyao.insticator.questionmanager.view.MatricView;

import java.util.LinkedList;
import java.util.List;

public class MatricTransfer {

    static OptionsRepository optionsRepository;

    public static Matric transfer(MatricView matricView) {
        Matric matric = new Matric();
        matric.setMid(matricView.getMid());
        matric.setMquestion(matricView.getMquestion());
        List<Integer> optionsList = new LinkedList<Integer>();
        for (Options o : matricView.getMoptions()) {
            optionsList.add(o.getOid());
        }
        matric.setMoptions(optionsList.toString());
        return matric;
    }

    public static List<Matric> transferToMatricList(List<MatricView> matricViews) {
        List<Matric> matrics = new LinkedList<Matric>();
        for (MatricView m : matricViews) {
            matrics.add(transfer(m));
        }
        return matrics;
    }

    public static MatricView transfer(Matric matric) {
        MatricView matricView = new MatricView();
        matricView.setMid(matric.getMid());
        matricView.setMquestion(matric.getMquestion());
        String moptions = matric.getMoptions();
        String[] optionsList = moptions.substring(1, moptions.length() - 1).split(",");
        List<Options> oList = new LinkedList<Options>();

        for (String s : optionsList) {
            oList.add(optionsRepository.findOne(Integer.parseInt(s)));
        }
        matricView.setMoptions(oList);
        return matricView;
    }

    public static List<MatricView> transferToMatricViewList(List<Matric> matrics) {
        List<MatricView> matricViews = new LinkedList<MatricView>();
        for (Matric m : matrics) {
            matricViews.add(transfer(m));
        }
        return matricViews;
    }

}
