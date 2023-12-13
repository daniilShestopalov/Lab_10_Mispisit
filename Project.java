import java.util.Date;

public class Project {

	public String name;
	public Date start;
	public Date end;

	public Project(String name, Date start, Date end) {
		this.name = name;
		this.start = start;
		this.end = end;
	}

	public Project() {
	}

	public void makeNewProjectData(Date start, Date end) {
		System.out.println("Даты измеены");
	}

	@Override
	public String toString() {
		return "Project{" +
				"name='" + name + '\'' +
				", start=" + start +
				", end=" + end +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}
}