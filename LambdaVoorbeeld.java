package LambdaBoekVoorbeeld;

public class LambdaVoorbeeld {

	public static void main(String[] args) {
		NoMethodParameters noParameters = new NoMethodParameters(); //Methods zonder parameters
		noParameters.print1To10(); //Methods zonder parameters
		noParameters.print10To20(); //Methods zonder parameters
		noParameters.print1To99(); //Methods zonder parameters
		WithMethodParameters withParameters = new WithMethodParameters(); // Methods met parameters
		System.out.println("===10 tot 20==="); 
		withParameters.printNumbers(10, 20); // Methods met parameters
		System.out.println("===1 tot 99===");
		withParameters.printNumbers(1, 99); // Methods met parameters
		System.out.println("===100 tot 200===");
		withParameters.printNumbers(100, 200); // Methods met parameters
		System.out.println("===500 tot 1000===");
		withParameters.printNumbers(500, 1000); // Methods met parameters
	}

}

class NoMethodParameters { //Methods zonder parameters
	
	void print1To10() {
		System.out.println("===Geprint in 1to10===");
		for (int i = 1; i <= 10; i++)
			System.out.println(i);
	}

	void print10To20() {
		System.out.println("===Geprint in 10to20===");
		for (int i = 10; i <= 20; i++)
			System.out.println(i);
	}

	void print1To99() {
		System.out.println("===Geprint in 1to99===");
		for (int i = 1; i <= 99; i++)
			System.out.println(i);
	}
}

class WithMethodParameters { // Methods met parameters
	void printNumbers(int start, int end) {
		for (int i = start; i <= end; i++)
			System.out.println(i);
	}
}