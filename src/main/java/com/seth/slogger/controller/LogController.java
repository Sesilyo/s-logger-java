// FILENAME: LogContoller.java
package com.seth.slogger.controller;


// import
import java.util.Scanner;
import java.util.InputMismatchException;

import com.seth.slogger.model.Log;
import com.seth.slogger.view.OptionPrompts;
import com.seth.slogger.controller.AppController;

public class LogController {
	private final String END_OF_LOG_INDICATOR = "END-OF-LOG";
	private final Scanner scanner;
	// Use a single scanner instance
	
	public int prelimSelection() {
		while (true) {
			try {
				System.out.println("Initializing log...");
				System.out.print(OptionPrompts.INIT_LOG_OPTS);
				System.out.print(OptionPrompts.INPUT_INDICATOR);
				return scanner.nextInt();				
			} catch (InputMismatchException e) {
				System.out.println("Error: Please enter a valid option.");
				scanner.nextLine(); // Clear the invalid input from the buffer
			}
		}
	}
	
	
	public int finalizeInitLog(String newLogContent) {
		System.out.println("Finalizing log initialization.");
		System.out.println("Please review for error.");
		System.out.println("* reminder: once initialized, log is immutable *");
		
		System.out.println("Log Content:");
		System.out.println(newLogContent);
		System.out.println(OptionPrompts.FINALIZE_LOG_INIT);
		System.out.println(OptionPrompts.INPUT_INDICATOR);
		return scanner.nextInt();		
	}
	
	
	public Log initLog() {
		// [1] Write new log content
		String newLogContent = writeLog();
		int    newTag		 = promptTagSelection();
		
		Log newLog = new Log(END_OF_LOG_INDICATOR, newLogContent, END_OF_LOG_INDICATOR, END_OF_LOG_INDICATOR, END_OF_LOG_INDICATOR, END_OF_LOG_INDICATOR);
		return newLog;
	}
	
	public String writeLog() {
		System.out.println("Write log after \">>>\"");
		System.out.print(OptionPrompts.INPUT_INDICATOR);
		
		scanner.nextLine();	// consumes left-over newline
		StringBuilder typed_lines = new StringBuilder();
		
		String line;
		while (!(line = scanner.nextLine()).equals(END_OF_LOG_INDICATOR)) {
			typed_lines.append(line).append("\n");
		}
		return typed_lines.toString().trim();
	}
	
	
	public int promptTagSelection() {		
		while (true) {
			try {
				System.out.print(OptionPrompts.TAG_OPTS);		
				System.out.print(OptionPrompts.INPUT_INDICATOR);
				return scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error: Please enter a valid option.");
				scanner.nextLine(); // Clear the invalid input from the buffer
			}			
		}
		
	}
	
	
	public void run() {
		boolean running = true;
		while (running) {
			// [1]	Give me option to cancel log initialization
			int logOpt = prelimSelection();
			
			switch (logOpt) {
				case AppController.OPT_1  -> initLog();
				case AppController.CNCL  -> { running = false; }
				default -> System.out.println("Invalid Choice. Try again.");
			}
			
			
		}
		// Close scanner only when the entire controller stops running
		scanner.close();
	}
	
	public LogController(Scanner scanner) {
		// scanner object passed is from the AppController
		this.scanner = scanner;
	}
}
