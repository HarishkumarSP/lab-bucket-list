package service;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import model.TouristPlace;

public class  SetOperations{
	
	Set<TouristPlace> Place=new HashSet<>();	
public HashSet<TouristPlace> add(TouristPlace places){
	
	Place.add(places);
	return (HashSet<TouristPlace>) Place;

}
public HashSet<TouristPlace> remove(TouristPlace places){
	
	Place.remove(places);
	return  (HashSet<TouristPlace>) Place;
	
	
}
public Object sortByDestination(HashSet<TouristPlace> places) {
	
	TreeSet<TouristPlace> ts = new TreeSet<TouristPlace>((d1, d2) -> {
		return d1.getDestination().compareTo(d2.getDestination());
	});
		
	return ts;
	
}
public Object sortByRank(HashSet<TouristPlace> places) {
	
	TreeSet<TouristPlace> ts = new TreeSet<TouristPlace>((r1, r2) -> {
		return r1.getRank().compareTo(r2.getRank());
	});
		
	return ts;
	
}
public Object reset(HashSet<TouristPlace> places) {
	TreeSet<TouristPlace> ts = new TreeSet<TouristPlace>();
	ts.clear();
	return ts;
	
}

}