import java.util.Scanner;

public class rough {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] ns = new int[3];
		int i = 3;
		
		if(ns.length <= i || ns[i] % 2 == 1 || 0>i) {
			System.out.println("Outcome 1");
		}
		
		else {
			System.out.println("Outcome 2");
		}
		
	}

}