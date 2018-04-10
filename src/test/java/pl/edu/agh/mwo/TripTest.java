package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TripManagerTest {
	
	@Test
	public void isPhotoAdded() {
		Trip trip =new Trip();
		Photo photo=new Photo();
		//assertTrue(trip.addPhoto(photo));
		assertEquals(0, trip.getPhotos().size());
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());
	}
}
