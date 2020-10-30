package labassign3;

public class SalaryEmpl extends Empl implements IncSalary{
	

	private int salary;
	
	public SalaryEmpl(int salary) {
		this.salary = salary;
	}
	
	@Override
	public int getSalary() {
		System.out.println("Salary employee: ");
		return salary;
	}

	@Override
	public int incSalary() {
		return 5;
	}
	

	@Override
	public String toString() {
		return "SalaryEmployee [salary=" + salary + "]";
	}

	@Override
	public double getPayment() {
		System.out.println(this.toString());
		return salary;
	}
}