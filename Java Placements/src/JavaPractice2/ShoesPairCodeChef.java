package JavaPractice2;

import java.util.Scanner;

public class ShoesPairCodeChef {

	public static int input() {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		return n;
	}
	
	public static void shoesPair( int friends , int shoes ) {
		
		
		if( friends >= shoes ) {
	    	
	        int contain = (friends * 2) - shoes;
	        
	        System.out.println(contain);
	    }
	
	      if( friends < shoes ) {
	    	  
	    	System.out.println(friends);
	      
	      }
	
	}
	
	public static void main(String[] args) {
		
    int friends = input();
    
    int shoes  = input();
    
    shoesPair(friends, shoes);
	
	}

}
