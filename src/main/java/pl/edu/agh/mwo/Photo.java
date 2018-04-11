package pl.edu.agh.mwo;

import java.io.File;

public class Photo extends File{
	
	public String comment; // wg diagramu rozumiem ze to pole jest publiczne, pomijam wiec tworzenie geterow i setterow
	
	public Photo(String pathname) {
		super(pathname);
	}
	
	public Photo(String pathname, String comment) {
		super(pathname);
		if (pathname.length()==0) {
			throw new IllegalArgumentException();
		}
		this.comment=comment;
	}
}
