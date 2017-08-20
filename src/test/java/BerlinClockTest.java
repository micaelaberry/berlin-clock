import static org.junit.Assert.*;

import org.junit.Test;

public class BerlinClockTest {

	@Test
	public void everyTwoSecondsTheYellowLampBlinksOff(){
		BerlinClock berlinClock = new BerlinClock();
		assertEquals("Y", berlinClock.getSeconds(0));
	}
	
}
