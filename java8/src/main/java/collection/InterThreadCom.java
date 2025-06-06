package collection;

 public class InterThreadCom {
	public static void main(String[] args) throws InterruptedException {
		Thread1 In=new Thread1();
		In.start();
		
		synchronized (In) {
			System.out.println(In.count);
			In.wait();
			System.out.println(In.count);
		}
//		System.out.println(In.count);
	}
}
class Thread1 extends Thread{
	int count=10;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<5;i++) {
				count+=i;
			}	
			this.notify();
		}
		
	}
}