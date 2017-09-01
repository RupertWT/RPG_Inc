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
    	
    	String battleResults = "";
    	
		attackOutput.attacker = combatantTwo.name;
		attackOutput.defender = combatantOne.name;
		attackOutput.c1health = combatantOne.health;
		attackOutput.c2health = combatantTwo.health;
		attackOutput.weapon = combatantTwo.weapon;
		attackOutput.damage = combatantTwo.damage;
		
		for (int i = 1; attackOutput.c1health > 0; i++) {
			attackOutput.round = i;
			attackOutput.c1health = attackOutput.c1health-attackOutput.damage; 
	    	attackOutput.c2health = attackOutput.c2health;
	    	
	    	
	    	
	    	battleResults += attackOutput.round + ", " + attackOutput.attacker + ", " + attackOutput.defender 
	    			+ ", " + attackOutput.weapon + ", " + attackOutput.damage 
	    			+ ", " + attackOutput.c1health + ", " + attackOutput.c2health;
	    	
	    	if (attackOutput.c1health!=0) {
	    		battleResults += "\n";
	    	}
	    	
	    	if (attackOutput.c1health==0) {
	    		attackOutput.round = i+1;
	    		battleResults += "\n"
	    				+ attackOutput.round + ", " + attackOutput.defender + ", Dead";
	    	}
	    	
		}
    	
		System.out.println(battleResults);
    	return battleResults;
            	
    }
	
}
