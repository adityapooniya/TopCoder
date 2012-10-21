package GreatFairyWar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreatFairyWarTest {

	@Test
	public void test() {
		// TopCoder Examples
		assertEquals(17, GreatFairyWar.minHP(
				new int[] {1,2},
				new int[] {3,4}));
		assertEquals(55, GreatFairyWar.minHP(
				new int[] {1,1,1,1,1,1,1,1,1,1}, 
				new int[] {1,1,1,1,1,1,1,1,1,1}));
		assertEquals(1767,GreatFairyWar.minHP(
				new int[] {20,12,10,10,23,10},
				new int[] {5,7,7,5,7,7}));
		assertEquals(1998, GreatFairyWar.minHP(
				new int[] {5,7,7,5,7,7},
				new int[] {20,12,10,10,23,10}));
		assertEquals(11029, GreatFairyWar.minHP(
				new int[] {30,2,7,4,7,8,21,14,19,12}, 
				new int[] {2,27,18,19,14,8,25,13,21,30}));
		assertEquals(1, GreatFairyWar.minHP(
				new int[] {1},
				new int[] {1}));
		
		// TopCoder First 10 Tests
		assertEquals(21938, GreatFairyWar.minHP(
				new int[] {8, 19, 7, 12, 16, 16, 10, 10, 10, 18, 14, 17, 8, 18, 12, 15},
				new int[] {17, 8, 9, 18, 11, 10, 11, 7, 7, 12, 13, 18, 17, 13, 13, 10}));
		assertEquals(2585, GreatFairyWar.minHP(
				new int[] {5, 1, 5, 2, 7, 7, 6, 7, 5, 5, 1, 6, 5, 1, 5, 5, 2, 1, 1},
				new int[] {2, 5, 2, 3, 6, 5, 4, 2, 3, 2, 3, 7, 6, 5, 7, 2, 2, 5, 7}));
		assertEquals(816, GreatFairyWar.minHP(
				new int[] {5, 6, 6, 5, 4, 5, 4, 5},
				new int[] {4, 4, 4, 6, 6, 6, 5, 5}));
		assertEquals(1056, GreatFairyWar.minHP(
				new int[] {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4},
				new int[] {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}));
		assertEquals(30283, GreatFairyWar.minHP(
				new int[] {12, 8, 15, 11, 10, 9, 10, 11, 15, 15, 11, 9, 14, 13, 12, 12, 11, 9, 10, 10, 10},
				new int[] {14, 13, 9, 15, 9, 14, 11, 8, 8, 9, 13, 14, 15, 9, 15, 9, 15, 15, 14, 12, 11}));
		assertEquals(279, GreatFairyWar.minHP(
				new int[] {2, 1, 2, 1, 2, 2, 1, 1, 2, 1, 1, 2, 2, 2},
				new int[] {1, 2, 2, 2, 2, 2, 1, 1, 1, 2, 2, 2, 2, 1}));
		assertEquals(1209, GreatFairyWar.minHP(
				new int[] {3, 5, 5, 5, 1, 1, 1, 2, 2, 2, 4, 2, 5, 5, 2, 1, 4, 1},
				new int[] {2, 4, 3, 1, 2, 2, 4, 4, 2, 1, 4, 3, 1, 5, 5, 1, 1, 2}));
		assertEquals(51771, GreatFairyWar.minHP(
				new int[] {19, 19, 20, 19, 19, 20, 19, 19, 20, 19, 20, 19, 20, 20, 20, 19},
				new int[] {20, 20, 19, 20, 19, 19, 20, 19, 19, 19, 19, 20, 20, 20, 20, 19}));
		assertEquals(1063, GreatFairyWar.minHP(
				new int[] {4, 7, 6, 2, 5, 3, 2, 6, 2, 5},
				new int[] {6, 6, 2, 7, 3, 7, 5, 4, 2, 2}));
		assertEquals(5081, GreatFairyWar.minHP(
				new int[] {6, 3, 3, 3, 4, 8, 6, 5, 4, 8, 7, 7, 8, 2, 2, 2, 6, 5, 6, 2, 3, 3},
				new int[] {3, 5, 3, 3, 8, 5, 2, 3, 4, 5, 7, 3, 7, 4, 7, 6, 4, 8, 4, 6, 5, 8}));
	}
}
