// FILENAME: OptionPrompts.java

package com.seth.slogger.view;

public final class OptionPrompts {
	
	// private constructor prevents anyone from instantiating OptionPrompt objects
	private OptionPrompts() {
		throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
	}
	
	public static final String INPUT_INDICATOR = "\n>>> ";
	
	public static final String MAIN_OPTS = "\n\t[1] Display Logs"
			+ "\n\t[2] New Log"
			+ "\n\t[3] Tag List / Project List"
			+ "\n\t[4] ..."
			+ "\n"
			+ "\n\t[0] Exit S-Logger";
	
	public static final String DISPLAY_LOGS_OPTS = "\nDISPLAY LOG MENU:"
			+ "\n\t[1] Display All"
			+ "\n\t[2] Display by Tag"
			+ "\n\t[3] Display by Project"
			+ "\n\t[4] ..."
			+ "\n"
			+ "\n\t[0] Cancel";
}