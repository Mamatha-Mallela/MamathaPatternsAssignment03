package mamathaQuestion12;

public class FinallyDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     try {    
	         System.out.println("Inside try block");  
	        int data=25/100;    
	        System.out.println(data);    
	       }     
	       catch (ArithmeticException e){  
	         System.out.println("Exception handled");  
	         System.out.println(e);  
	       }    
	       finally {  
	         System.out.println("finally block is always executed");  
	       }    
	}
}