/*43.Create an Abstract class Processor with int member variable data and method showData to display data value.
a.Create abstract method process() to define processing of member data.
b.Create a class Factorial using abstract class Processor to calculate and print factorial of a number by overriding the process method.
c. Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding the process method Ask user to enter choice (factorial or circle area). Also ask data to work upon; Use Processor class reference to achieve this mechanism
*/

import java.util.Scanner;
abstract class Processor {
	int data;

	abstract void process();

	void show() {
		System.out.println("Data:" + data);
	}
}

class Factorial extends Processor {
	double fact;

	Factorial(int data) {
		this.data = data;
	}

	void process() {
		fact = 1;
		while (data > 0) {
			fact = fact * data;
			--data;
		}
		System.out.println("Factorial of Number:" + fact);
	}
}

class Circle extends Processor {
	float PI = 3.14f;
	int radius;
	float area;

	Circle(int radius) {
		this.radius = radius;
	}

	void process() {
		area = PI * radius * radius;
		System.out.println("Area Of Circle is:" + area);
	}
}

class Prog43 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int data1;
		System.out.println("Choose Any One :\n1.Factorial\n2.Circle Area.");
		int ch = sc.nextInt();
		switch (ch) {
			case 1:
				System.out.println("Enter Number to Find Factorial");
				data1 = sc.nextInt();
				Processor obj = new Factorial(data1);
				obj.process();
				break;

			case 2:
				System.out.println("Enter Number to Find Area of Circle");
				data1 = sc.nextInt();
				Processor obj1 = new Circle(data1);
				obj1.process();
				break;
		}
	}
}
