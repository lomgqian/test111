package com.SelfStudy;


public class thistest {
    public static void main(String[] args) {

    }
}
class T{
    String name ="jack";
    int num =100;
    public T(){
        this("jack",100);
        System.out.println("");
    }
    public T(String name,int age){

        System.out.println("");
    }
    public void f1(){
        System.out.println("");
    }
    public void f2(){
        System.out.println("");
        f1();
        this.f1();
    }
    public void f3(){
        String name ="xxx";
        System.out.println(name+num);
        System.out.println(this.name+this.num);
    }
}