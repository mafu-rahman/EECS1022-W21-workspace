package console_apps;

import java.util.Scanner;

import model.VendingMachine;

public class VM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		VendingMachine vm = new VendingMachine();
		String cont = "";
		System.out.println("-----Welcome!-----");
		System.out.println(vm.checkStatus());
		
		while (!(cont.equals("N"))){
			
			System.out.println("Select an option:");
			System.out.println("S: Check Stock");
			System.out.println("A: Add Item");
			System.out.println("R: Remove Item");
			
			String choice = input.nextLine();
			
			if(choice.equals("S")) {
				System.out.println("A: All products");
				System.out.println("Coke");
				System.out.println("Orange Juice");
				System.out.println("Kitkat Chunky Bar");
				System.out.println("Lay's Classic Chips");
				
				choice = input.nextLine();
				
				if(choice.equals("A")) {
					System.out.println(vm.checkStock());
				}
				else {
					System.out.println(vm.checkStock(choice));
				}
			}
			
			else if(choice.equals("A")) {
				System.out.println("Coke");
				System.out.println("Orange Juice");
				System.out.println("Kitkat Chunky Bar");
				System.out.println("Lay's Classic Chips");
				choice = input.nextLine();
				
				System.out.println("Your desired quantity: ");
				int q = input.nextInt();
				
				vm.add(choice, q);
				System.out.println(vm.checkStatus());
				
			}
			
			else if(choice.equals("R")) {
				System.out.println("Coke");
				System.out.println("Orange Juice");
				System.out.println("Kitkat Chunky Bar");
				System.out.println("Lay's Classic Chips");
				choice = input.nextLine();
				
				System.out.println("Your desired quantity: ");
				int q = input.nextInt();
				
				vm.dispense(choice, q);
				System.out.println(vm.checkStatus());
			}
			
			else {
				System.out.println("Wrong Choice!");
			}
			
			System.out.println("");
			System.out.println("Would you like to make another choice Y/N?");
			input.nextLine();
			cont = input.nextLine();
		}
		
		input.close();
	}
}