package Strings;

import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the senetence");
		String s = sc.nextLine();
		s = getUpperCase(s);
		System.out.println("After initialised to capital");
		System.out.println(s);

	}

	static String getUpperCase(String s) {

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				if (ch[i] >= 'a' && ch[i] <= 'z') {
					ch[i] = (char) (ch[i] - 32);
				}
			} else if (ch[i] >= 'A' && ch[i] <= 'Z')
				ch[i] = (char) (ch[i] + 32);
		}
		s = new String(ch);
		return s;
	}

}
