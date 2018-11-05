package com.jingyao.insticator.questionmanager.transfer;

import com.jingyao.insticator.questionmanager.data.Trivia;
import com.jingyao.insticator.questionmanager.view.TriviaView;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TriviaTransfer {

    public static TriviaView transfer(Trivia trivia) {
        TriviaView triviaView = new TriviaView();
        triviaView.setTid(trivia.getTid());
        triviaView.setTquestion(trivia.getTquestion());
        String tchoices = trivia.getTchoices();
        String[] tc = tchoices.substring(1, tchoices.length() - 1).split(",");
        triviaView.setTchoices(Arrays.asList(tc));
        return triviaView;
    }

    public static List<TriviaView> transfer(List<Trivia> trivias) {
        List<TriviaView> list = new LinkedList<TriviaView>();
        for (Trivia t : trivias) {
            list.add(transfer(t));
        }
        return list;
    }
}
