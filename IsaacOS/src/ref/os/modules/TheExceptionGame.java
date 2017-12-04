package ref.os.modules;

import ref.os.Module;

public class TheExceptionGame implements Module {
	String[] commands = new String[]{"game","help","credits"};
	@Override
	public void runCommand(String cmd) {
		if commands

	}

	@Override
	public String getName() {
		return "exception_game";
	}

	@Override
	public String[] getCmds() {
		return commands;
	}
	public boolean strArrContains(String[] arr) {
		boolean contains = false;
		
		return contains;
	}
}
