package com.rupert.learning.RPG_Inc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CombatEngineTest {
    
	@Test
    public void returnTrue() {
		CombatEngine ce = new CombatEngine();
        assertTrue( ce.battle() );
    }
}
