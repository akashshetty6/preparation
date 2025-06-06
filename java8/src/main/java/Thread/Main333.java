package Thread;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.LinkedList;

public class Main333 {

	public static void main(String[] args) {
		String s="Infosys Certified Java Programmer Mock";
		String u=s.trim().substring(6, 7)+s.trim().substring(37);
//		System.out.println(u);
	
//		s.is
		LinkedList<Integer> l=new LinkedList<>();
//		l.stream().forEach(System.out::println);
//		l.removel
		String[] split = s.split(" ");
		String r=" ";
		boolean t=r.isBlank();
		
		
		LocalDate ll=LocalDate.of(2020, Month.JANUARY, 12);
		LocalTime lt=LocalTime.of(12, 12,12);
		
		LocalDate dd=ll.plusMonths(1).plusWeeks(7).plusDays(9);
		LocalTime e=lt.MIDNIGHT.plusHours(1);
		System.out.println(dd +" "+ e);
	}

}


