import java.util.Scanner;

public class Calculator {
		static double interest;
		static double CompoundInterest;
		static double average;
		static int choose;
		
public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in);
	    System.out.print("Please Choose 1, 2 or 3 for Simple Interest, Compound Interest or Average of 5 nos. :");
	    choose = input.nextInt();

        switch(choose){
        case 1 :
        interest = (getPrincipal() * getTime() * getRate()) / 100;
        Print();
        break;
        case 2:
        CompoundInterest = getPrincipal() * (Math.pow((1 + getRate()/ 100), getTime()));
        CalculateCompoundInterest();
        break;
        case 3:
        average=(ReadNum1()+ReadNum2()+ReadNum3()+ReadNum4()+ReadNum5())/5;
        FindAvg();
        break;
        default:
        System.out.println("not valid");
        }
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
	    
		public static void CalculateCompoundInterest() {
			System.out.println("CompoundInterest: " + CompoundInterest);
					
		}
	    	    
		public static double ReadNum1() {
			Scanner input = new Scanner(System.in);
			System.out.println("enter the first number: ");
			double num1=input.nextDouble();
			return num1;
		}
		
		public static double ReadNum2() {
			Scanner input = new Scanner(System.in);
			System.out.println("enter the second number: ");
			double num2=input.nextDouble();
			return num2;
		}
		
		public static double ReadNum3() {
			Scanner input = new Scanner(System.in);
			System.out.println("enter the third number: ");
			double num3=input.nextDouble();
			return num3;			
		}
		
		public static double ReadNum4() {
			Scanner input = new Scanner(System.in);
			System.out.println("enter the fourth number: ");
			double num4=input.nextDouble();
			return num4;
		}
		
		public static double ReadNum5() {
			Scanner input = new Scanner(System.in);
			System.out.println("enter the fifth number: ");
			double num5=input.nextDouble();
			return num5;
		}
		
	    public static void FindAvg() {
			System.out.println("Average: " + average);
		}
			
}