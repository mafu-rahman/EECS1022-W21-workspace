package model;
public class Utilities
{
	/* 
	 * Only write lines of code within the methods given to you.
	 * Do not add any new helper methods. 
	 * Do not declare any variables OUTSIDE the given methods.
	 * You can only declare local variables within each method.
	 * 
	/*	Task 1.
	 * 	
	 * 	Input Parameters:
	 *	- `unitOfWeight`	: either "pound" or "kilogram"
	 *	- `valueOfWeight`	: the weight value
	 *	- `unitOfHeight`	: either "foot" or "inch"
	 *	- `valueOfHeight`	: the height value
	 *
	 *	Error conditions (in order of priority):
	 *	1. When the `unitOfWeight` is neither "pound" nor "kilogram" (case sensitive).
	 *	2. When the `unitOfHeight` is neither "foot" nor "inch" (case sensitive).
	 *	3. When not both weight value and height value are positive.
	 *	If multiple error conditions hold, return a message related to the error with the highest priority.
	 *	e.g., invoking getBMIReport("Pounds", -154.3, "Inches", -66.92) has all inputs invalid,
	 *			but only an error message about weight unit is returned.
	 *
	 *  What to return?
	 *  - Return an error message if there is any error.
	 *  - Otherwise, calculate the Body Mass Index (BMI) by: weight (in kilogram) divided by the square of height (in meters).
	 *  	+ Use the following conversion rates (when needed):
	 *  		1 inch is 0.0254 meter 			(use it when `unitOfHeight` is "inch")
	 *  		1 foot is 0.3048 meter
	 *  		1 pound is 0.453592 kilogram
	 *  	+ The calculation result must be formatted with 2 digits after the decimal:
	 *  		Use String.format("%.2f", someNumber)
	 *  	+ Also, include an interpretation message (case sensitive) according to the following scheme:
	 *  		BMI < 18.5 			means "Underweight"
	 * 			18.5 <= BMI < 25.0 	means "Normal"
	 * 			25.0 <= BMI < 30.0 	means "Overweight"
	 * 			30.0 <= BMI 		means "Obese"
	 * 
	 * See the JUnit tests related to this method for the precise format of the string return value.
	 */
	public static String getBMIReport(String unitOfWeight, double valueOfWeight, String unitOfHeight, double valueOfHeight) {
		String result = "";
		double bmi=0.0;
		String bmiS ="";
		String message = "";
		
		if (!(unitOfWeight.equals("pound")) && !(unitOfWeight.equals("kilogram"))) {
			result=("Error: "+unitOfWeight+" is not a valid weight unit");
		}
		else if (!(unitOfHeight.equals("foot")) && !(unitOfHeight.equals("inch"))) {
			result=("Error: "+unitOfHeight+" is not a valid height unit");
		}
		else if ((valueOfWeight<0) || (valueOfHeight<0)) {
			result=("Error: both weight and height must be positive");
		}
		
		else {
			if(unitOfWeight.equals("pound")) {
				valueOfWeight = 0.453592 * valueOfWeight;
			}
			if (unitOfHeight.equals("foot")) {
				valueOfHeight = 0.3048 * valueOfHeight;
			}
			if (unitOfHeight.equals("inch")) {
				valueOfHeight = 0.0254 * valueOfHeight;
			}
			
			bmi = valueOfWeight / (valueOfHeight*valueOfHeight);
			bmiS = String.format("%.2f", bmi);
					
			if (true) {
				if (bmi<18.5) {
					message = "(Underweight)";
				}
				else if ((bmi>=18.5) && (bmi<25.0)) {
					message = "(Normal)";
				}
				else if((bmi>=25.0) && (bmi<30.0)) {
					message = "(Overweight)";
				}
				else if(bmi>=30.0) {
					message = "(Obese)";
				}
			
			result = "BMI is: "+bmiS+" "+message;
			}
		}
		// Do not modify this return statement. 
		return result;
	}
	
	/*	Task 2.
	 * 
	 * 	Input Parameters:
	 *	- `n1`: first number
	 *	- `n2`: second number
	 *	- `n3`: third number
	 *	- `n4`: fourth number  
	 *	Note. These four input numbers are not necessarily unique. They might contain duplicates.
	 *
	 *	Error conditions (in order of priority):
	 *	- None. No error message is needed.
	 *
	 *  What to return?
	 *  - Return a report of the largest number and the second largest number.
	 *  
	 * See the JUnit tests related to this method for the precise format of the string return value.
	 */
	public static String getLargestTwoNumbers(int n1, int n2, int n3, int n4) {
		String result = "";
		int max=0;
		int max2=0;
		
		if(true) {
			if((n1>=n2) && (n1>=n3) && (n1>=n4)) {
				max=n1;
			}
			else if ((n2>=n1) && (n2>=n3) && (n2>=n4)) {
				max=n2;
			}
			else if ((n3>=n1) && (n3>=n2) && (n3>=n4)) {
				max=n3;
			}
			else if ((n4>=n1) && (n4>=n2) && (n4>=n3)) {
				max=n4;
			}
		}
		if(true) {
			if(max==n1) {
				if((n2>=n3) && (n2>=n4)) {
					max2=n2;
				}
				else if (n3>=n2 && n3>=n4) {
					max2=n3;
				}
				else if(n4>=n2 && n4>=n3) {
					max2=n4;
				}
			}
			else if(max==n2) {
				if(n1>=n3 && n1>=n4) {
					max2=n1;
				}
				else if (n3>=n1 && n3>=n4) {
					max2=n3;
				}
				else if (n4>=n1 && n4>=n3) {
					max2=n4;
				}
			}
			else if (max==n3) {
				if(n1>=n2 && n1>=n4) {
					max2=n1;
				}
				else if(n2>=n1 && n2>=n4) {
					max2=n2;
				}
				else if(n4>=n1 && n4>=n2) {
					max2=n4;
				}
			}
			else if(max==n4) {
				if(n1>=n2 && n1>=n3) {
					max2=n1;
				}
				else if(n2>=n1 && n2>=n3) {
					max2=n2;
				}
				else if(n3>=n1 && n3>=n2) {
					max2=n3;
				}
			}
		}
			result = "largest is "+max+" and second largest is "+max2;
		
		// Do not modify this return statement. 
		return result;
	}
	
	/*	Task 3.
	 * 	
	 * 	Input Parameters:
	 *	- `p1`			: name of player 1
	 *	- `p1Option`	: what player 1 plays, either 'r' (rock), 'p' (paper), or 's' (scissors)
	 *	- `p2`			: name of player 2
	 *	- `p2Option`	: what player 2 plays, either 'r' (rock), 'p' (paper), or 's' (scissors)
	 *	
	 *	Error conditions (in order of priority):
	 *	- None. No error message is needed. You can assume that `p1Option` and `p2Option` are always valid.
	 *
	 *  What to return?
	 *  - Return the name of player who wins. Or return "tie" when no one wins.
	 *  
	 * See the JUnit tests related to this method for the precise format of the string return value.
	 */
	public static String getWinnerOfRPS(String p1, char p1Option, String p2, char p2Option) {
    	String result = "";
    	String winner ="";
    	
    	if (p1Option=='r') {
    		if (p2Option=='r') {
    			winner = "tie";
    		}
    		else if (p2Option=='p') {
    			winner = p2;
    		}
    		else if (p2Option=='s') {
    			winner = p1;
    		}
    	}
    	
    	else if (p1Option=='p') {
    		if (p2Option=='r') {
    			winner = p1;
    		}
    		else if (p2Option=='p') {
    			winner = "tie";
    		}
    		else if (p2Option=='s') {
    			winner = p2;
    		}
    	}
    	
    	else if (p1Option=='s') {
    		if (p2Option=='r') {
    			winner = p2;
    		}
    		else if (p2Option=='p') {
    			winner = p1;
    		}
    		else if (p2Option=='s') {
    			winner = "tie";
    		}
    	}
    	
    	result = winner;
    	
        // Do not modify this return statement.
        return result;
    }
}

