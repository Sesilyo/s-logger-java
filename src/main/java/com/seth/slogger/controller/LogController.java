// FILENAME: LogContoller.java
package com.seth.slogger.controller;


// import
import java.util.Scanner;
import com.seth.slogger.model.Log;
import com.seth.slogger.view.OptionPrompts;

public class LogController {
	Scanner scanner = new Scanner(System.in);
	
	public String promptLogTitle() {
		System.out.println("Log Title: ");
		System.out.print(OptionPrompts.INPUT_INDICATOR);		
		return scanner.nextLine().trim();
	}
	
	
	public int promptTagSelection() {		
		System.out.print(OptionPrompts.TAG_OPTS);		
		System.out.print(OptionPrompts.INPUT_INDICATOR);
		return scanner.nextInt();
	}
	
	
	
	public LogController() {
		
	}
}
