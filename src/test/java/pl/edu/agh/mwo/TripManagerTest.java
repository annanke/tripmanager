package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class TripManagerTest {
	
	@Test
	public void isTripAdded() {
		Trip trip =new Trip();
				
		assertEquals(0, trip.getPhotos().size());
		assertEquals(1, trip.getPhotos().size());
	}
	
/*	@Test(expected= IllegalArgumentException.class)
	public void noPhotoAdded() {
		Trip trip =new Trip();
		Photo photo = null;
		trip.addPhoto(photo);
		
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void emptyPhotoAdded() {
		Trip trip =new Trip();
		Photo photo = new Photo("");;
		trip.addPhoto(photo);
		
	}*/
	
}
