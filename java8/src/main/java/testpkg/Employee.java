package testpkg;

public class Employee {

	private int id;
	private String name;
	private Address adress;
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}
	public Employee(int id, String name, Address adress) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	
	
}
