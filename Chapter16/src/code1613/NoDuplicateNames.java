package code1613;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class NoDuplicateNames {
	
	static Scanner scanner = new Scanner(System.in);
	
	static Set<String> names = new HashSet<>();
	
	public static void main(String[] args) {
		
		boolean done = false;
		
		while (!(done)) {

			switch (menu()) {
			case "add":
				addNames();
				break;
			case "find":
				findName();
				break;
			case "list":
				listNames();
				break;
			default:
				done = true;
				break;
			}
		}
		
		System.out.println("All done");
	}

	private static void listNames() {
		System.out.println(names);
		return;
	}

	private static void findName() {
		boolean done = false;
		String name = null;
		while(!(done)){
			System.out.print("Enter name or quit: ");
			name = scanner.nextLine().toLowerCase();
			
			if (name.trim().length() == 0){
				continue;				
			}
		
			if (name.equals("quit")){
				done = true;
			} else {
				if(names.contains(name)){
					System.out.println( name + " in list");
				} else {
					System.out.println(name + " not in list");
				}
			}
		}
		return;
	}

	private static void addNames() {
		
		boolean done = false;
		String name = null;
		while(!(done)){
			System.out.print("Enter name or quit: ");
			name = scanner.nextLine().toLowerCase();
			
			if (name.trim().length() == 0){
				continue;				
			}
		
			if (name.equals("quit")){
				done = true;
			} else {
				names.add(name);
			}
		}
		
		return;
	}

	private static String menu() {
		boolean done = false;
		String answer = null;
		
		while (!done){
			System.out.println("Enter:");
			System.out.println("add - add names");
			System.out.println("find - to search for a name");
			System.out.println("list - to list names");
			System.out.println("quit - to search for a name");
			System.out.print("Enter: ");
			answer = scanner.next().toLowerCase();
			switch (answer) {
				case "add":
				case "find":	
				case "quit":
				case "list":
					done = true;
					break;
				default:
					break;				
			}
					
		}
		return answer;
	}

}
