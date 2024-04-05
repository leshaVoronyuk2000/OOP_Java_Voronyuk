package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

/**
 * Класс для вывода информации
 */
public class ViewClass implements iGetView{
	
	/**
	 * Метод для вывода группы студентов на экран
	 */
	public void printAllStudents(List<Student> students) {
		for(Student s : students) {
			System.out.println(s);
		}
	}
	
	/**
	 * Метод для считывания информации с консоли
	 */
	
	public String prompt(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg);
		String str = scan.nextLine();
		
		return str;
	}
	
	
}
