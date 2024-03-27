package Domain;

public class Teacher extends Person{
	
	private String specialDegree;
	
	public Teacher(String name,int age,String specialDegree) {
		super(name,age);
		this.specialDegree = specialDegree;
	}

	public String getSpecialDegree() {
		return specialDegree;
	}

	public void setSpecialDegree(String specialDegree) {
		this.specialDegree = specialDegree;
	}
	
	
}
