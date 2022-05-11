package Collections;
import java.util.*;
public class TypeCasting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		int i = Integer.parseInt(str);
		char c = str.charAt(0);
		double d = Double.parseDouble(str);
		long l = Long.parseLong(str);
		byte b = Byte.parseByte(str);
		boolean bn = Boolean.parseBoolean(str);
		System.out.println("Converting String into int: " + i);
		System.out.println("Converting String into char: " + c);
		System.out.println("Converting String into double: " + d);
		System.out.println("Converting String into long: " + l);
		System.out.println("Converting String into byte: " + b);
		System.out.println("Converting String into boolean: " + bn);	
	}

}
