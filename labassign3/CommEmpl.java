package labassign3;

public class CommEmpl extends Empl implements IncreaseSalary {
	private int percentage;
	private int weeklysalary;
	public CommEmployee(int perecentage, int weeklySalary) {
		this.percentage = percentage;
		this.weeklysalary = weeklysalary;
	}
	@Override
	public int getSalary() {
		System.out.println("Salary of comission employee is ");
		return (percentage*weeklysalary)/100;
	}

	@Override
	public int increaseSalary() {
		return 3;
	}

	@Override
	public double getPayment() {
		
		return (percentage*weeklysalary)/100;
	}
}
	
	

}
