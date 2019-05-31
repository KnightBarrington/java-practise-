package helloWorld;

public class rectangle {
public int height;
public int width;
public int perimeter;
public int area;
public int noOfSides;

public void Rectangle( int height, int width) {
	this.height = height;
	this.width = width;
	this.noOfSides = 4;
	this.area = width *height;
	this.perimeter = (width*2) + (height*2);
	
	
	
	
	}
}

