package Controller;

import java.util.List;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
/**
 * Класс для создания контролера
 */
public class ControllerClass{
	
	private List<iGetModel> models;
	private iGetView view;
	/**
	 * Конструктор для создания контролера
	 * @param models список моделей
	 * @param view сущность для вывода информации
	 */
	public ControllerClass(List<iGetModel> models,iGetView view){
		this.models = models;
		this.view = view;
	}
	
	/**
	 * Метод для запуска контролера
	 */
	public void update() {
		String i = view.prompt("Выберите номер модели, данные из которой хотите увидеть: ");
		int index = Integer.parseInt(i);
		view.printAllStudents(models.get(index).getAllStudents());
	}
	/**
	 * Метод для запуска контролера c выбором языка и действия
	 */
	public void run() {
		Command com = Command.NONE;
		boolean getNewIteration = true;
		Language language = Language.NONE;
		String myLanguage = view.prompt("Выберите язык RU или ЕNG: ");
		language = Language.valueOf(myLanguage.toUpperCase());
		
		switch(language) {
			case RU:
				while(getNewIteration) {
					String command = view.prompt("Введите команду: ");
					com = Command.valueOf(command.toUpperCase());
					switch(com) {
						case LIST:
							String i = view.prompt("Выберите номер модели, данные из которой хотите увидеть: ");
							int index = Integer.parseInt(i);
							view.printAllStudents(models.get(index).getAllStudents());
							break;
						case EXIT:
							getNewIteration = false;
							System.out.println("Выход из программы:");
							break;
						case DELETE:
							String i2 = view.prompt("Индекс удаляемого студента: ");
							int index2 = Integer.parseInt(i2);
							for(iGetModel model : models) {
								if(model.deleteStudent(index2)) {
									break;
								}
							}
					}
				}
				break;
			case ENG:
				while(getNewIteration) {
					String command = view.prompt("Enter command: ");
					com = Command.valueOf(command.toUpperCase());
					switch(com) {
						case LIST:
							String i = view.prompt("Choose the model: ");
							int index = Integer.parseInt(i);
							view.printAllStudents(models.get(index-1).getAllStudents());
							break;
						case EXIT:
							getNewIteration = false;
							System.out.println("Exit from programm!");
							break;
						case DELETE:
							String i2 = view.prompt("Id of student: ");
							int index2 = Integer.parseInt(i2);
							for(iGetModel model : models) {
								if(model.deleteStudent(index2)) {
									break;
								}
							}
					}
				}
				break;
		}
				
	}
	
}