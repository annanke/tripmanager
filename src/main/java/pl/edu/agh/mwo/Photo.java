package pl.edu.agh.mwo;

import java.io.File;

public class Photo extends File{


	//File photo; //= new File("CracowWinter.JPG");
	String comment;
	
	public Photo(String pathname) {
		super(pathname);
	}
	
	public Photo(String pathname, String comment) {
		super(pathname);
		this.comment=comment;
	}
	
/*	Photo (File file){
		this.photo=file;
	}*/
}
