package FoxAndMountainEasy;

import static org.junit.Assert.*;

import org.junit.Test;

public class FoxAndMountainEasyTest {

	@Test
	public void test() {
		// TopCoder Examples
		assertEquals("\"YES\"", FoxAndMountainEasy.possible(4, 0, 4, "UU"));
		assertEquals("\"NO\"", FoxAndMountainEasy.possible(4, 0, 4, "D"));
		assertEquals("\"YES\"", FoxAndMountainEasy.possible(4, 100000, 100000, "DDU"));
		assertEquals("\"NO\"",	FoxAndMountainEasy.possible(4, 0, 0, "DDU"));
		assertEquals("\"YES\"", FoxAndMountainEasy.possible(20, 20, 20, "UDUDUDUDUD"));
		assertEquals("\"YES\"", FoxAndMountainEasy.possible(20, 0, 0, "UUUUUUUUUU"));
		assertEquals("\"NO\"", FoxAndMountainEasy.possible(20, 0, 0, "UUUUUUUUUUU"));
		
		// TopCoder First 10 Tests
		assertEquals("\"NO\"", FoxAndMountainEasy.possible(10, 10, 22, "U"));
		assertEquals("\"NO\"", FoxAndMountainEasy.possible(10, 10, 11, "D"));
		assertEquals("\"NO\"", FoxAndMountainEasy.possible(36, 52, 70, "DDDDDDDDDDUUDDDDDDDDDDDDDDDDD"));
		assertEquals("\"YES\"", FoxAndMountainEasy.possible(5, 5, 4, "U"));
		assertEquals("\"YES\"", FoxAndMountainEasy.possible(67994, 2675, 645, "DDDDDDDUUDUUDDDUDDDDDDDDDDDDDDDDUDDDDD"));
		assertEquals("\"YES\"", FoxAndMountainEasy.possible(89003, 85932, 10413, "UUDDDDDDDDDDDDDDDDDDDDUDUDU"));
		assertEquals("\"YES\"", FoxAndMountainEasy.possible(52281, 2513, 48060, "DDDDDDDUDUDUUD"));
		assertEquals("\"YES\"", FoxAndMountainEasy.possible(7274, 72, 492, "DDDDDDDDDDDDDDUDDUDDDDDDDDDDDDDDDDDDDDDDDDDDDDD"));
		assertEquals("\"YES\"", FoxAndMountainEasy.possible(37, 36, 31, "U"));
		assertEquals("\"YES\"", FoxAndMountainEasy.possible(10370, 4658, 3990, "UUDUUDUDDUDUUUUDDUDDUUDUUDDDUUUUUDUDUDDDDDUUDDUU"));
		assertEquals("\"YES\"", FoxAndMountainEasy.possible(66264, 40406, 48634, "DDDDDDUDUDDUUUUDUUUDUUUDDDDUUDUUUUDDDDUDDDDDDDU"));
	}
}
