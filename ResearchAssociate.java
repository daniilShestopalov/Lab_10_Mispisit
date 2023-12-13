public class ResearchAssociate extends Employee {

	public String fieldOfStudy;


	public ResearchAssociate(String name, String fieldOfStudy) {
		this.name = name;
		this.fieldOfStudy = fieldOfStudy;
	}

	public void updateFieldOfStudy(String fieldOfStudy) {
//		this.fieldOfStudy = fieldOfStudy;
		System.out.println("Область изучения изменена");
	}

	@Override
	public String toString() {
		return "ResearchAssociate{" +
				"name='" + name + '\'' +
				", fieldOfStudy='" + fieldOfStudy + '\'' +
				'}';
	}
}