package java8;

public class GroupBy {

	public static void main(String[] args) {
		
		Annonymous a=t->{
			if(t.charAt(0)=='a') {
				return "yes";
			}
			return "no";
		};
		System.out.println(a.show("kash"));

		
	}

}
