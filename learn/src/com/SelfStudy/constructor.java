package com.SelfStudy;
public class constructor {
    public static void main(String[] args) {
    Person p1=new Person("xxx", 80);
    System.out.println(p1.name);
    System.out.println(p1.age);
    Person p2=new Person("xxxx");
    System.out.println(p2.name);
    }
}
class Person{
    String name;
    int age;
    public Person(String pName,int pAge){
    System.out.println("gouzaoqi");
    name=pName;
    age=pAge;
    }
    public Person(String pName){
        
        name=pName;
    }
        
}