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
		for (int i = 4; i < 1000; i++) {
			ill = ill.cons(i);
		}
		int san = ill.get(0);
//		int ni = ill.get(1);
//		int ichi = ill.get(2);
//		int rei = ill.get(3);
//		System.out.print(ill);
//		System.out.print(ill);
//		System.out.print(san);
//		System.out.print(ni);
//		System.out.print(ichi);
//		System.out.print(rei);
		assertEquals(san, 999);
//		assertEquals(ni, 8);
//		assertEquals(ichi, 7);
//		assertEquals(rei, 6);
	}

}
