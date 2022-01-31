package com.randa.testingapp;

public class Login {

    private String name;
    private int id;

    public Login() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean check(){
        if (name== null || id==0) return false;
        else return true;
    }


    public int sum(int first, int second){
        return first+second;
    }
}
