package com.seth.slogger.controller;

// imports
import java.util.Scanner;
import com.seth.slogger.view.OptionPrompts;

public class AppController {
	public static final int CNCL  = 0;
	public static final int OPT_1 = 1;
	public static final int OPT_2 = 2;
	public static final int OPT_3 = 3;
	public static final int OPT_4 = 4;
	
	static Scanner scanner = new Scanner(System.in);
	
	public void exitProgram() {
		System.out.println("Exit Program");
		Runtime.getRuntime().exit(0);
	}
	
	public void displayLogs() {
		System.out.println("Show Logs");
		System.out.print(OptionPrompts.DISPLAY_LOGS_OPTS);
		System.out.print(OptionPrompts.INPUT_INDICATOR);
		int displayLogsOpt = scanner.nextInt();
		
		switch (displayLogsOpt) {
			case CNCL  -> System.out.println("CNCL");
			case OPT_1 -> System.out.println("OPT_1");
			case OPT_2 -> System.out.println("OPT_2");
			case OPT_3 -> System.out.println("OPT_3");
			case OPT_4 -> System.out.println("OPT_4");
		}
	}
	
	
	public void newLog() {
		System.out.println("New Log");
	}
	
	public void mainMoreOpts() {
		System.out.println("New Log");
	}
	
	public void run() {
		boolean running = true;
		while (running) {
			// starts with the main menu
			System.out.print("<<< START MENU >>>");
			System.out.print(OptionPrompts.MAIN_OPTS);
			System.out.print(OptionPrompts.INPUT_INDICATOR);
			
			int menuOpt = scanner.nextInt();
			
			switch (menuOpt) {
				case CNCL  -> exitProgram();
				case OPT_1 -> displayLogs();
				case OPT_2 -> System.out.println("OPT_2");
				case OPT_3 -> System.out.println("OPT_3");
				case OPT_4 -> System.out.println("OPT_4");
				
			}
		}
	}
}