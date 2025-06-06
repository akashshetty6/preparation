package codility;

public class CyclicRotation {

	public static void main(String[] args) {
     int arr[]= {1,2,3,4,5,6};
     int k=2;
     cyclicRotation(arr, k);
     
	}
	
	static void cyclicRotation(int arr[],int k) {
		for(int i=0;i<k;i++) {
			for(int j=arr.length-1;j>0;j--) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		}
		for(int x:arr) {
			System.out.print(x);
		}
	}

}
