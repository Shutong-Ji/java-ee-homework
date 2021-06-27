package com.example.HW5_3.model;

public class User {
    private int id;
    private String name;
    private String psd;



    public User(int id,String user,String pwd){
        this.id=id;
        this.name=user;
        this.psd=pwd;

    }


    public int getId(){return id;}
     public String getName(){return name;}
    public String getPsd(){return psd;}




}
