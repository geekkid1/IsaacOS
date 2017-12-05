package ref.os.modules;

import java.util.ArrayList;
import java.util.Arrays;

import ref.os.Module;

public class TheExceptionGame implements Module {
	ArrayList<String> commands = new ArrayList<String>(Arrays.asList("help","game","credits")); 
	@Override
	public void runCommand(String cmd) {
		if (getCmds().contains(cmd)) {
			
		} else {
			System.out.println("System does not recognize \"" + cmd + "\"");
		}
	}

	@Override
	public String getName() {
		return "exception_game";
	}

	@Override
	public ArrayList<String> getCmds() {
		return commands;
	}
	
}
