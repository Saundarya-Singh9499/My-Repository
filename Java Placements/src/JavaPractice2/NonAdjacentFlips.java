package JavaPractice2;

import java.util.Scanner;

public class NonAdjacentFlips {

	public static int nonAdjacentFlips( String str ) {
		
		int ans = 0 ;
		
		for( int i = 1 ; i < str.length() ; i++) {
			
			if(str.charAt(i) == '1' && str.charAt(i-1) == '1') {
				
				ans = 2;
			
			     break;
			}
		
		      if(str.charAt(i) == '1') {
		    	  
		    	  ans = 1;
		      
		      }
		}
	     
	         return ans;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
	    int result = nonAdjacentFlips(str);
	    
	    System.out.println(result);
		
		
		
		
	}

}
