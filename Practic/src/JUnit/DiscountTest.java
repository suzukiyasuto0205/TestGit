package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiscountTest {

	@Test
	void testSexCheck() {
		Discount cs = new Discount();
		assertEquals(0.2, cs.sexCheck("f"), 0.0);
		assertEquals(0.1, cs.sexCheck("m"), 0.0);
	}

	@Test
	void testPriceCheck() {
		Discount pc = new Discount();
		assertTrue(pc.priceCheck(50000));
		assertFalse(pc.priceCheck(10000));
	}

	@Test
	void testAgeCheck() {
		Discount ac = new Discount();
		assertEquals(5000, ac.ageCheck(18));
		assertEquals(1000, ac.ageCheck(21));
	}

}
