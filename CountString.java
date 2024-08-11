//COUNTING THE CHARACTER IN THE GIVEN STRING

package javaprojrct;

public class CountString {
	public static String Count(String s) {
		int i = 0;
		int j = i+1;
		while(j<s.length()) {//3
			int count = 1;
			while(j!=s.length() && s.charAt(i)==s.charAt(j)) {
				count++;
				j++;
			}
			System.out.print(count+""+s.charAt(i));
			i = j;
			j = i+1;
		}
		return "";
	}
	public static void main(String[] args) {
		Count("aab");
	}
}
