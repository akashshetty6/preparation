package codility;

public class BinaryGap {
	
	public static int solution(int N) {
		String binary = Integer.toBinaryString(N);
		String[] strArray = binary.replaceAll("0+$", "").split("1");
		int maxGap = 0;
		for(String S: strArray) {
			if(S.length() > maxGap) {
				maxGap = S.length();
			}
		}
		return maxGap;
	}

	public static void main(String[] args) {

	System.out.println(solution(524));
	}

}
