package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Json {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "1, 2, 3, 4, two, 5, four, eight";
		String[] split = s.replaceAll("\\s+", "").split(",");
		List<String> asList = new ArrayList<>(Arrays.asList(split));
		
		StringBuilder sb=new StringBuilder("{");
			if(asList.contains("1") && asList.contains("one")) {
				sb.append("one").append(":").append("1,");
			}
			 if(asList.contains("2") && asList.contains("two")) {
				sb.append("two").append(":").append("2,");				
			}
			 if(asList.contains("3") && asList.contains("three")) {
				sb.append("three").append(":").append("3");
			}
			 if(asList.contains("4") && asList.contains("four")) {
				sb.append("four").append(":").append("4,");
			}
			 if(asList.contains("5") && asList.contains("five")) {
				sb.append("five").append(":").append("5");
			}
			 if(asList.contains("6") && asList.contains("six")) {
				sb.append("six").append(":").append("6");
			}
			 if(asList.contains("7") && asList.contains("seven")) {
				sb.append("seven").append(":").append("7");
			} if(asList.contains("8") && asList.contains("eight")) {
				sb.append("eight").append(":").append("8");
			}
			
		System.out.println(sb.replace(sb.length()-1, sb.length(), ""));
		System.out.println(sb.replace(sb.length()-1, sb.length(), "").append("}"));
		
		
	}

}
