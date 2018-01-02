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
	public ArrayList<String> moduleNames = new ArrayList<String>();
	ArrayList<Module> modules = new ArrayList<Module>();
	Map<String, ArrayList<String>> commands = new HashMap<String, ArrayList<String>>();
	public String currentModule = "Base";
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
	public static IsaacOS theOS = new IsaacOS();
	public IsaacOS() {
		Base base = new Base();
		initModule(base);
	}
	public static void main(String[] args){
		System.out.println("Welcome to IsaacOS!");
		theOS = new IsaacOS();
		String in = theOS.termIn();
		theOS.runBaseCommand(in);
	}
	public String termIn() {
		System.out.print("IsaacOS." + currentModule + " > ");
		String choice = input.nextLine();
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
	public void runBaseCommand(String cmd) {
		if(currentModule.equals("Base")) {
			mainRunCommand(modules.get(0), cmd);
		} else {
			int index = moduleNames.indexOf(currentModule);
			mainRunCommand(modules.get(index), cmd);
		}
	}
}
