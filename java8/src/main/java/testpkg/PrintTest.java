package testpkg;
public class PrintTest{


PrintTest(){

System.out.print("Print1");

}

public void testMethod() {

System.out.print("Print2");

}

{

System.out.print("Print3");

}

public void PrintTest() { System.out.print("Print4");}



static {

System.out.print(" Print5");

}



public static void main(String[] args) { 
	PrintTest test1 = new PrintTest(); 
	test1.PrintTest(); test1.testMethod();
}

}