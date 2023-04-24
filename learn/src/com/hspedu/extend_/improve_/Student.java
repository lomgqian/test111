package com.hspedu.extend_.improve_;

public class Student {
    public String name;
    public int age;
    private double score;

    public  void setscore(double score) {
        this.score=score;
    }
    public void showinfo(){
        System.out.println(name+age+score);
     }
}
