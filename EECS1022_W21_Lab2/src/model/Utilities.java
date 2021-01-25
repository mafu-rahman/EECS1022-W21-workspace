package model;

public class Utilities {
	/*
	 * Tax Computation App
	 */
	public static String getTaxReport(int status, int income) {
		String result = "";
		
		double tax1 = 0;
		String tax1s ="";
		double tax2 = 0;
		String tax2s ="";
		double tax3 = 0;
		String tax3s = "";
		double sum = 0;
		String sums = "";
		
		//Single Filing
		
		if (status == 1) {
			if (income > 33950) {
				tax1 = 8350*0.10;
				tax1s = String.format("%.2f", tax1);
				
				tax2 = (33950-8350)*0.15;
				tax2s = String.format("%.2f", tax2);
				
				tax3 = (income-33950)*0.25;
				tax3s = String.format("%.2f", tax3);
				
				sum = tax1+tax2+tax3;
				sums = String.format("%.2f", sum);

				result = "Single Filing: $"+sums+" (Part I: $"+tax1s+", Part II: $"+tax2s+", Part III: $"+tax3s+")";
			}
			else if (income > 8350) {
				tax1 = 8350*0.10;
				tax1s = String.format("%.2f", tax1);
				
				tax2 = (income-8350)*0.15;
				tax2s = String.format("%.2f", tax2);
				
				sum = tax1+tax2;
				sums = String.format("%.2f", sum);

				result = "Single Filing: $"+sums+" (Part I: $"+tax1s+", Part II: $"+tax2s+")";
			}
			else {
				tax1 = income*0.10;
				tax1s = String.format("%.2f", tax1);
				
				sum = tax1;
				sums = String.format("%.2f", sum);

				result = "Single Filing: $"+sums+" (Part I: $"+tax1s+")";
			}
		}
		
		//Married Filing
		
		else if (status == 2) {
			if (income > 67900) {
				tax1 = 16700*0.10;
				tax1s = String.format("%.2f", tax1);
				
				tax2 = (67900-16700)*0.15;
				tax2s = String.format("%.2f", tax2);
				
				tax3 = (income-67900)*0.25;
				tax3s = String.format("%.2f", tax3);
				
				sum = tax1+tax2+tax3;
				sums = String.format("%.2f", sum);

				result = "Married Filing: $"+sums+" (Part I: $"+tax1s+", Part II: $"+tax2s+", Part III: $"+tax3s+")";
			}
			else if (income > 16700) {
				tax1 = 16700*0.10;
				tax1s = String.format("%.2f", tax1);
				
				tax2 = (income-16700)*0.15;
				tax2s = String.format("%.2f", tax2);
				
				sum = tax1+tax2;
				sums = String.format("%.2f", sum);

				result = "Married Filing: $"+sums+" (Part I: $"+tax1s+", Part II: $"+tax2s+")";
			}
			else {
				tax1 = income*0.10;
				tax1s = String.format("%.2f", tax1);
				
				sum = tax1;
				sums = String.format("%.2f", sum);

				result = "Married Filing: $"+sums+" (Part I: $"+tax1s+")";
			}
		}
		
		else {
			result = ("Illegal Status: "+status);
		}

		return result;
	}
	
	/*
	 * ROCK PAPER SCISSOR !
	 */
	
	public static String getRPSGameReport(String p1, String p2, char p1r1, char p2r1, char p1r2, char p2r2) {
		String result = "";
		
		String result1 = "";
		String result2 = "";
		
		String round1Winner = "";
		String round2Winner = "";
		
		String winner = "";
		
		boolean round1 = true;
		boolean round2 = true;
		boolean verdict = true;
		
		//Round 1
		if (round1) {
			if (p1r1 == 'R') {
				if (p2r1 == 'P') {
					round1Winner = p2;
					result1 = p2+" wins (P vs. R)";
				}
				else if (p2r1 == 'S') {
					round1Winner = p1;
					result1 = p1+" wins (R vs. S)";
				}
				else {
					round1Winner = "Tie";
					result1 = "Tie (R vs. R)";
				}
			}
			
			else if (p1r1 == 'P') {
				if (p2r1 == 'R') {
					round1Winner = p1;
					result1 = p1+" wins (P vs. R)";
				}
				else if (p2r1 == 'S') {
					round1Winner = p2;
					result1 = p2+" wins (S vs. P)";
				}
				else {
					round1Winner = "Tie";
					result1 = "Tie (P vs. P)";
				}
			}
			
			else if (p1r1 == 'S') {
				if (p2r1 == 'R') {
					round1Winner = p2;
					result1 = p2+" wins (R vs. S)";
				}
				else if (p2r1 == 'P') {
					round1Winner = p1;
					result1 = p1+" wins (S vs. P)";
				}
				else {
					round1Winner = "Tie";
					result1 = "Tie (S vs. S)";
				}
			}
		}
		
		// Round 2
		if (round2) {
			if (p1r2 == 'R') {
				if (p2r2 == 'P') {
					round2Winner = p2;
					result2 = p2+" wins (P vs. R)]";
				}
				else if (p2r2 == 'S') {
					round2Winner = p1;
					result2 = p1+" wins (R vs. S)]";
				}
				else {
					round2Winner = "Tie";
					result2 = "Tie (R vs. R)]";
				}
			}
			
			else if (p1r2 == 'P') {
				if (p2r2 == 'R') {
					round2Winner = p1;
					result2 = p1+" wins (P vs. R)]";
				}
				else if (p2r2 == 'S') {
					round2Winner = p2;
					result2 = p2+" wins (S vs. P)]";
				}
				else {
					round2Winner = "Tie";
					result2 = "Tie (P vs. P)]";
				}
			}
			
			else if (p1r2 == 'S') {
				if (p2r2 == 'R') {
					round2Winner = p2;
					result2 = p2+" wins (R vs. S)]";
				}
				else if (p2r2 == 'P') {
					round2Winner = p1;
					result2 = p1+" wins (S vs. P)]";
				}
				else {
					round2Winner = "Tie";
					result2 = "Tie (S vs. S)]";
				}
			}
		}
		
		if (verdict) {
			if (round1Winner.equals(p1) && round2Winner.equals(p1)) {
				winner = p1+" wins!";
			}
			else if (round1Winner.equals(p2) && round2Winner.equals(p2)) {
				winner = p2+" wins!";
			}
			else if ((round1Winner.equals("Tie") && round2Winner.equals(p1)) || (round1Winner.equals(p1) && round2Winner.equals("Tie"))) {
				winner = p1+" wins!";
			}
			else if ((round1Winner.equals("Tie") && round2Winner.equals(p2)) || (round1Winner.equals(p2) && round2Winner.equals("Tie"))) {
				winner = p2+" wins!";
			}
			else {
				winner = "Tie!";
			}
		}
		
		result = "Game over: "+winner+" [Round 1: "+result1+" ; "+"Round 2: "+result2;
		return result;
	}
}
