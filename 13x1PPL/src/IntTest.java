import static org.junit.Assert.*;

import org.junit.Test;

public class IntTest {

	@Test
	public void test() {
		boolean t = true;
		int i = t == true ? 1 : 0;
		assert(i == 1);
		IntList ill = IntList.NIL.cons(1);
		ill.cons(1);
		int one = ill.get(1);
		assert (one == 1);
		ill.cons(2);
		ill.cons(3);
		ill.cons(4);
		int zero = ill.get(0);
		assert (zero == 0);
//		int one = ill.get(1);
//		assert (one == 1);
//		int four = ill.get(4);
//		assert (four == 4);
		
		
//		fail("Not yet implemented");
	}

}
