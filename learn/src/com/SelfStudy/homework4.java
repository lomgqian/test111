package com.SelfStudy;
public class homework4 {
    public static void main(String[] args){
      circle c=new circle();
      passObject po=new passObject();
      po.printAreas(c,5);
    }
}
class circle{
    double radius;
    public circle(){
      
    }
    public circle(double radius){
        this.radius=radius;
    }
    public double findArea(){
        return Math.PI*radius*radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
}
class passObject{
    public void printAreas(circle c,int times){
        System.out.println("radius\tarea");
        for(int i=1;i<=times;i++){
            c.setRadius(i);
            System.out.println((double)i+c.findArea());
        }
    }
}