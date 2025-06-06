package collection;

public class SynchronizedExample {
	int totalSeats=10;
	public synchronized void bookTickets(int bookTickets) {
		if(bookTickets>totalSeats) {
			System.out.println("Dont have "+bookTickets+" left");
		}else {
			totalSeats-=bookTickets;
			System.out.println("tickets booked "+bookTickets);
			System.out.println(totalSeats+" left");
		}
	}
	
	public static void main(String[] args) {
		SynchronizedExample example=new SynchronizedExample();
		
		Thread t1=new Thread(()->example.bookTickets(8));
		Thread t2=new Thread(()->example.bookTickets(8));
		
		t1.start();
		t2.start();		
	}

}

