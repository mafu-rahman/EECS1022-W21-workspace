package console_apps;

import java.util.Scanner;

import model.Utilities;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] seq = {1,2,3,4,5};
		
		int[] s = Utilities.task2(seq,2);
		for(int i=0; i<s.length;i++) {
			System.out.print(s[i]);
		}
		
		input.close();
	}

}
