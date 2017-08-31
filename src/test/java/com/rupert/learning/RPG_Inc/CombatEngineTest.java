package com.rupert.learning.RPG_Inc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CombatEngineTest {
     
    @Test
    public void battleWithNoRounds() {
    	CombatantOne combatantOne = new CombatantOne ("'Mark the Fister'", 4, 8, "'Iron Fist'", 4);
    	CombatantTwo combatantTwo = new CombatantTwo ("'John the Bagger'", 1, 7, "'Small Bag'", 1);
    	CombatEngine ce = new CombatEngine(combatantOne,combatantTwo);
    	ce.battle();
    	
    	assertEquals("'Mark the Fister'", ce.combatantOne.name); assertEquals(4, ce.combatantOne.speed); assertEquals(8, ce.combatantOne.health); 
    	assertEquals("'Iron Fist'", ce.combatantOne.weapon); assertEquals(4, ce.combatantOne.damage); 
    	
    	assertEquals("'John the Bagger'", ce.combatantTwo.name); assertEquals(1, ce.combatantTwo.speed); assertEquals(7, ce.combatantTwo.health); 
    	assertEquals("'Small Bag'", ce.combatantTwo.weapon); assertEquals(1, ce.combatantTwo.damage); 
    	
    }
    
}
