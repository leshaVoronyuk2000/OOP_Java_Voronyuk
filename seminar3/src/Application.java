import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentStream;
import Domain.Iterators.IteratorStudent;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud1 = new Student("Masha",21);
		Student stud2 = new Student("Dasha",21);
		Student stud3 = new Student("Lesha",20);
		Student stud4 = new Student("Olga",22);
		Student stud5 = new Student("Maksim",18);
		Student stud6 = new Student("Misha",19);
		Student.repealCount();
		Student stud7 = new Student("Vova",21);
		Student stud8 = new Student("Matthew",23);
		Student stud9 = new Student("Eugene",18);
		Student.repealCount();
		Student stud10 = new Student("Andrey",20);
		Student stud11 = new Student("Danil",19);
		Student stud12 = new Student("Masha",20);
		Student stud13 = new Student("Arina",23);
		Student.repealCount();
		Student stud14 = new Student("Andrey",20);
		Student stud15 = new Student("Danil",19);
		Student stud16 = new Student("Masha",20);
		Student stud17 = new Student("Arina",23);
		
		
		
		// Первая группа
		List<Student> group = new ArrayList<>();
		group.add(stud1);
		group.add(stud2);
		group.add(stud3);
		group.add(stud4);
		group.add(stud5);
		group.add(stud6);
		StudentGroup students1 = new StudentGroup(group,5830);

		// Вторая группа
		List<Student> group2 = new ArrayList<>();
		group2.add(stud7);
		group2.add(stud8);
		group2.add(stud9);
		StudentGroup students2 = new StudentGroup(group2,2215);
		
		// Третья группа
		List<Student> group3 = new ArrayList<>();
		group3.add(stud10);
		group3.add(stud11);
		group3.add(stud12);
		group3.add(stud13);
		StudentGroup students3 = new StudentGroup(group3,5845);
		
		// Четвертая группа
		List<Student> group4 = new ArrayList<>();
		group4.add(stud10);
		group4.add(stud11);
		group4.add(stud12);
		group4.add(stud13);
		StudentGroup students4 = new StudentGroup(group4,5840);
		
		// Создание потока студентов		
		List<StudentGroup> groups1 = new ArrayList<>();
		groups1.add(students1);
		groups1.add(students2);
		groups1.add(students3);
		groups1.add(students4);
		StudentStream stream1 = new StudentStream(groups1,1);
	
		Collections.sort(stream1.getStudStream());
		System.out.println(stream1);
		for(StudentGroup currentGroup : stream1) {
			System.out.println(currentGroup);
			
		}
		
		
	}

}
