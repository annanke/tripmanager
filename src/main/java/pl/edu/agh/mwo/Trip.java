package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class Trip {
	String name;
	String description;
	ArrayList<Photo> photos=new ArrayList<>();

	Trip(){
	}
	
	Trip(String name, String description){
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
