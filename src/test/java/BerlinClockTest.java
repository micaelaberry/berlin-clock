import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


import org.junit.Before;
import org.junit.Test;

//Y = yellow
//O = off

public class BerlinClockTest {
	
//	BerlinClock berlinClock;
	
//	@Before
//	public void setUp(){
//	berlinClock = new BerlinClock();
//	}
	
	@Test
	public void  shouldBeenYellowOnEven(){
		BerlinClock underTest = new BerlinClock();
		String seconds = underTest.seconds();
		assertThat(seconds, is("Y"));
	}
	
	@Test
	public void shouldBeOffOnOddSeconds(){
		BerlinClock underTest = new BerlinClock();
		underTest.tick();
		String seconds = underTest.seconds();
		assertThat(seconds, is("OFF"));
	}
	
	@Test
	public void shouldBeOnEveryTwoSeconds(){
		BerlinClock underTest = new BerlinClock();
		underTest.tick();
		String seconds = underTest.seconds();
		assertThat(seconds, is("Y"));
	}
	
	
	
	
	
}
//	@Test
//	public void everyTwoSecondsTheYellowLampBlinksOff(){
//		assertEquals("Y", berlinClock.getSeconds(0));
//		assertEquals("O", berlinClock.getSeconds(1));
//	}
//	
//	@Test
//	public void topRedRowShouldHaveFourLamps(){
//		assertEquals("4", berlinClock.getTopRedTopRow());	
//	}
//	
//	@Test
//	public void topRedRowShouldReturn5Hours(){
//		assertEquals("5", berlinClock.getTopRowHours());
//	}
	


