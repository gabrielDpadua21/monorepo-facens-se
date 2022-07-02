package com.exemples.project02.entity;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private String title;
    private String area;
    private List<String> answres = new ArrayList<>();
    private int correctAnswer;

    public Question(String title, String area, int correctAnswer, String... answres) {
        this.title = title;
        this.area = area;
        this.correctAnswer = correctAnswer;
        this.answres.add(answres[0]);
        this.answres.add(answres[1]);
        this.answres.add(answres[2]);
        this.answres.add(answres[3]);
    }

    public String getTitle() {
        return title;
    }

    public String getArea() {
        return area;
    }

    public List<String> getAnswres() {
        return answres;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
