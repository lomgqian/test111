package com.hspedu.poly_;

public class poly01 {
   public static void main(String[] args) {
        master tom =new master("汤姆");
        dog dog=new dog("ys");
       bone bone=new bone("bone");
        tom.feed(dog, bone);


        cat cat=new cat("xyj");
      fish fish=new fish("fish");
      System.out.println("=======================");
      tom.feed(cat,fish);

      pig pig=new pig("zx");
      rice rice=new rice("rice");
      System.out.println("=======================");
      tom.feed(pig,rice);

     }
}
