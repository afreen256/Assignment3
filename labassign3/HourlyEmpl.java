package labassign3;

public class HourlyEmpl extends Empl implements IncreaseSalary {
	private int salaryPerHour;
	private int numOfHours;

	public HourlyEmpl(int salary, int numOfHours) {
		this.salaryPerHour = salary;
		this.numOfHours = numOfHours;
		
	}

	@Override
	public int getSalary() {
		System.out.println("Hourly empl ");		
		return salaryPerHour * numOfHours;
	}

	@Override
	public int increaseSalary() {
		
		return 3;
	}

	@Override
	public double getPayment() {
		return salaryPerHour * numOfHours;
	}

}
