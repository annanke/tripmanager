package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class PhotoTest {
	
/*	@Test
	public void isPhotoAdded() {
		Trip trip =new Trip();
		//Photo photo=new Photo(new File("CracowWinter.JPG"));
		Photo photo=new Photo("CracowWinter.JPG");
		//assertTrue(trip.addPhoto(photo));
		assertEquals(0, trip.getPhotos().size());
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());
	}*/
	
	@Test(expected= IllegalArgumentException.class)
	public void noPathwayForPhotoWhenCreated() {
		Photo photo = new Photo("", "opis");
	}
	
	@Test(expected= NullPointerException.class)
	public void nullPathwayForPhotoWhenCreated() {
		Photo photo = new Photo(null, "opis");
	}
	
}
