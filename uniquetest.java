import java.util.Set;
import java.util.HashSet;
public class uniquestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1 = "abcd";
		String test2 = "aaab";

		System.out.println(hasUniqueChars(test1));
		System.out.println(hasUniqueChars(test2));
	}
	
	public static boolean hasUniqueChars(String toTest) {
		Set<Character> set = new HashSet<>();
		for (char c: toTest.toCharArray()) {
			if	(set.contains(c)) {
				return false;
			}
		set.add(c);
	}
		return true;
	}
}
