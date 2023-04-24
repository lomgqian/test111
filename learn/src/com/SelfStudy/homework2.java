package com.SelfStudy;
public class homework2 {
    public static void main(String[] args){
        music music01=new music("xxx",300);
        music01.play();
        System.out.println(music01.getInfo());
    }
}
class music{
    String name;
    int times;
    public music(String name, int times){
        this.name=name;
        this.times=times;
    }
    public void play(){
        System.out.println(name+times);
    }
    public String getInfo(){
        return name+times;
    }
}