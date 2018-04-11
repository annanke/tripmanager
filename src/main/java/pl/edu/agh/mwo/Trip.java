package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class Trip {
	public String name; // wg diagramu rozumiem ze to pole jest publiczne, pomijam wiec tworzenie geterow i setterow
	public String description; // wg diagramu rozumiem ze to pole jest publiczne, pomijam wiec tworzenie geterow i setterow
	
	private ArrayList<Photo> photos=new ArrayList<>();

	Trip(String name, String description){
		if (name.length()==0) {
			System.out.println("Trip needs to have a name!");
			throw new IllegalArgumentException();
		}
		this.name=name;
		this.description=description;
	}
	
	public void addPhoto(Photo photo) {
		if (photo==null || photo.length()==0) {
			throw new IllegalArgumentException();
		}
		photos.add(photo);
	}

	public ArrayList<Photo> getPhotos() {
		return this.photos;
	}


}
