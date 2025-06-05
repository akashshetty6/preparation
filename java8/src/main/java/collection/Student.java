package collection;

public class Student {

	private int id;
	private int marks;
	private String name;
	
	public Student(int id, int marks,String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name=name;
	}
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + ", name=" + name + "]";
	}





//
//	public int compareTo(Student st) {
//			
//		return this.marks>st.marks?-1:1;
//	}

	
	
	
	
}
