package com.hspedu.extend_.improve_;

public class extend02 {
    public static void main(String[] args) {
        com.hspedu.extend_.improve_.pupil pupil=new pupil();
        pupil.age=11;
        pupil.name="lqhd";
        pupil.setscore(66);
        pupil.testing();
        pupil.showinfo();

        com.hspedu.extend_.improve_.graduate graduate=new graduate();
        graduate.age=21;
        graduate.name="lqhd";
        graduate.setscore(99);
        graduate.testing();
        graduate.showinfo();
    }
}
