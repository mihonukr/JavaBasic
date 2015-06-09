package com.sourseit.java.basic.ovcharenko.lesson19.lab;

public class WGetConsoleExample {
public static final String[] COMMANDS = {"Save page", "Display title", "Find a word", "List all URL's on the page"};
	
	public static void main(String[] args) {

		if(args.length == 0){
			System.out.println(getInstructions());
			return;
		}
		
		String command = args[0];
		String url;
		if("-i".equals(command)){
			//TODO ask for URL
			System.out.println("Enter an URL:");
		} else if(!command.startsWith("http")){
			System.out.println(getInstructions());
			return;
		}
		
		//TODO list of options
		System.out.println("Select what to do next:");
		for(int i = 0; i < COMMANDS.length; i++){
			System.out.println((i+1) + ") " + COMMANDS[i]);
		}
		
		int choise = -1;
		//TODO ask for input
		
		executeCommand(choise);
	}
	
	private static void executeCommand(int commandNumber){
		switch (commandNumber) {
		case 1:
			//TODO
			break;

		default:
			break;
		}
	}
	
	public static String getInstructions(){
		return "Usage: some web address\n" + 
				"      or -i\n" +
				"Example: http://google.com";
	}

}