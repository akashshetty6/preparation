package Thread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Thread1 t1=new Thread1();
		t1.start();
		
		Thread t2=new Thread(new thread2());
		t2.start();

		t1.join();
		t2.join();
		
		
	}
}

class thread2 implements Runnable {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(3*i);
		}
	}
}

class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(4*i);
		}
	}
}


