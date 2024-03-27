package Domain;

import java.util.Iterator;
import java.util.List;

import Domain.Iterators.IteratorStudent;
/**
 * Класс описывающий группу студентов
 */
public class StudentGroup implements Iterable<Student>,Comparable<StudentGroup>{
	
	private List<Student> group;
	private int groupId;
	/**
	 * Cоздание группы студентов
	 * @param group 
	 * @param id  идентификатор группы
	 */
	public StudentGroup(List<Student> group,int id) {
		this.group = group;
		this.groupId = id;
	}
	
	public void setGroup(List<Student> group) {
		this.group = group;
	}
	
	public List<Student> getGroup(){
		return this.group;
	}
	
	public void setGroupId(int id) {
		this.groupId = id;
	}
	
	public int getGroupId() {
		return this.groupId;
	}
	
	
	@Override
	public String toString() {
		String str = "Идентификатор группы - "  + this.getGroupId() + ", количество студентов - " + this.getGroup().size();
		str = str + "\n" + this.getGroup();
		return str;
	
	}

	@Override
	public Iterator<Student> iterator() {
		// TODO Auto-generated method stub
		
		return new IteratorStudent(group);		
		
	}
	

	@Override
	/**
	 * Метод для сравнения групп студентов
	 * @param group - группа студентов
	 */
	public int compareTo(StudentGroup group) {
		// TODO Auto-generated method stub
		if(this.getGroup().size() == group.getGroup().size()) {
			if(this.getGroupId() == group.getGroupId()) {
				return 0;
			}
			if(this.getGroupId() < group.getGroupId()) {
				return -1;
			}
			return 1;
		}
		if(this.getGroup().size() < group.getGroup().size()) {
			return -1;
		}
		return 1;
	}
}
