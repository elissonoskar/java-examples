package com.kata.sorting;

import java.util.ArrayList;
import java.util.List;

public class Rack {
	List<String> list = new ArrayList<String>();

	public boolean addDrawnNumber(String number) {
		return list.add(number);
	}

	public List<String> getDrawnNumbers() {
		return list;
	}

}
