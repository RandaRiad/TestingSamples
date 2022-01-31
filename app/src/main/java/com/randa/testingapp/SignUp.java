package com.randa.testingapp;

public class SignUp {
    private String name;
    private int id;

    public SignUp() {


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String check(){
        if (name== null ) return null;
        else return name;
    }
}
