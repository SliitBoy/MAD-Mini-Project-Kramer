package com.example.mad_quizes;

import java.util.ArrayList;

public class Question {
    private int id;
    private String question;
    private int answerindex;
    private ArrayList<Answer> answerlist;
    public Question(int id, String question) {
        this.answerlist=new ArrayList();
        this.id = id;
        this.question = question;

    }
    public Question(int id, String question, ArrayList answerlist) {
        this.id = id;
        this.question = question;
        this.answerlist = answerlist;
    }
    public Question(int id, String question, int answerindex, ArrayList answerlist) {
        this.id = id;
        this.question = question;
        this.answerindex = answerindex;
        this.answerlist = answerlist;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswerindex(int answerindex) {
        this.answerindex = answerindex;
    }

    public void setAnswerlist(ArrayList answerlist) {
        this.answerlist = answerlist;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public int getAnswerindex() {
        return answerindex;
    }

    public ArrayList getAnswerlist() {
        return answerlist;
    }

    public  void addAnswer(Answer ans){
        this.answerlist.add(ans);
    }
}
