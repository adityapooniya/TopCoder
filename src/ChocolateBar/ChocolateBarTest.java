package ChocolateBar;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChocolateBarTest {

	@Test
	public void test() {
		// TopCoder Examples
		assertEquals(3, ChocolateBar.maxLength("srm"));
		assertEquals(6, ChocolateBar.maxLength("dengklek"));
		assertEquals(2, ChocolateBar.maxLength("haha"));
		assertEquals(1, ChocolateBar.maxLength("www"));
		assertEquals(9, ChocolateBar.maxLength("thisisansrmbeforetopcoderopenfinals"));
		
		// TopCoder First 10 Tests
		assertEquals(1, ChocolateBar.maxLength("x"));
		assertEquals(3, ChocolateBar.maxLength("abcabcabc"));
		assertEquals(3, ChocolateBar.maxLength("cab"));
		assertEquals(5, ChocolateBar.maxLength("cebad"));
		assertEquals(10, ChocolateBar.maxLength("gcfbhjidea"));
		assertEquals(15, ChocolateBar.maxLength("hognikedalcfjbm"));
		assertEquals(20, ChocolateBar.maxLength("moqcpjnashriglefbdtk"));
		assertEquals(25, ChocolateBar.maxLength("qaljvodxnwhstprbeuikgfmyc"));
		assertEquals(19, ChocolateBar.maxLength("wfkgeszaxsjnepmtuobdvlycrusihq"));
		assertEquals(13, ChocolateBar.maxLength("mgbgvxdvybnghapsfzguvjutwomdjckelyiwrckq"));	
	}

}
