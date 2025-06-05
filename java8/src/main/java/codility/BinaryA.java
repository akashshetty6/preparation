package codility;

public class BinaryA {

	public static void main(String[] args) {
		/*
		byte b=0b1101;
		int count=0;
		int maxC=0;
		while(Integer.valueOf(b)>0) {
			if((b&1)==1) {
				count++;
				b=(byte) (b>>1);
			}
			if((b&1)==0) {
				if(count>=maxC) {
					maxC=count;
					count=0;
//					b=(byte) (b>>1);
				}
			}
		}
		System.out.println(maxC);
		*/
		String s="Geeks.for.geeks";
		String[] split = s.split(".");
		for(String s1:split) {
			System.out.println(s);
		}
	}
}
