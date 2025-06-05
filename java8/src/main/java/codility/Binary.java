package codility;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		byte b=0b1111;
		System.out.println(b);
		int count =0;
		int maxC=0;
		while(Integer.valueOf(b)>0) {
//			System.out.println(Integer.valueOf(b));
//			System.out.println(b&1);
			if((b & 1)==1) {
				count=count+1;
				b=(byte) (b>>1);
			}
			if((b & 1)==0) {
				if(count>=maxC) {
					maxC=count;
					count=0;
				}
			}
		}
		System.out.println(maxC);
		*/
		String s="Geeks.for.geeks";
		String[] split = s.split("\\.");
		for(String s1:split) {
			System.out.println(s1);
		}
	}
}
