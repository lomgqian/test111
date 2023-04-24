package com.hspedu.extend_;

public class pupils {
    public String name;
    public int age;
    private double score;
    
    public  void setscore(double score) {
        this.score=score;
    }
    public  void testing() {
        System.out.println(name);
    }
    public void showinfo(){
        System.out.println(name+age+score);
     }
}
