package com.nischal.game;
public class Main {
    public static void main(String[] args) {

        Player1 p1 = new Player1("Nischal","Machine Gun",103);
        System.out.println("Player 1"+"\nName :"+p1.getName()+"\nGun :"+ p1.getGun()+"\nhealth :"+p1.getHealth());

        Player2 p2 = new Player2("Ram","Automatic Rifle",1000,true);
        System.out.println("Player 2"+"\nName :"+p2.getName()+"\nGun :"+ p2.getGun()+"\nhealth :"+p2.getHealth()+"\nArmour :"+p2.isArmour());

        p1.damageGun1();
        p1.damageGun2();
        p1.damageGun1();
        p1.getHealth();
//
        p2.damageGun1();
        p2.damageGun2();
        p2.damageGun2();




    }
}