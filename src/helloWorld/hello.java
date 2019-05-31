package helloWorld;

public class hello {
	
public static void main (String[] args) {
	
	sayHelloWorld();
	
	String name;
	name = "knightz";
	
	sayHelloTo(name);
	
	Add(9000, 500);
	
 }	
 
public static void Add ( int a, int b) {
	System.out.println(a+b);
}
	
	

static void sayHelloWorld() {
	
	 System.out.println("Hello World!!!");
	 
}
	 
static String sayHelloTo(String name) {
		 String power = " Ur Power Level = ";
		System.out.println("Hello, "+ name + power);
		return name;
	 }
	 
	 
}

