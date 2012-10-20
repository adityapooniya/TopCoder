package ChocolateBar;


public class ChocolateBar {
	
	public static int maxLength(String letters) {
		int[] lastIndex = new int[26];
		int answer = 0;
		int curMax = 0;
		
		for (int i = 0; i < lastIndex.length; i++) {
			lastIndex[i] = -1;
		}
		
		for (int i = 0; i < letters.length(); i++) {
			int curCharIndex = letters.charAt(i) - 'a';
			int lastI = lastIndex[curCharIndex];
			
			if (lastI >= i - curMax) {
				curMax = i - lastI;
			} else if (++curMax > answer) {
					answer = curMax;
			}
			lastIndex[curCharIndex] = i;
		}
		
		return answer;
	}
}
