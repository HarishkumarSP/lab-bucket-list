package service;

import java.util.ArrayList;
import java.util.List;

import model.TouristPlace;

public class ListOperations{
	ArrayList<TouristPlace> tour = new ArrayList<>(); 
	public List<TouristPlace> add(TouristPlace places){
	tour.add(places);
	return tour;
}
	public List<TouristPlace> remove(TouristPlace places){
	tour.remove(places);
	return tour;	
}
	public Object sortByDestination(List<TouristPlace> places) {
	ArrayList<TouristPlace> DestinationPlace=new ArrayList<>();	
	DestinationPlace.sort((d1,d2) -> d1.getDestination().compareTo(d2.getDestination()));
	return DestinationPlace;
}
		
	public Object sortByRank(List<TouristPlace> places) {
	ArrayList<TouristPlace> Rank=new ArrayList<>();	
	Rank.sort((r1,r2) -> r1.getRank().compareTo(r2.getRank()));
	return Rank;	
	}
	
	public Object reset(List<TouristPlace> places) {
	ArrayList<TouristPlace> reset=new ArrayList<>();	
	reset.clear();
	return reset;
	}
}

	
	
	
	
}