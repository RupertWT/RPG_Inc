package com.rupert.learning.RPG_Inc;

public class CombatEngine {
	
	CombatantOne combatantOne;
	CombatantTwo combatantTwo;
	AttackOutput attackOutput;

    public CombatEngine(CombatantOne combatantOne, CombatantTwo combatantTwo, AttackOutput attackOutput) {
        this.combatantOne = combatantOne;
        this.combatantTwo = combatantTwo;
        this.attackOutput = attackOutput;   
    }
	
    public String battle() {
    	
    	//round1 battle
    	attackOutput.round=1;
    	
    	if (combatantOne.speed <= combatantTwo.speed) {
    		attackOutput.attacker= combatantOne.name;
    		attackOutput.defender= combatantTwo.name;
    		attackOutput.weapon=combatantOne.weapon;
    		attackOutput.damage=combatantOne.damage;
    		attackOutput.c1health=combatantOne.health;
        	attackOutput.c2health=combatantTwo.health-attackOutput.damage; 
    	} else {
    		attackOutput.attacker= combatantTwo.name;
    		attackOutput.defender= combatantOne.name;
    		attackOutput.weapon=combatantTwo.weapon;
    		attackOutput.damage=combatantTwo.damage;
    		attackOutput.c1health=combatantOne.health-attackOutput.damage;
        	attackOutput.c2health=combatantTwo.health; 
    	}
    	
    	return attackOutput.round + ", " + attackOutput.attacker + ", " + attackOutput.defender 
    			+ ", " + attackOutput.weapon + ", " + attackOutput.damage 
    			+ ", " + attackOutput.c1health + ", " + attackOutput.c2health;
            	
    }
	
}
