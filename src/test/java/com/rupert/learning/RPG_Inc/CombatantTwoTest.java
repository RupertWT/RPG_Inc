package com.rupert.learning.RPG_Inc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CombatantTwoTest {
    
    @Test
    public void returnCombatantTwo() {
    	CombatantTwo combatantTwo = new CombatantTwo ("'John the Bagger'", 1, 7, "'Small Bag'", 1);
    	assertEquals("'John the Bagger', 1, 7, 'Small Bag', 1",combatantTwo.toString());
    }
         
}
