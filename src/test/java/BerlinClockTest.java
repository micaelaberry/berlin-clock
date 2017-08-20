import static org.junit.Assert.*;

import org.junit.Test;

//Y = yellow
//O = off

public class BerlinClockTest {

	@Test
	public void everyTwoSecondsTheYellowLampBlinksOff(){
		BerlinClock berlinClock = new BerlinClock();
		assertEquals("Y", berlinClock.getSeconds(0));
		assertEquals("O", berlinClock.getSeconds(1));
	}
	

}
