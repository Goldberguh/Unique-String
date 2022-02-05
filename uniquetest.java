public class uniquestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1 = "abcd";
		String test2 = "aaab";

		System.out.println(checker(test1));
		System.out.println(checker(test2));
	}
	
	public static boolean checker(String s) {
		for (int i = 1; i < s.length(); i ++){
			for(int j = 0; j < i; j++)
				if( s.charAt(i) == s.charAt(j)) return false;
				
	}
		return true;
	}
}
