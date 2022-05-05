

import java.util.Scanner;

public class Calculator {
	 static double interest;
	  
public static void main(String[] args) {

	    interest = (getPrincipal() * getTime() * getRate()) / 100;
	    Print();
	  }

	    public static double getPrincipal() {
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter the principal: ");
	    double principal = input.nextDouble();
		return principal;
	    }
	 
	    public static double getRate() {
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter the rate: ");
	    double rate = input.nextDouble();
	    return rate;
	    }
	    
	    public static double getTime() {
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter the time: ");
	    double time = input.nextDouble();
	    return time;
	    }
	    
	    public static void Print() {
	    System.out.println("Simple Interest: " + interest);
	    }
}