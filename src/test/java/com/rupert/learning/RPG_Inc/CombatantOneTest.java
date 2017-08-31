package com.rupert.learning.RPG_Inc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CombatantOneTest {
    
    @Test
    public void returnCombatantOne() {
    	CombatantOne combatantOne = new CombatantOne ("'Mark the Fister'", 4, 8, "'Iron Fist'", 4);
    	assertEquals("'Mark the Fister', 4, 8, 'Iron Fist', 4",combatantOne.toString());
    }
    
}
