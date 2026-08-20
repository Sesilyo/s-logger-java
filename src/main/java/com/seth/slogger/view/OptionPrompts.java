// FILENAME: OptionPrompts.java

package com.seth.slogger.view;

public final class OptionPrompts {
	
	// private constructor prevents anyone from instantiating OptionPrompt objects
	private OptionPrompts() {
		throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
	}
	
	
	public static final String DISPLAY_LOGS_OPTS = "\nDISPLAY LOG MENU:"
			+ "\n\t[1] Display All"
			+ "\n\t[2] Display by Tag"
			+ "\n\t[3] Display by Project"
			+ "\n\t[0] Cancel";
}