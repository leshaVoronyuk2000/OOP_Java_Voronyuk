import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Model.ModelClass;
import Model.ModelClassHash;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;

public class App {

	public static void main(String[] args) {
		
//		
//		
//		System.out.println("----------------------------------------------");
		// First group
		Student studEng1 = new Student("Ben",18);
		Student studEng2 = new Student("Tom",21);
		Student studEng3 = new Student("Margaret",19);
		Student studEng4 = new Student("Sam",22);
		Student studEng5 = new Student("Gwen",18);
		Student studEng6 = new Student("Bob",22);
		Student studEng7 = new Student("Rebecca",21);
		Student studEng8 = new Student("Debra",23);
		
		HashMap<Integer,Student> americanStudents = new HashMap<>();
		americanStudents.put(studEng1.getId(), studEng1);
		americanStudents.put(studEng2.getId(), studEng2);
		americanStudents.put(studEng3.getId(), studEng3);
		americanStudents.put(studEng4.getId(), studEng4);
		americanStudents.put(studEng5.getId(), studEng5);
		americanStudents.put(studEng6.getId(), studEng6);
		americanStudents.put(studEng7.getId(), studEng7);
		americanStudents.put(studEng8.getId(), studEng8);
		
		ModelClassHash modelHash1 = new ModelClassHash(americanStudents);
		
		// Second group
		Student studEng9 = new Student("Lily",22);
		Student studEng10 = new Student("Jack",21);
		Student studEng11 = new Student("Daniel",23);
		Student studEng12 = new Student("Conor",18);
		Student studEng13 = new Student("Mark",22);
		HashMap<Integer,Student> americanStudents2 = new HashMap<>();
		americanStudents2.put(studEng9.getId(), studEng9);
		americanStudents2.put(studEng10.getId(), studEng10);
		americanStudents2.put(studEng11.getId(), studEng11);
		americanStudents2.put(studEng12.getId(), studEng12);
		americanStudents2.put(studEng13.getId(), studEng13);
		ModelClassHash modelHash2 = new ModelClassHash(americanStudents2);
		
		//List of models
		List<iGetModel> modelsHash = new ArrayList<>();
		modelsHash.add(modelHash1);
		modelsHash.add(modelHash2);
		ViewClassEng viewEng = new ViewClassEng();
		
		ControllerClass controllerEng = new ControllerClass(modelsHash,viewEng);
		controllerEng.run();
	}

}
