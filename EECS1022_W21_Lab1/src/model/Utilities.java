package model;

public class Utilities {
	
	
	public static String getGeometricSequence(int ft, int ratio) {
		String result = "";
		
		int term1 = ft;
		int term2 = term1 * ratio;
		int term3 = term2 * ratio;
		int term4 = term3 * ratio;
		int term5 = term4 * ratio;
		
		double avg = (term1+term2+term3+term4+term5)/5.0;
		result = "["+term1+"]"+"["+term2+"]"+"["+term3+"]"+"["+term4+"]"+"["+term5+"]"+" has average "+avg;
		
		return result;
	}
	
	
	public static double getBMI(double weight, double height) {
		double result = 0.0;
		
		double convertedWeight = weight*0.4536;
		double convertedHeight = height*0.0254;
		result = convertedWeight/(convertedHeight*convertedHeight);
		
		return result;
	}
	

	public static String getTimeConversion(int seconds) {
		String result = "";
		
		// One day has 86400 seconds
		int days = seconds/86400;
		
		// Calculating the remaining seconds and converting to hours
		int hours = (seconds-(days*86400))/3600;
		
		// Calculating the remaining seconds and converting to minutes
		int minutes = ( (seconds-(days*86400) ) - (hours*3600) )/60;
		
		int seconds1 = seconds % 60;
		
		result = days + " days " + hours + " hours " + minutes + " minutes " + seconds1 + " seconds";
		
		return result;
	}
}
