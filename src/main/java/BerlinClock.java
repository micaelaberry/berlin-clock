
public class BerlinClock {
	
	int seconds = 0;

	
	public String seconds() {
		return evenSeconds()? "Y": "OFF";
	}

	public void tick (){
		
	}
	private boolean evenSeconds(){
		return true;
	}
}






//	public String getSeconds(int number) {
//		if (number % 2 == 0) {
//			return "Y";
//		} else
//			return "O";
//	}
//
//	public String getTopRedTopRow() {
//		return "4";
//	}
//
//	public String getTopRowHours() {
//		
//		for (int number = 0; number <= 5; number++){			
//	}
//	return"5";
//}

