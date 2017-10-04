package javaProject1;
import reference.Cat;
/**
 * This is the class you want to run, as it is the only one with any real content, 
 * meaning a main() function.
 * 
 * @author Isaac Blum
 */
public class InitClass {
	/**
	 * This method just initializes a new Cat and checks to see if it has been modified by the next 
	 * line. It is just a method to test and practice some Java I just learned
	 */
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println(Cat.isItACat(cat));
	}
}
