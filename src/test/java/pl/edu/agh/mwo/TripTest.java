package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class TripTest {
	
	@Test
	public void isPhotoAdded() {
		Trip trip =new Trip("Mexico", "samolotem do Cancun");
		Photo photo=new Photo("CracowWinter.JPG");
		assertEquals(0, trip.getPhotos().size());
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void noPhotoAdded() {
		Trip trip =new Trip("Mexico", "samolotem do Cancun");
		Photo photo = null;
		trip.addPhoto(photo);
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void emptyPhotoAdded() {
		Trip trip =new Trip("Mexico", "samolotem do Cancun");
		Photo photo = new Photo("");;
		trip.addPhoto(photo);
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void noTripNameAdded() {
		Trip trip =new Trip("", "samolotem do Cancun");
	}
	
/*	@Test
	public void TripNameExists() {
		Trip trip =new Trip("Mexico", "samolotem do Cancun");
		assertEquals("Mexico", trip.name);
	}
	
	@Test
	public void TripDescriptionExists() {
		Trip trip =new Trip("Mexico", "samolotem do Cancun");
		assertEquals("samolotem do Cancun", trip.description);
	}*/
	
}
