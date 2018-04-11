package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class TripManagerTest {
	
	@Test
	public void isTripAdded() {
		TripManager tripManager = new TripManager();
		assertEquals(0, tripManager.getTrip().size());
		Trip trip =new Trip();
		tripManager.addTrip(trip);
		assertEquals(1, tripManager.getTrip().size());
	}
	
	@Test
	public void isTripRemoved() {
		TripManager tripManager = new TripManager();
		Trip trip =new Trip();
		tripManager.addTrip(trip);
		assertEquals(1, tripManager.getTrip().size());
		tripManager.removeTrip(trip);
		assertEquals(0, tripManager.getTrip().size());
	}
	
	@Test
	public void TripFoundByName() {
		TripManager tripManager = new TripManager();
		Trip trip =new Trip("Mexico", "samolotem do Cancun");
		tripManager.addTrip(trip);
		assertNotNull(tripManager.findTrip("Mexico")); 
	}
	
	@Test
	public void TripFoundByPartOfDescription() {
		TripManager tripManager = new TripManager();
		Trip trip =new Trip("Mexico", "samolotem do Cancun");
		tripManager.addTrip(trip);
		assertNotNull(tripManager.findTrip("samolotem")); 
	}
	
	@Test
	public void returnNullWhenNoTripFound() {
		TripManager tripManager = new TripManager();
		Trip trip =new Trip("Mexico", "samolotem do Cancun");
		tripManager.addTrip(trip);
		assertNull(tripManager.findTrip("Peru"));
	}
	
	@Test
	public void returnNullWhenNoTripFoundByDescriprionPart() {
		TripManager tripManager = new TripManager();
		Trip trip =new Trip("Mexico", "samolotem do Cancun");
		tripManager.addTrip(trip);
		assertNull(tripManager.findTrip("autokarem"));
	}
	
	/*	
	@Test(expected= IllegalArgumentException.class)
	public void emptyPhotoAdded() {
		Trip trip =new Trip();
		Photo photo = new Photo("");;
		trip.addPhoto(photo);
		
	}*/
	
}
