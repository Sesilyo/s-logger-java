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
	// Use a single scanner instance
	private final Scanner scanner = new Scanner(System.in);
	
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
		
		scanner.nextLine();
		return scanner.nextLine();
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
	
	
	public LogController() {
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
}
