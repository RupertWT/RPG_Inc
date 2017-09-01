package com.rupert.learning.RPG_Inc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CombatEngineTest {
     
    @Test
    public void fasterAttackerDealsDamageUntilDeath() {
    	CombatantOne combatantOne = new CombatantOne ("'Mark the Fister'", 4, 8, "'Iron Fist'", 4);
    	CombatantTwo combatantTwo = new CombatantTwo ("'John the Bagger'", 1, 7, "'Small Bag'", 1);
    	AttackOutput attackoutput = new AttackOutput (0, null, null, null, 0, 0, 0);
    	CombatEngine combatResult = new CombatEngine(combatantOne,combatantTwo,attackoutput);
    	   	
    	assertEquals("1, 'John the Bagger', 'Mark the Fister', 'Small Bag', 1, 7, 7\n"
    			+ "2, 'John the Bagger', 'Mark the Fister', 'Small Bag', 1, 6, 7\n"
    			+ "3, 'John the Bagger', 'Mark the Fister', 'Small Bag', 1, 5, 7\n"
    			+ "4, 'John the Bagger', 'Mark the Fister', 'Small Bag', 1, 4, 7\n"
    			+ "5, 'John the Bagger', 'Mark the Fister', 'Small Bag', 1, 3, 7\n"
    			+ "6, 'John the Bagger', 'Mark the Fister', 'Small Bag', 1, 2, 7\n"
    			+ "7, 'John the Bagger', 'Mark the Fister', 'Small Bag', 1, 1, 7\n"
    			+ "8, 'John the Bagger', 'Mark the Fister', 'Small Bag', 1, 0, 7",combatResult.battle()); 
 		
    }
    
}
