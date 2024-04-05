package Model.Domain;

/**
 * Класс, описывающий студента
 */
public class Student extends Person implements Comparable<Student>{
	
	 	private int id;
	    private static int generalId = 1;
	    
	    /**
	     * Конструктор для создания студента
	     * @param name - имя студента
	     * @param age - возраст студента
	     */
	    public Student(String name, int age) {
	        super(name, age);
	        this.id = generalId;
	        generalId++;
	    }

	    /**
	     * Метод для получения id студента
	     * @return id студента
	     */
	    public int getId() {
	        return id;
	    }

	    @Override
	    public String toString() {
	        return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
	    }

	    /**
	     * Переопределение метода compareTo
	     */
	    @Override
	    public int compareTo(Student o) {

	        if(super.getAge()==o.getAge())
	        {
	            if(id==o.id)return 0 ;
	            if(id>o.id)return 1;
	            else return -1;
	            //return 0;
	        }

	        if(super.getAge()>o.getAge())
	        return 1;
	        else
	        return -1;        
	    }    
}
