package ref.os;

import java.util.ArrayList;

public interface Module {
	/**
	 * Runs the specified command from the module.
	 * @param cmd The signature of command being called
	 */
	public void runCommand(String cmd);
	/**
	 * Acts to return the utilizable name of the module.
	 * @return The name of the module
	 */
	public String getName();
	/**
	 * Returns the pre-created array containing the String opcodes of the commands included
	 * in the module.
	 * @return An array of the commands created for the module
	 */
	public ArrayList<String> getCmds();
}
