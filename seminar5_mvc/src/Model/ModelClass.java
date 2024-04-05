package Model;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;
/**
 * Хранилище студентов
 */
public class ModelClass implements iGetModel{
	
	private List<Student> students;
	/**
	 * Конструктор для создания хранилища студентов
	 * @param students группа студентов
	 */
	public ModelClass(List<Student> students) {
		this.students = students;
	}
	
	public List<Student> getAllStudents(){
		return students;
	}
	/**
	 * Метод для удаления студентов
	 * @param i - индекс удаляемого студента
	 */
	@Override
	public boolean deleteStudent(int i) {
		boolean isStudentRemoved = false;
		for(Student s : students) {
			if(s.getId() == i) {
				students.remove(i-1);
				isStudentRemoved = true;
				break;
			}
		}
		
		if(!isStudentRemoved) {
			System.out.println("Такого студента нет");
		}
		
		return isStudentRemoved;
	}
}
