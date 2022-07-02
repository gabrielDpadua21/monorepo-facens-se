package com.padua.tech.quizz.model;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private String text;
    private List<String> options = new ArrayList<>();
    private int correct;

    public Question(String text, int correct, String... options) {
        this.text = text;
        this.correct = correct;
        this.options.add(options[0]);
        this.options.add(options[1]);
        this.options.add(options[2]);
        this.options.add(options[3]);
    }

    public String getText() {
        return text;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrect() {
        return correct;
    }

}
