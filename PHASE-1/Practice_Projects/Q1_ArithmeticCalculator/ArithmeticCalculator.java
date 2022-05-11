package Practice_Project;

import java.util.Scanner;
public class ArithmeticCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first numbers: ");
		int firstnum=sc.nextInt();
		System.out.print("Enter the second numbers: ");
		int secondnum= sc.nextInt();
		System.out.println("\nEnter the operator (/, *, +, -):  ");
		char op=sc.next().charAt(0);
		double Ans=0;
		switch(op){
		case '+': Ans=firstnum+secondnum;
		break;
		case '-':Ans=firstnum-secondnum;
		break;
		case '*': Ans=firstnum*secondnum;
		break;
		case '/':Ans=firstnum/secondnum;
		break; }
		System.out.println("\nThe answer is: " +Ans);
		}
}

