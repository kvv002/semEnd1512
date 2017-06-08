import static org.junit.Assert.*;

import org.junit.Test;

public class ACOnTest {

	@Test
	public void test() {
		AC ac1=new AC("myAC",30);
		ac1.setOn();
		assertEquals(true,ac1.isOn());
	}

}
