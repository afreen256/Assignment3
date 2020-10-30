package labassign3;
import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = sc.nextInt();

		switch (choice) {
			case 1:
				
				Empl employee;
				employee = new SalaryEmpl(10000);
				System.out.println(employee.getSalary());

//				employee = new HourlyEmpl(1000, 5);
//				employee.getSalary();
//
//				employee = new CommEmpl(50, 100);
//				employee.getSalary();
				
				break;
			case 2:
				Empl employee1;
				employee1 = new SalaryEmpl(1000);
				employee1.setRate((2)*employee1.getSalary());
				System.out.println(employee1.getRate());
				
				employee1 = new HourlyEmpl(1000, 12);
				employee1.setRate((2*employee1.getSalary()));
				System.out.println(employee1.getRate());

				employee1 = new CommEmpl(1000, 50);
				employee1.setRate((2)*employee1.getSalary());
				System.out.println(employee1.getRate());
				break;
			default:
				break;

		}

	}
}

