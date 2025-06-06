package testpkg;

class MyThread extends Thread { MyThread() {

	System.out.print("MyThread ");

}

@Override

public void run() {

	System.out.print("run ");
}
public void run(String s) {

	System.out.print("run with parameters");}

}

public class TestThreads { 
	public static void main(String[] args) { 
		Thread t = new MyThread() { 
			
			

@Override
public void run() {
System.out.println("Hi");
}
};
t.start();

}}