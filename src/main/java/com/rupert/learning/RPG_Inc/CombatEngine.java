package com.rupert.learning.RPG_Inc;

public class CombatEngine {
	
	CombatantOne combatantOne;
	CombatantTwo combatantTwo;

    public CombatEngine(CombatantOne combatantOne, CombatantTwo combatantTwo) {
        this.combatantOne = combatantOne;
        this.combatantTwo = combatantTwo;
    }
	
    public void battle( ) {

    	
    	
    	
    }

	public void attack() {		
		
		if (combatantOne.speed <= combatantTwo.speed) {
			combatantTwo.health -= combatantOne.damage;
		} else {
			combatantOne.health -= combatantTwo.damage;
		}
		
	}
	
}
