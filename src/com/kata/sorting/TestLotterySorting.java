package com.kata.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class TestLotterySorting {
Rack rack = new Rack();
	@Test
	void test() {
	
	rack.addDrawnNumber("12");
	List<String> drawnNumbers = rack.getDrawnNumbers();
	assertEquals("12",drawnNumbers.get(0));
	
	rack.addDrawnNumber("09");
	drawnNumbers = rack.getDrawnNumbers();
	assertEquals("12",drawnNumbers.get(0));
	assertEquals("09",drawnNumbers.get(1));
	
	rack.addDrawnNumber("99");
	drawnNumbers = rack.getDrawnNumbers();
	assertEquals("12",drawnNumbers.get(0));
	assertEquals("09",drawnNumbers.get(1));
	assertEquals("99", drawnNumbers.get(2));
	}

}
