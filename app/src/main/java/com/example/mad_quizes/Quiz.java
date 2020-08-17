package com.example.mad_quizes;

import java.util.ArrayList;

public class Quiz {
    private int id;
    private String name;
    private float rating;
    private ArrayList<Question> fji;
    public Quiz(int id,String name,float rating){
        this.id=id;
        this.name=name;
        setRating(rating);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRating(float rating) {
        if(rating<=5&&rating>=0){
            this.rating = rating;
        }else {
            throw new IllegalArgumentException("Rating should be between 0 and 5");
        }
    }

    public float getRating() {
        return rating;
    }
}
