package com.example.mad_quizes;

public class Answer {
    private int id;
    private int questionid;
    private int answerindex;
    private boolean istrue;

    public Answer(int id, int questionid, int answerindex) {
        this.id = id;
        this.questionid = questionid;
        this.answerindex = answerindex;
    }

    public Answer(int id, int questionid, int answerindex, boolean istrue) {
        this.id = id;
        this.questionid = questionid;
        this.answerindex = answerindex;
        this.istrue = istrue;
    }

    public int getId() {
        return id;
    }

    public int getQuestionid() {
        return questionid;
    }

    public int getAnswerindex() {
        return answerindex;
    }

    public boolean isIstrue() {
        return istrue;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestionid(int questionid) {
        this.questionid = questionid;
    }

    public void setAnswerindex(int answerindex) {
        this.answerindex = answerindex;
    }

    public void setIstrue(boolean istrue) {
        this.istrue = istrue;
    }
}
