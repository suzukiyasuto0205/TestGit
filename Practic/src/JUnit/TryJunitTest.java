package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TryJunitTest {

	@Test
	public void testTryJunit() {
		TryJunit m = new TryJunit();
		assertEquals(0, m.num);

		String[] str = { "main", "メソッド" };
		TryJunit.main(str);
		assertNull(TryJunit.sub());
	}

}
