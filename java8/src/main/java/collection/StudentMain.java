package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> st= new ArrayList();
		st.add(new Student(1, 80,"vasant"));
		st.add(new Student(2, 89,"akash"));
		st.add(new Student(3, 8,"suraj"));
		st.add(new Student(4, 70,"prajwal"));
		
//		Collections.sort(st);
//		System.out.println(st);
		
		Comparator<Student> com=new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getMarks()>o2.getMarks()?1:-1;
			}
			
		};
		
		Comparator<Student> com1=new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		};
		
		Collections.sort(st, com1);
		System.out.println(st);
		;

	}

}
