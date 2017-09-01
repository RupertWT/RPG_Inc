package com.rupert.learning.RPG_Inc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AttackOutputTest {
    
    @Test
    public void returnAttackOutput() {
    	AttackOutput AO = new AttackOutput (1,"'John The Bagger'","'Mark The Fister'","'Small Bag'",1,7,7);
    	assertEquals("1, 'John The Bagger', 'Mark The Fister', 'Small Bag', 1, 7, 7",AO.toString());
    }
    
}