package collection;

public class Employee {

	Address adr;
	int age;
	String name;
	public Employee(Address adr, int age, String name) {
		super();
		this.adr = adr;
		this.age = age;
		this.name = name;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [adr=" + adr + ", age=" + age + ", name=" + name + "]";
	}
	
	
	
}
