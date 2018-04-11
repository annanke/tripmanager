package pl.edu.agh.mwo;

import java.util.ArrayList;

public class TripManager {
	
	private ArrayList<Trip> trips=new ArrayList<>();


	public ArrayList getTrip() {
		return trips;
	}


	public void addTrip(Trip trip) {
		trips.add(trip);
	}


	public void removeTrip(Trip trip) {
		trips.remove(trip);
		
	}

	public Trip findTrip(String keyword) {
		for (Trip trip :trips) {
			if(trip.name.equals(keyword) || trip.description.contains(keyword)) {
				return trip;
			}
		}
		return null;
	}


}
