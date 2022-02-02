import java.util.Scanner;
   public class SampleCalculator{
	public static void main(String[] args){
	 Scanner  scn=new Scanner(System.in);

	 System.out.println("Enter a Given Number");
	String number1=scn.nextLine();
	 double input1=Double.parseDouble(number1);

	 System.out.println("Enter a number");
	String number2=scn.nextLine();
	 double input2=Double.parseDouble(number2);

	double result=input1+input2;

        System.out.println("The sum of two numbers is:"+result);

	}
}
	