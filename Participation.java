public class Participation {

	public int hours;

	public Participation(int hours) {
		this.hours = hours;
	}


	public Participation() {
	}

	public void addTime(int hours) {
		this.hours += hours;
		System.out.println("Время продлено");
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "Participation{" +
				"hours=" + hours +
				'}';
	}
}