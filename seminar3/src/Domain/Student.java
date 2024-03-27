package Domain;
/**
 * Класс, описывающий студента
 */
public class Student extends Person {
	/**
	 * Id студента
	 */
	private int id;
	private static int count = 1;
	
	public static void repealCount(){
		count = 1;
	}
	/**
	 * @param name Имя студента
	 * @param age Возраст студента
	 */
	public Student(String name,int age){
		super(name,age);
		id = count++;
	}
	
	public int getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return "Student - " + super.getName()
				+ ", age -" + super.getAge()
				+ ", studentId - " + this.id;
	}

//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		if(this.getAge() == o.getAge()) {
//			return 0;
//		}
//		if(this.getAge() < o.getAge()) {
//			return -1;
//		}
//		return 1;
//	}
}
