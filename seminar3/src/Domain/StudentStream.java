package Domain;

import java.util.Iterator;
import java.util.List;

import Domain.Iterators.StreamIterator;
/**
 * Класс, описывающий пототок студентов
 */
public class StudentStream implements Iterable<StudentGroup>{
	
	private List<StudentGroup> studStream;
	private  int idStream;
	
	/**
	 * Конструктор для создания группы студентов
	 * @param studStream группы студентов
	 * @param id - идентификатор студентов
	 */
	public StudentStream(List<StudentGroup> studStream,int idStream){
		this.studStream = studStream;
		this.idStream = idStream;
	}
	
	
	/**
	 * Геттеры и сетеры для потока студентов
	 */
	public List<StudentGroup> getStudStream() {
		return studStream;
	}


	public void setStudStream(List<StudentGroup> studStream) {
		this.studStream = studStream;
	}

	public int getIdStream() {
		return idStream;
	}

	public void setIdStream(int idStream) {
		this.idStream = idStream;
	}
	
	@Override
	public String toString() {
		String str = "Номер потока - " + this.getIdStream() + ", количество групп -" + this.getStudStream().size();
		return str;
	}

	@Override
	/**
	 * Перечислитель для групп студентов
	 * @return потоковый перечислитель
	 */
	public Iterator<StudentGroup> iterator() {		
		return new StreamIterator(studStream);
	}
		
	
}
