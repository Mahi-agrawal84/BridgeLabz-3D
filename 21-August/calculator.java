package Practice;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter your choice : 1. Add 2. Subtarct 3. Multiplication 4. Division ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Adiition : "+addition(a,b));
			break;
		case 2:
			System.out.println("Subtraction ; "+subtraction(a,b));
			break;
		case 3:
			System.out.println("Multiplication : " + multiplication(a,b));
			break;
		case 4:
			System.out.println("Division : " +division(a,b));
	    	break;
	    	
	   default:
		   System.out.println("Exited");
		   break;
		}
        
	}
	public static int addition(int a,int b) {
        
		return a+b;
		
	}
public static int subtraction(int a,int b) {
        
		return a+b;
		
	}

public static int multiplication(int a,int b) {
    
	return a*b;
	
}
public static int division(int a,int b) {
    
	return a/b;
	
}
}