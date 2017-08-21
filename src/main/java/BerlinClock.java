
public class BerlinClock {

	public String getSeconds(int number) {
		if (number % 2 == 0) {
			return "Y";
		} else
			return "O";
	}

	public String getTopRedTopRow() {
		return "4";
	}
}
