package javaprojrct;

import java.util.Scanner;

//convert lower case to uppercase without using to uppercase method
public class ConversionCase {
	
	public static char[] convert(String name) {
		char ch[] = new char[name.length()];
		int i = 0;
		try {
			while(true) {
				char c = name.charAt(i);
				if((int)c>=96 && (int)c<=122) {
//					char ch = (char)((int)c - 32);
					ch[i] = ((char)((int)c - 32));
				}
				else {
//					System.out.print(c);
					ch[i] = c;
				}
				i++;
			}
		}catch(IndexOutOfBoundsException e) {
//			
			return ch;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println(convert(name));
//		int i = 0;
//		try {
//			while(true) {
//				char c = name.charAt(i);
//				if((int)c>=96 && (int)c<=122) {
////					char ch = (char)((int)c - 32);
//					System.out.print((char)((int)c - 32));
//				}
//				else {
//					System.out.print(c);
//				}
//				i++;
//			}
//		}catch(IndexOutOfBoundsException e) {
////			
//		}
	}
}
	