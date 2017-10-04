package reference;
/** 
 * Parent class for all Animal type objects.
 * <p>
 * Check here for any methods you want to use and descriptions of them
 * @author Isaac Blum
 */
public class Animal {
    int legs;
    boolean whiskers;
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
