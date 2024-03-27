package Domain.Iterators;

import java.util.Iterator;
import java.util.List;

import Domain.Student;
/**
 * Итератор
 */

public class IteratorStudent implements Iterator<Student>{
	
	private static int count;
	private List<Student> group;
	/**
	 * Создание итератора
	 * @group - перебираемая группа
	 */
	public IteratorStudent(List<Student> group) {
		this.group = group;
	}
	@Override
	/**
	 * Метод проверяет наличие оставшихся элементов в коллекции
	 */
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return count < group.size();
	}

	@Override
	public Student next() {
		// TODO Auto-generated method stub
		return this.group.get(count++);
	}

}
