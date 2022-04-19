package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a = 5;
     int fact = 1;
     int i = 1 ;
     for ( i = 1 ; i <= a; i++)
     {
    	 fact = fact * i; 
    	 
     }
     int b = a-1;
     System.out.println(a + "*" + b + "= "   +fact);    
	}

}
