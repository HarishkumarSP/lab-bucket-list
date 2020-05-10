package service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import model.TouristPlace;

public class MapOperations{
	Map<String,TouristPlace> addPlaces=new HashMap<>();
		public Map<String,TouristPlace> add(TouristPlace places){
			addPlaces.put( null, places);
			return addPlaces;
		}
		
		public Map<String,TouristPlace> sortRandomly(TouristPlace places){
			Map<String,TouristPlace> sortPlaces=new HashMap<>();
			sortPlaces.put( null, places);
			return sortPlaces;	
		}
		
		public Map<String,TouristPlace> sortInEntryOrder(TouristPlace places){
			Map<String,TouristPlace> sortOrder=new LinkedHashMap<>();
			 sortOrder.put( null, places);
			return  sortOrder;		
		}
		
		public Map<String,TouristPlace> sortAlphabetically(TouristPlace places){
			Map<String,TouristPlace> sortAlphabetically=new TreeMap<>();
			 sortAlphabetically.put( null, places);
			return  sortAlphabetically;
		}
		
		public Object reset(HashMap<String,TouristPlace> places) {
			Map<String,TouristPlace> resetPlaces=new TreeMap<>();
			resetPlaces.clear();
			return resetPlaces;			
		}
		
		public Map<String, TouristPlace> remove(TouristPlace places){
			Map<String,TouristPlace> removePlace=new HashMap<>();
			removePlace.remove( null, places);
			return removePlace;
			
		}

	}
	
	
	
	
	
}