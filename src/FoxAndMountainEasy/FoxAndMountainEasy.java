package FoxAndMountainEasy;

public class FoxAndMountainEasy {
	/*
	 * steps: n
	 * start height: h0
	 * end height: hn
	 * known history: history
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
		if (climb == hn) {
			return true;
		}
		
		if (climb < 0) {
			return false;
		}
		
		int upClimb = climb + nAfterHistory;
		if (hn > climb && upClimb >= hn && isEven(upClimb - hn)) {
			return true;
		}
		
		int downClimb = climb - nAfterHistory;
		if (hn < climb && downClimb <= hn && isEven(downClimb - hn)) {
			return true;
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
}

