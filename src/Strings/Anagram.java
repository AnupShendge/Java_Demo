package Strings;

public class Anagram {

	public static void main(String[] args) {
		boolean anagram = isAnagram("army", "mary");
		
		System.out.println(anagram); // a r m y   m a r y  // night = thing // arc = car
									//  0 1 2 3   0 1 2 3  

	}

	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}
		char[] chars = word.toCharArray();
		for (char c : chars) {
			int index = anagram.indexOf(c);  // y
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}

}
