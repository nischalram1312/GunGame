package com.nischal.game;

public class Player1 {
    private String name;
    private String gun;
    private int health;


    Player1(String name, String gun, int health){
        this.name=name;
        this.gun=gun;
        if(health<0){
            this.health=0;
        }else if(health>100){
            this.health=100;
        }else {
            this.health = health;
        }
    }
    Player1(String name, String gun){
        this.name=name;
        this.gun=gun;
    }

    public void damageGun1(){
        this.health-=30;
        if(this.health<=0){
            this.health=0;
        }
        System.out.println("Got hit by gun1 and our health is reduced by 30, our health is "+this.health);
        if(this.health==0){
            System.out.println(getName()+" is dead");
        }
    }

    public void damageGun2(){
        this.health-=50;
        if(this.health<=0){
            this.health=0;
        }
        System.out.println("Got hit by gun1 and our health is reduced by 50, our health is "+this.health);
        if(this.health==0){
            System.out.println(getName()+"is dead");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
