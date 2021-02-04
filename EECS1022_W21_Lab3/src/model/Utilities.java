package model;

public class Utilities {
	
	public static String getNumbers(int lower, int upper) {
		String result = "";
		String num="";
		
		if (lower<0 || upper<0) {
			result = "Error: both bounds must be non-negative";
		}
		else if(lower>upper) {
			result = "Error: lower bound "+lower+" is not less than or equal to upper bound "+upper;
		}
		else{
			if(lower!=upper) {
				result = (upper-lower+1)+" numbers between "+lower+" and "+upper+": <";
			}
			else {
				result = "1 number between "+lower+" and "+upper+": <";	
			}
			
			for (int i=lower; i<=upper;i++) {
				
				if(true) {
					if ((i%3)==0) {
						num = "("+i+")";
					}
					else if ((i%3)==1) {
						num = "["+i+"]";
					}
					else if ((i%3)==2) {
						num = "{"+i+"}";
					}
				}
				
				if(true) {
					if (i==upper) {
						result += num+">";
						}
					else {
						result += num+", ";
					}
				}
			}
		}
		return result;
	}
	

	public static String getIntermediateStats(int ft, int d, int n) {
		String result = "{";
		int sum = 0;
		double avg = 0.0;
		String sequence ="";
		String stat_term = "";
		
		if (n>0) {
			for (int i=1; i<=n; i++) {
				
				sum +=ft;
				avg = (double) sum/i;
				
				if(i==1) {
					sequence += ft;
				}
				else {
					sequence += ", "+ft;
				}
	
				stat_term = "[sum of <"+sequence+">: "+sum+" ; avg of <"+sequence+">: "+(String.format("%.2f", avg))+"]";
				
				if (i==n) {
					result += stat_term+"}";
				}
				else {
					result += stat_term+", ";
				}
				
				ft += d;
				stat_term="";
			}
			return result;
		}
		
		else {
			result = "{}";
			return result;
		}
	}
	

	
	public static String getInterlevaings(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		String s1 = "";
		String s2 = "";
		String result = "<";
		int j = 1;
		int l = 0;
		
		if (n1>n2) {
			l=n1;
		}
		else if (n2>n1) {
			l=n2;
		}
		else {
			l = n1;
		}
		
		for (int i=1; i<=l; i++) {
		 
			if(j==1) {
				if(n1==0) {
					result += "["+ft2+"]";
				}
				else if(n2==0) {
					result += "("+ft1+")";
				}
				else {
					result += "("+ft1+")"+", ["+ft2+"]";
				}
			}
			
			
			if(i<n1) {
				ft1 += d1;
				s1 = ", ("+ft1+")";
				result += s1;
			}
			if(i<n2) {
				ft2 += d2;
				s2 = ", ["+ft2+"]";
				result += s2;
			}
			
			j=0;
		}
		
		result += ">";
		return result;
	}	
}
