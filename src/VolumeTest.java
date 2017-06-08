import static org.junit.Assert.*;

import org.junit.Test;

public class VolumeTest {

	@Test
	public void test() {
		TV tv1=new TV("myTv");
		tv1.setOn();
		tv1.VolumeUp();
		assertEquals(5,tv1.getVolume());
	}

}
