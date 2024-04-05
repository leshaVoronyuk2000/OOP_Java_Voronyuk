package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

/**
 * Класс для представления информации на английском языке
 */
public class ViewClassEng implements iGetView{

	/**
	 * Метод для вывода группы студентов на экран
	 * @param ListList<Student> students группа студентов
	 */
	@Override
	public void printAllStudents(List<Student> students) {
		for(Student s : students) {
			System.out.println(s);
		}	
	}
	
	/**
	 * Метод для считывания информации с консоли
	 */
	@Override
	public String prompt(String msg) {
		System.out.print(msg);
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		return str;
	}

}
