package testpkg;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainEmp {

	public static void main(String[] args) {
		
		Comparator<Employee> com=new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getId()>o2.getId()?-1:1;
			}
		};
		
		
	
		Address ad=new Address(1, "mysore");

		Employee emp1=new Employee(1,"akash",ad);
		Employee emp2=new Employee(2,"akash",ad);
		Employee emp3=new Employee(3,"akash",ad);
		Employee emp4=new Employee(4,"akash",ad);
		Employee emp5=new Employee(5,"akash",ad);
		
		List<Employee> list=Arrays.asList(emp1,emp2,emp3,emp4,emp5);
		list.sort(com);
		System.out.println(list);
		
	}
	
	

}
