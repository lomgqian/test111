package com.SelfStudy;
public class homework1 {
    public static void main(String[] args){
       A01 a01 = new A01();
       double[] arr={1.9,2.8,34};
       Double res=a01.max(arr);
       if(res!=null){
        System.out.println(res);
       }
       else{
        System.out.println("wrong");
       }
    }
}
class A01{
    public Double max(double[] arr) {
        if(arr!=null&&arr.length>0){
        double max =arr[0];
        for (int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }else{
      return null;
    }
}
}
