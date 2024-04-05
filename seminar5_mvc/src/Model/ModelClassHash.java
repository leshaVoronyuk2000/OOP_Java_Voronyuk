package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;
/**
 * Модель для хранения информации в виде HashMap;
 */
public class ModelClassHash implements iGetModel{
	
	private HashMap<Integer,Student> students;
	/**
	 * Конструктор для создания модели
	 * @param students - группа студентов
	 */
	public ModelClassHash(HashMap<Integer,Student> students) {
		this.students = students;
	}
	/**
	 * Метод для получения всех студентов
	 * @return studentList - список студентов
	 */
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<>();
		for(Map.Entry<Integer, Student> e : students.entrySet()) {
			studentList.add(e.getValue());
		}
		return studentList;
	}
	@Override
	public boolean deleteStudent(int i) {
		boolean isStudentRemoved = false;
		for(Map.Entry<Integer, Student> e : students.entrySet()) {
			if(i == e.getKey()) {
				students.remove(i);
				isStudentRemoved = true;
				break;
			}
		}
		return isStudentRemoved;
	}
}
