package com.hspedu.poly_;

public class master {
    private String name;
    public master(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public void feed(animal animal,food food){
        System.out.println(name+animal.getname()+food.getname());
    }
}
