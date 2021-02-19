package console_apps;

import java.util.Scanner;

import model.Utilities;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String heightUnit="";
		// Task1
		System.out.println("Enter your unit of weight: ");
		String weightUnit = input.nextLine();
		
		System.out.println("Enter your weight value: ");
		double weightValue = input.nextDouble();
		
		System.out.println("Enter your unit of height: ");
		heightUnit = input.next();
		
		System.out.println("Enter your height value: ");
		double heightValue = input.nextDouble();
		
		String result = Utilities.getBMIReport(weightUnit, weightValue, heightUnit, heightValue);
		System.out.println(result);
		
		
		// Task 2
		System.out.println("Enter 4 numbers consecutively: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		int n4 = input.nextInt();
		
		String result2 = Utilities.getLargestTwoNumbers(n1, n2, n3, n4);
		System.out.println(result2);
		
		
		// Task3
		
		System.out.println("Name of Player 1: ");
		String p1= input.nextLine();
		System.out.println("Player 1 choice 'r','p','s' : ");
		char p1Choice= input.nextLine().charAt(0);
		
		System.out.println("Name of Player 2: ");
		String p2= input.nextLine();
		System.out.println("Player 2 choice 'r','p','s' : ");
		char p2Choice= input.nextLine().charAt(0);
		
		String result3 = Utilities.getWinnerOfRPS(p1, p1Choice, p2, p2Choice);
		System.out.println(result3);
		
		
		
		input.close();
	}

}
