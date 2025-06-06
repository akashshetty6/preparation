package Thread;

public class EvenOddThreads implements Runnable {

	Object o;
	int count =0;
	public EvenOddThreads(Object o) {
		this.o=o;
	}

	public static void main(String[] args) {

		Object o=new Object();
		
		EvenOddThreads e1=new EvenOddThreads(o);EvenOddThreads e2=new EvenOddThreads(o);
		new Thread(e1, "even").start();
		new Thread(e2, "odd").start();
	}

	@Override
	public void run() {
		while(count<10) {
			synchronized (o) {
				if(count%2==0 && Thread.currentThread().getName().equals("even")) {
					System.out.println(count +" "+ Thread.currentThread().getName());
					count++;
					try {
						o.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	
					}
				}
			synchronized (o) {
				if(count%2!=0 && Thread.currentThread().getName().equals("odd")) {
					System.out.println(count +" "+ Thread.currentThread().getName());
					count++;
					o.notify();
				}
				
			}
				
			}
			
			
			
		}
	}
	
	


