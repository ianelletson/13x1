import static org.junit.Assert.*;

import org.junit.Test;

public class IntTest {

	@Test
	public void test() {
		IntList ill = IntList.NIL;
		ill = ill.cons(0);
		ill = ill.cons(1);
		ill = ill.cons(2);
		ill = ill.cons(3);
		int san = ill.get(0);
		int ni = ill.get(1);
		int ichi = ill.get(2);
		int rei = ill.get(3);
		System.out.print(ill);
		System.out.print(san);
		System.out.print(ni);
		System.out.print(ichi);
		System.out.print(rei);
		assertEquals(san, 3);
		assertEquals(ni, 2);
		assertEquals(ichi, 1);
		assertEquals(rei, 0);
	}

}
