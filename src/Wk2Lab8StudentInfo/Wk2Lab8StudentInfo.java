package Wk2Lab8StudentInfo;

import java.util.Scanner;


public class Wk2Lab8StudentInfo {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);

	int userPick;
	int fruit = 1;
	int home = 2;
	String userCont = ""; 
	
	System.out.println("Welcome to our ABC class!");
	System.out.println("We have seven new students that you can get to know:");
	
	String[] stuFirstNames =  {"Ann", "Braelyn", "Casey", "Donnovan", "Elise", "Filipe", "Gale"};
	String[] stuLastNames = {"Abrhams", "Brookes", "Crenshaw", "Dawson", "Engles", "Farkle", "Glover"};
	String[] faveFruits = {"Apples", "Bananas", "Cucumber", "Dates", "Elderberries", "Fig", "Grapefruit"};
	String[] homeTown = {"Atlanta, GA", "Boston, MA", "Cincinatti, OH", "Dallas, TX", "Edmondton, Canada", "Fort Lauderdale, FL", "Gettysburg, PA"};
	

do  {
	System.out.println();
	for (int i = 0; i < stuFirstNames.length; i++) {
		System.out.println((i + 1) + ". " + stuFirstNames[i]);
	}
	//match a number a user selects to student info
	//show food match selection

	userPick = Validator.getInt(scan, "\nSelect a number corresponding with the student about whom you'd like to learn: ", 1, stuFirstNames.length);

	
	System.out.println("Student " + userPick + " is " + stuFirstNames[userPick - 1] + " " + stuLastNames[userPick - 1] + ".");
	System.out.println();
	int homeFruit = Validator.getInt(scan,"Would you like to know " + stuFirstNames[userPick - 1] + " " + stuLastNames[userPick - 1] + "'s \n1. favorite fruit \nor \n2. home town?", 1, 2);
	
	if (homeFruit == 1) {
		System.out.println(stuFirstNames[userPick - 1] + "'s favorite fruit is " + faveFruits[userPick - 1] + ".");
	}else if (homeFruit == 2) {
		System.out.println(stuFirstNames[userPick - 1] + " is from " + homeTown[userPick - 1] + ".");
	}
	
	String yesNo = Validator.getString(scan, "Would you like to know more about " + stuFirstNames[userPick - 1] + "? (Y/N)");
	if (yesNo.equalsIgnoreCase("y")) {
		Validator.getInt(scan,"Would you like to know " + stuFirstNames[userPick - 1] + " " + stuLastNames[userPick - 1] + "'s \n1. favorite fruit \nor \n2. home town?", 1, 2);
		System.out.println("would you like to learn about another student in ABC class? (Y/N)");
		userCont = scan.nextLine();
	}else if (yesNo.equalsIgnoreCase("n")) {
		System.out.println("Would you like to learn about another student in ABC class? (Y/N)");
		userCont = scan.nextLine();
	}
	
	System.out.println("Our students thank you for getting to know them! Good Bye!");
} while (userCont.equalsIgnoreCase("y"));
	
	}
//new methods 

	

	
}
