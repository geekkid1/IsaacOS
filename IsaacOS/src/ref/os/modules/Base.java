package ref.os.modules;

import java.util.ArrayList;
import java.util.Arrays;

import isaacTerm.IsaacOS;
import ref.os.Module;

public class Base implements Module {
	ArrayList<String> commands = new ArrayList<String>(Arrays.asList("load","quit","list"));
	@Override
	public void runCommand(String cmd) {
		if (commands.contains(cmd)) {
			if(cmd.substring(0,4).equalsIgnoreCase("load")) {
				load(cmd.substring(5));
			}
		} else {
			System.out.println("System does not recognize \"" + cmd + "\"");
		}
	}

	@Override
	public String getName() {
		return "Base";
	}

	@Override
	public ArrayList<String> getCmds() {
		
		return commands;
	}
	public void load(String moduleName) {
		if (IsaacOS.theOS.moduleNames.contains(moduleName)) {
			IsaacOS.theOS.currentModule = moduleName;
			System.out.println("Now loaded: " + moduleName);
		} else {
			System.out.println("Module not found: \"" + moduleName + "\"");
		}
	}
}
