import static org.junit.Assert.*;

import org.junit.Test;

public class channelUpTest {

	@Test
	public void test() {
		TV tv1=new TV("myTv");
		tv1.setOn();
		tv1.channelUp();
		tv1.channelUp();
		assertEquals(2,tv1.getChannelNumber());
	}

}
