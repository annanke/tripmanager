package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class PhotoTest {
	
	@Test(expected= IllegalArgumentException.class)
	public void noPathwayForPhotoWhenCreated() {
		Photo photo = new Photo("", "opis");
	}
	
	@Test(expected= NullPointerException.class)
	public void nullPathwayForPhotoWhenCreated() {
		Photo photo = new Photo(null, "opis");
	}
	
	@Test
	public void photoCommentExists() {
		Photo photo = new Photo("CracowWinter.JPG", "krakow zima");
		assertEquals("krakow zima", photo.comment);
	}
	
}
