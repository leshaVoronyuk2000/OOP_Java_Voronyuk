package Domain.Iterators;
import java.util.Iterator;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
/**
 * Перечислитель для потока групп студентов
 */
public class StreamIterator implements Iterator<StudentGroup>{
	
	private int count;
	private List<StudentGroup> studentStream;
	
	public StreamIterator(List<StudentGroup> studentStream) {
		this.studentStream = studentStream;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return count < studentStream.size();
	}

	@Override
	public StudentGroup next() {
		// TODO Auto-generated method stub
		return studentStream.get(count++);
	}
	
}
