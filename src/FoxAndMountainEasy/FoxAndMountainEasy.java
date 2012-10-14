package FoxAndMountainEasy;

public class FoxAndMountainEasy {
	/*
	 * steps: n
	 * start height: h0
	 * end height: hn
	 * known history:history
	 */
	public static String possible(int n, int h0, int hn, String history) {
		if (possibleHelper(n, h0, hn, history)) {
			return "\"YES\"";
		} else {
			return "\"NO\"";
		}
	}
	
	private static boolean possibleHelper(int n, int h0, int hn, String history) {
		int intHistory = intHistory(history);
		int nAfterHistory = n - history.length();
		
		int climb = h0 + intHistory;
//		System.out.println(String.valueOf("intHistory: " + intHistory));
//		System.out.println(String.valueOf("nAfterHistory: " + nAfterHistory));
//		System.out.println(String.valueOf("climb: " + climb));
		if (climb == hn) {
			return true;
		}
		
		int upClimb = climb;
		int upCount = nAfterHistory;
		while(upCount > 0) {
			upCount--;
			if (++upClimb == hn) {
				if (isEven(upCount)) {
					return true;
				} else {
					break;
				}
			}
		}
		
		int downClimb = climb;
		int downCount = nAfterHistory;
		while (downCount > 0) {
			downCount--;
			if (--downClimb == hn) {
				if (isEven(downCount)) {
					return true;
				} else {
					break;
				}
			}
		}
		
		return false;
	}
	
	private static int intHistory(String history) {
		int total = 0;
		for (int i = 0; i < history.length(); i++) {
			char c = history.charAt(i);
			if (c == 'U') total++;
			if (c == 'D') total--;
		}
		return total;
	}
	
	private static boolean isEven(int n) {
		return n % 2 == 0;
	}

	public static void main(String[] args) {
		System.out.println(possible(4, 0, 4, "UU")); // YES
		System.out.println(possible(4, 0, 4, "D")); // NO
		System.out.println(possible(4, 100000, 100000, "DDU")); // YES
		System.out.println(possible(4, 0, 0, "DDU")); // NO <---------- LIES!!!! "DDUU" works
		System.out.println(possible(20, 20, 20, "UDUDUDUDUD")); // YES
		System.out.println(possible(20, 0, 0, "UUUUUUUUUU")); // YES
		System.out.println(possible(20, 0, 0, "UUUUUUUUUUU")); // NO
	}
}

