package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `status` is the filing status (which should be 1 for Single Filing or 2 for Married Filing)
	 *  - `income` is the tax payer's income (an integer value)
	 *  
	 * Assumptions:
	 * 	- `income` passed by user is always positive (> 0)
	 *  
	 * Refer to you lab instructions for what the method should return.
	 * 
	 * See this short tutorial video illustrating how to compute tax:
	 * https://www.youtube.com/watch?v=q2NT5x77hdg&list=PL5dxAmCmjv_7YgI2LgcwjWTHiNZSR-aQX&index=1 
	 */
	public static String getTaxReport(int status, int income) {
		String result = "";

		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		

		/* Your implementation ends here. */

		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `p1` is the name of player 1
	 *  - `p2` is the name of player 2
	 *  - `p1r1` is what player 1 plays in round 1 ('R', 'P', or 'S')
	 *  - `p2r1` is what player 2 plays in round 1 ('R', 'P', or 'S')
	 *  - `p1r2` is what player 1 plays in round 2 ('R', 'P', or 'S')
	 *  - `p2r2` is what player 2 plays in round 2 ('R', 'P', or 'S')
	 *  
	 * Assumptions:
	 * 	- `p1r1`, `p2r1`, `p1r2`, or `p2r2` is one of the following characters:
	 *     'R' for rock, 'P' for paper, and 'S' scissors (case-sensitive)
	 *     
	 * Hints:
	 *  - Compare character values using the relational operator ==.
	 *  - Study the 9 test cases in TestUtilites: they are arranged in a systematic (yet not exhaustive) way.
	 *    Q. In order to exhaustively test this game, considering how two players may play in two rounds,
	 *    	 how many tests do we need? (Optionally, you may write extra test yourself as an exercise.)
	 *    
	 * Refer to you lab instructions for what the method should return.
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
