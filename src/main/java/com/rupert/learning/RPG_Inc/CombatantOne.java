package com.rupert.learning.RPG_Inc;

public class CombatantOne {
  
	public String name;
    public int speed;
    public int health;
    public String weapon;
    public int damage;

    public CombatantOne(String name, int speed, int health, String weapon, int damage) {
        this.name = name;
        this.speed = speed;
        this.health = health;
        this.weapon = weapon;
        this.damage = damage;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.speed + ", " + this.health + ", " + this.weapon + ", " + this.damage;
    }
	
}
