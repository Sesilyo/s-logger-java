// FILENAME: Main.java
package com.seth.slogger;

// imports
import com.seth.slogger.view.ConsoleView;

public class Main {
	public static void main(String[] args) {
		boolean running = true;
		while (running) {
			System.out.print(ConsoleView.MAIN_MENU);
		}
	}
}