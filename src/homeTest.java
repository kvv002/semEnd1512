import static org.junit.Assert.*;

import org.junit.Test;

public class homeTest {

	@Test
	public void test() {
		TV tv1=new TV("myTv");
		tv1.setOn();
		assertEquals(true,tv1.isOn());
		
	}

}
