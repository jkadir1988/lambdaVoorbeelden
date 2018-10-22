package LambdaBoekVoorbeeld;

import java.util.ArrayList;

public class VoorbeeldLambda {

	public static void main(String[] args) {
		Emp e1 = new Emp("Shreya", 5, 9999.00);
		Emp e2 = new Emp("Paul", 4, 1234.00);
		Emp e3 = new Emp("Harry", 5, 8769.00);
		Emp e4 = new Emp("Selvan", 1, 2769.00);

		ArrayList<Emp> empArrList = new ArrayList<>();
		empArrList.add(e1);
		empArrList.add(e2);
		empArrList.add(e3);
		empArrList.add(e4);

		// voorbeeld 1 van Lambda Expression
		Validate validatePerfor = e -> e.getPerformanceRating() >= 5; // Lambda expression hier bepaal je bij de 5 wat
																		// eruit print
		System.out.println("geprint voorbeeld 1");
		filter(empArrList, validatePerfor); // Lambda expression
		// voorbeeld 2 van Lambda Expression
		Validate validate = (Emp e) -> e.getPerformanceRating() >= 5;
		System.out.println("geprint voorbeeld 2");
		filter(empArrList, validatePerfor); // Lambda expression
		// voorbeeld 3 van Lambda Expression
		Validate valiDate = (e) -> {
			return e.getPerformanceRating() >= 5;
		};
		System.out.println("geprint voorbeeld 3");
		filter(empArrList, validatePerfor); // Lambda expression

		System.out.println("geprint geen Lambda Expression");
		filter(empArrList, new ValidatePerformanceRating()); // Geen Lambda Expression

	}

	static void filter(ArrayList<Emp> list, Validate rule) {
		for (Emp e : list) {
			if (rule.check(e)) {
				System.out.println(e);
			}
		}
	}
}

interface Validate {
	boolean check(Emp emp);
}

class Emp {
	String name;
	int performanceRating;
	double salary;

	Emp(String nm, int rating, double sal) {
		name = nm;
		performanceRating = rating;
		salary = sal;
	}

	public String getName() {
		return name;
	}

	public int getPerformanceRating() {
		return performanceRating;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name + ":" + performanceRating + ":" + salary;
	}
}

class ValidatePerformanceRating implements Validate {
	public boolean check(Emp emp) {
		return (emp.getPerformanceRating() >= 5); // belangrijk dat hier wordt bepaald wat geprint wordt. Dit is geen
													// Lambda expression
	}
}

class ValidateName implements Validate {
	public boolean check(Emp emp) {
		return (emp.name.startsWith("P"));
	}
}