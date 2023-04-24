package com.hspedu.encap;

public class Account {
    private String name;
    private double balance;
    private String qwd;

    public Account(){}
    public Account(String name,double balance,String qwd){
        this.setname(name);;
        this.setbalance(balance);;
        this.setqwd(qwd);
    }

    public void setname(String name){
        if(name.length()>=2&&name.length()<=4){
        this.name=name;}
        else{
            this.name="tom";
        }
    }
    public String getname(){
        return name;
     }

    public void setbalance(Double balance){
        if(balance>20){
        this.balance=balance;}
        else{
            System.out.println("no");
            this.balance=0; 
        }
    }
    public double getbalance(){
        return balance;
     }

    public void setqwd(String qwd){
        if(qwd.length()==6){
        this.qwd=qwd;}
        else{this.qwd="666666";}
    }
    public String getqwd(){
        return qwd;
     }
     public void info(){
         System.out.println(name+balance+qwd);
     }
    
}
