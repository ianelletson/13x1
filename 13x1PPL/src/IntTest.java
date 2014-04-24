import static org.junit.Assert.*;

import org.junit.Test;

public class IntTest {

	@Test
	public void test() {
		IntList ill = IntList.NIL;
		int test = 10000;
//		ill = ill.cons(0);
//		ill = ill.cons(1);
//		ill = ill.cons(2);
//		ill = ill.cons(3);
		for (int i = 0; i < test; i++) {
			ill = ill.cons(i);
		}
		int san = ill.get(20);
		int ni = ill.get(5);
//		int ichi = ill.get(2);
//		int rei = ill.get(3);
//		System.out.print(ill);
//		System.out.print(ill);
//		System.out.print(san);
//		System.out.print(ni);
//		System.out.print(ichi);
//		System.out.print(rei);
		assertEquals(san, test-21);
		assertEquals(ni, test-6);
//		assertEquals(ichi, 7);
//		assertEquals(rei, 6);
	}

}
