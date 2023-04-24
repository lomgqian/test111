package com.hspedu.extend_;

public class extendtheory {
    public static void main(String[] args) {
son son=new son();
son.age=19;
    }
}
class grandpa{
    String name="大头爷爷";
    String hobby="旅游";
}
class father extends grandpa{
    String name="大头爸爸";
    int age =39;
}
class son extends father{
    String name="大头儿子";
}   