package com.hspedu.encap;

public class encapsulation {
    public static void main(String[] args){
        Person p=new Person();
        p.setname("jack");
        p.setage( 30);
        p.setsalary(30000.00);
        System.out.println(p.info());
    }
    
}
class Person{
     public String name;
     private int age;
     private double salary;

    public void setname(String name){
        if(name.length()>2&&name.length()<6){
        this.name=name;}
        else{
            this.name="tom";
        }
    }
    public String getname(){
        return name;
     }

    public void setage(int age){
        if(age>0&&age<120){
        this.age=age;}
        else{
            System.out.println("no");
            this.age=18; 
        }
    }
    public int getage(){
        return age;
     }

    public void setsalary(Double salary){
        this.salary=salary;
    }
    public double getsalary(){
        return salary;
     }
     public String info(){
        return name+age+salary;
     }
}
