package com.rupert.learning.RPG_Inc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CombatEngineTest {
     
    @Test
    public void dealDamageInOneRound() {
    	CombatantOne combatantOne = new CombatantOne ("'Mark the Fister'", 4, 8, "'Iron Fist'", 4);
    	CombatantTwo combatantTwo = new CombatantTwo ("'John the Bagger'", 1, 7, "'Small Bag'", 1);
    	AttackOutput attackoutput = new AttackOutput (0, null, null, null, 0, 0, 0);
    	CombatEngine combatResult = new CombatEngine(combatantOne,combatantTwo,attackoutput);
    	   	
    	assertEquals("1, 'John the Bagger', 'Mark the Fister', 'Small Bag', 1, 7, 7",combatResult.battle()); 
 		
    }
    
}
