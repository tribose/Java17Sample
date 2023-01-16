package array;

import java.util.HashSet;
import java.util.Set;

class Main
{
	public static void main(String[] args) {
	    String first = "abcbcd";
	    String second = "cdefef";
	    String common = commonCharacters(first, second);
	    System.out.println("common characters in '" + first + "' and '" + second + "' are '" + common + "'");
	    
	}
	
	public static String commonCharacters(String a, String b) {
		char[] chars = a.toCharArray();
		Set<Character> charSet = new HashSet<>();
	    for (char c: chars) {
	        charSet.add(c);
	    }
	    char[] c2 = b.toCharArray();
	    StringBuilder sb = new StringBuilder();
	    for (char c3 : c2) {
	        if (charSet.contains(c3)) {
	            sb.append(c3);
	        }
	    }
	    return sb.toString();
	}
}