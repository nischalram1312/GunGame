package com.nischal.game;

public class Player2 extends Player1{
    private int health;
    private boolean armour;

    Player2(String name, String gun, int health, boolean armour){
        super(name, gun, health);
        this.armour=armour;
        if(health<0){
            this.health=0;
        }else if(health>100){
            this.health=100;
        }else {
            this.health = health;
        }
    }

    public boolean isArmour() {
        return armour;
    }

    public void setArmour(boolean armour) {
        this.armour = armour;
    }

    @Override
    public void damageGun1() {
        if(armour){
            this.health-=20;
            if(this.health<=0){
                this.health=0;
            }
            System.out.println("Armour is on and got hit by gun1 and health is reduced by 20, new health is "+this.health);
        }else {
            this.health -= 30;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Armour is off and got hit by gun1 and health is reduced by 30, new health is " + this.health);
        }
        if(isDead(this.health)){
            heal();
        }
    }

    @Override
    public void damageGun2(){
        if(armour){
            this.health-=40;
            if(this.health<=0){
                this.health=0;
            }
            System.out.println("Armour is on and got hit by gun1 and health is reduced by 40, new health is "+this.health);
        }else {
            this.health -= 50;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Armour is off and got hit by gun1 and health is reduced by 50, new health is " + this.health);
        }
        if(isDead(this.health)){
            heal();
        }
    }

    public void heal(){
        if(this.health<=0){
            this.health+=100;
            System.out.println("The health is "+this.health +" after healing");
        }else {
            System.out.println("Cant heal player as health not 0");
        }
    }

    public boolean isDead(int health){
        if(this.health==0){
            System.out.println(getName()+" is Dead");
            return true;
        }
        return false;
    }


}
