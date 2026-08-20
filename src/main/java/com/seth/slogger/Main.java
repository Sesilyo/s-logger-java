// FILENAME: Main.java
package com.seth.slogger;


// imports
import java.util.Scanner;
import com.seth.slogger.view.OptionPrompts;
// import com.seth.slogger.view.ConsoleView;



public class Main {
	public static final int CNCL  = 0;
	public static final int OPT_1 = 1;
	public static final int OPT_2 = 2;
	public static final int OPT_3 = 3;
	public static final int OPT_4 = 4;
	public static final int OPT_5 = 5;	// allowance constant
	public static final int OPT_6 = 6;	// allowance constant
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void exitProgram() {
		System.out.println("Exit Program");
		Runtime.getRuntime().exit(0);
	}
	
	public static void displayLogs() {
		System.out.println("Show Logs");
		System.out.print(OptionPrompts.DISPLAY_LOGS_OPTS);
		System.out.println(">>> ");
		int displayLogsOpt = scanner.nextInt();
		
		switch (displayLogsOpt) {
			
		}
	}
	
	
	public static void main(String[] args) {
		boolean running = true;
		while (running) {
			// starts with the main menu
			System.out.print("<<< START MENU >>>"
					+ "\n"
					+ "\nnext line"
					+ "\nnext >>> "
			);
			int menuOpt = scanner.nextInt();
			
			switch (menuOpt) {
				case CNCL  -> exitProgram();
				case OPT_1 -> displayLogs();
				case OPT_2 -> System.out.println("OPT_2");
				case OPT_3 -> System.out.println("OPT_3");
				
			}
		}
	}
}