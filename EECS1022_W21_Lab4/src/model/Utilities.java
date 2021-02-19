package model;

public class Utilities {

	public static int[] getMultiplesOf3(int[] numbers) {
		int[] result = null;
		int j = 0;
		for (int i = 0; i<numbers.length; i++) {
			if((numbers[i]%3) == 0) {
				j++;
			}
		}
		
		int[] result1 = new int[j];
		int l = 0;
		
		for (int k = 0; k<numbers.length; k++) {
			if((numbers[k]%3) == 0) {
				result1[l] = numbers[k];
				l++;
			}
		}
		
		result = result1;
		return result;
	}	
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 	- `n`		: an integer (which may or may not exist in `numbers`)
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getFilteredSeq(int[] numbers, int n) {
		int[] result = null;
		int j =0;
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]!=n) {
				j++;
			}
		}
		
		int l=0;
		int[] result1 = new int[j];
		
		for(int k=0; k<numbers.length; k++) {
			if(numbers[k]!=n) {
				result1[l] = numbers[k];
				l++;
			}
		}
		
		result = result1;
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 
	 * Assumptions:
	 * 	- numbers.length >= 1
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String[] getAllPrefixes(int[] numbers) {
		String[] result = null;
		String[] result1 = new String[numbers.length];
		String s = "";
		
		for(int i=0; i<numbers.length; i++) {
			s = "[";
			for (int j=0; j<=i; j++) {
				if(j==i) {
					s += numbers[j];
				}
				else {
					s += numbers[j]+", ";
				}
			}
			s += "]";
			result1[i]=s;
		}
		
		result = result1;
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getGroupedNumbers(int[] numbers) {
		int[] result = null;
		int[] result1 = new int[numbers.length];
		int l=0;
		int i=0;
		
		for(i=0;i<numbers.length;i++) {
			if( (numbers[i]%3)==0 ) {
				result1[l]=numbers[i];
				l++;
			}
		}
		for(i=0;i<numbers.length;i++) {
			if( (numbers[i]%3)==1 ) {
				result1[l]=numbers[i];
				l++;
			}
		}
		
		for(i=0;i<numbers.length;i++) {
			if( (numbers[i]%3)==2 ) {
				result1[l]=numbers[i];
				l++;
			}
		}
		
		result = result1;
		return result;
	}
}
