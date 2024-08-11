package javaprojrct;

import java.util.Scanner;

public class AdditionOfStringNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int sum = 0;
		
//		First Way
/*		for(int i = 0;i <name.length();i++) {
			char ch = name.charAt(i);
			if(ch>='0' && ch<='9')
				sum += ch - '0';
		}*/
		char [] ch = name.toCharArray();
		for(char chr: ch)
			if(chr >='0' && chr <='9')
				sum = chr - '0';
		System.out.println(sum);
	}
}
