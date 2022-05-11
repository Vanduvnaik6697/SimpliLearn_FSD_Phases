package Collections;
import java.util.Scanner;
public class ArithmeticCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the two numbers: ");
		int firstnum=sc.nextInt();
		int secondnum= sc.nextInt();
		System.out.print("Enter the operator: ");
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
				break;
		}
		System.out.println("The answer is: " +Ans);
	}
}