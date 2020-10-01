package calculateDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;


	class Date
	{ 

	static int MAX_YEAR_INTERVAL = 2500; 
	static int MIN_YEAR_INTERVAL = 1500; 

	
	static boolean isLeap(int year) 
	{ 
		
		return (((year % 4 == 0) 
				&& (year % 100 != 0)) 
				|| (year % 400 == 0)); 
	} 

	static boolean isValidDate(int d, int m, int y) 
	{ 
		
		if (y > MAX_YEAR_INTERVAL || y < MIN_YEAR_INTERVAL) 
			return false; 
		if (m < 1 || m > 12) 
			return false; 
		if (d < 1 || d > 31) 
			return false; 

		
		if (m == 2) 
		{ 
			if (isLeap(y)) 
				return (d <= 29); 
			else
				return (d <= 28); 
		} 

				if (m == 4 || m == 6 || m == 9 || m == 11) 
			return (d <= 30); 

		return true; 
	} 

	
	static void printBonusDatesBetween(int y1, int y2) 
	{ 

		
		for (int year = y1; year < y2; year++) 
		{ 

			
			String str = String.valueOf(year); 

			
			String rev = str; 
			rev = reverse(rev); 

			
			int day = Integer.parseInt(rev.substring(0, 2)); 
			int month = Integer.parseInt(rev.substring(2, 2 + 2)); 

		
			if (isValidDate(day, month, year)) 
				
		    
			{ 
				System.out.print(rev + str +"\n"); 
			} 
		} 
	} 
	static String reverse(String input) 
	{ 
			char[] a = input.toCharArray(); 
			int l, r = a.length - 1; 
			for (l = 0; l < r; l++, r--) 
			{ 
				char temp = a[l]; 
				a[l] = a[r]; 
				a[r] = temp; 
			} 
			return String.valueOf(a); 
		} 
		
	
	public static void main(String[] args) 
	{ 
		int y1 = 2010, y2 = 2015; 

		printBonusDatesBetween(y1, y2); 

	} 
	
	
		
	
	
	} 

	
