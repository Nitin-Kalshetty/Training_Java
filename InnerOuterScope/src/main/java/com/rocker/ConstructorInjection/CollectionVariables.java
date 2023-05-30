package com.rocker.ConstructorInjection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class CollectionVariables {

	public List<String> myCitiesList(){
		return Arrays.asList("Gulbarga", "Chennai", "Bengaluru");
	}
	
	public Set<String> myCitiesSet(){
		return new HashSet<String>(Arrays.asList("Gulbarga", "Chennai", "Bengaluru"));
	}
	
	public Map<Integer,String> myCitiesMap(){
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Gulbarga");
		map.put(2, "Chennai");
		map.put(3, "Bengaluru");
		return map;
	}
	
}
