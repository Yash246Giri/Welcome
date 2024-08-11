package javaprojrct;

import java.util.Scanner;

public class AddStriing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = sc.nextLine();
		int sum = 0;
//		char c = 0 ;
		String sn = "";
		for(int i = 0;i<s.length();i++) {
			sn = "";
			char ch  = s.charAt(i);
			if(ch>='0' && ch<='9' && ch ==' ') {
				while(ch!=' ') {
					sn += (""+ch);
				}
				sum = sum + Integer.parseInt(sn);
			}
		}
		System.out.println(sum);
	}

}
