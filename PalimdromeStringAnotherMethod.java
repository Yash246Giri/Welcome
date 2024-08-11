package javaprojrct;

public class PalimdromeStringAnotherMethod {
	
	public static boolean palim(String s) {
		int length = s.length()-1;
		for(int i = 0;i<=length;i++) {
			char c = s.charAt(i);
			char c2 = s.charAt(length);
			String ch = ""+c;
			String ch2 = ""+c2;
			if(!ch.equals(ch2))
				return false;
			length--;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(palim("mam"));
	}
}
