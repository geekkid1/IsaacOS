package isaacTerm;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import ref.Exceptions.*;
/**
 * This is a simple class that I will be using to practice using the Scanner class for console
 *  input. Like most of the classes in this project, this is useless for anything you might want
 *  to use it for that would actually have a legitimate use in everyday programming life.
 *  
 *  Also to test out a game I like to call "The exception game." Each time something happens to
 *  end the game (quite often actually), there will be some sort of customized throwable.
 * @author Isaac Blum
 */
public class IsaacOS {
	Scanner input = new Scanner(System.in);
	ArrayList<String> packageNames = new ArrayList<String>();
	Map<String, String[]> commands = new HashMap<String, String[]>();
	/**
	 * Load packages here.
	 * <p>
	 * Documentation:
	 * Create a class. It must have a String name field. It must have a String[] commands field.
	 * It should have an all encompassing runCommand(String) method that runs code within itself
	 * or within other methods to execute commands.
	 * <p>
	 * To load packages: <p>
	 * import it above the class declaration <p>
	 * where package class name is PackageName: <br>
	 * PackageName packageName = new PackageName(); <br>
	 * packages.add(packageName.name); <br>
	 * commands.put(packageName.name, packageName.commands); <br>
	 */
	public IsaacOS() {
		
	}
	public static void main(String[] args) throws DeathException,ExplodedException{
		System.out.println("Welcome to IsaacOS!");
		IsaacOS theOS = new IsaacOS();
		String foo = theOS.termIn();
	}
	public String termIn() {
		System.out.print("> ");
		String choice = input.next();
		System.out.println("");
		return choice;
	}
}
