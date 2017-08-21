import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//Y = yellow
//O = off

public class BerlinClockTest {
	
	BerlinClock berlinClock;
	
	@Before
	public void setUp(){
	berlinClock = new BerlinClock();
	}

	@Test
	public void everyTwoSecondsTheYellowLampBlinksOff(){
		assertEquals("Y", berlinClock.getSeconds(0));
		assertEquals("O", berlinClock.getSeconds(1));
	}
	
	@Test
	public void topRedRowShouldHaveFourLampsAndRepresentFiveHours(){
		assertEquals("4", berlinClock.getTopRedTopRow());
		
	}

}
