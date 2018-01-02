package ref.os.modules;

import java.util.ArrayList;
import java.util.Arrays;

import ref.os.Module;

import isaacTerm.IsaacOS;

public class TheExceptionGame implements Module {
	ArrayList<String> commands = new ArrayList<String>(Arrays.asList("help","game","credits, exit")); 
	@Override
	public void runCommand(String cmd) {
		if (getCmds().contains(cmd)) {
			if(cmd.equalsIgnoreCase("game")) { game(); }
			if(cmd.equalsIgnoreCase("exit")) { exit(); }
		} else {
			System.out.println("Package does not recognize \"" + cmd + "\"");
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
	public void exit() {
		
	}
	public void game() {
		System.out.println("This area is under construction");
		String nextcommand = IsaacOS.theOS.termIn();
		
	}
}
