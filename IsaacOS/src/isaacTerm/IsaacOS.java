package isaacTerm;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import ref.Exceptions.*;
import ref.os.Module;
import ref.os.modules.*;
/**
 * This is a terminal based program that can have Modules that implement the module interface: {@link ref.os.Module}
 * to expand and modify the user experience. 
 * @author Isaac Blum
 */
public class IsaacOS {
	Scanner input = new Scanner(System.in);
	ArrayList<String> moduleNames = new ArrayList<String>();
	ArrayList<Module> modules = new ArrayList<Module>();
	Map<String, ArrayList<String>> commands = new HashMap<String, ArrayList<String>>();
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
	 * initPackage(packageName);
	 */
	public IsaacOS() {
		Base base = new Base();
		initModule(base);
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
	public void mainRunCommand(Module module, String cmd) {
		module.runCommand(cmd);
	}
	public void initModule(Module module) {
		moduleNames.add(module.getName());
		modules.add(module);
		commands.put(module.getName(),module.getCmds());
	}
}
