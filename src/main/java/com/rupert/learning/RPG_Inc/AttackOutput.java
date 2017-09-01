package com.rupert.learning.RPG_Inc;

public class AttackOutput {
  
	public int round;
	public String attacker;
	public String defender;
	public String weapon;
    public int damage;
    public int c1health;
    public int c2health;
   
    public AttackOutput(int round, String attacker, String defender, String weapon, 
    		int damage, int c1health, int c2health) {
       
    	this.round = round;
        this.attacker = attacker;
        this.defender = defender;
        this.weapon = weapon;
        this.damage = damage;
        this.c1health = c1health;
        this.c2health = c2health;
    }

   @Override
   public String toString() {
        return this.round + ", " + this.attacker + ", " + this.defender + ", " + this.weapon 
        		+ ", " + this.damage + ", " + this.c1health + ", " + this.c2health;
    }
	
}