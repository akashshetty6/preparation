package testpkg;

public class Address {

	private int id;
	private String addr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Address(int id, String addr) {
		super();
		this.id = id;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", addr=" + addr + "]";
	}
	
	
	
}
