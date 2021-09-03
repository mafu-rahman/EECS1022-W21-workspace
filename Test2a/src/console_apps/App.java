package console_apps;

import java.util.Scanner;

import model.Utilities;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] seq = {0};
		
		int[] s = Utilities.task4(seq);
		for(int i=0; i<s.length;i++) {
			System.out.print(s[i]);
		}
		
		
		
	}

}
