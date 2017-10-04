package javaProject1.reference;
/** 
 * Parent class for all Animal type objects.
 * <p>
 * Check here for any methods you want to use and descriptions of them
 * @author Isaac Blum
 */
public class Animal {
    int legs;
    boolean whiskers;
    /**
     * Allows user to check whether given object is a Cat type by testing fields
     * <p> 
     * Because it takes a Cat type object as a parameter, essentially checks to see if the object 
     * has been modified in any way beyond the original attributes of the stock Cat object.
     * @param cat : pass a Cat type item into this argument. 
     * @return A boolean value representing whether the parameter was an unmodified Cat object or not
     */
    public static boolean isItACat(Cat cat) {
    	boolean isCat;
    	if (cat.whiskers == true && cat.legs == 4) {
    		isCat = true;
    	} else {
    		isCat = false;
    	}
    	return isCat;
    }

}
