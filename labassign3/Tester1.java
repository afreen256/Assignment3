package labassign3;
import labassign3.CommEmpl;
import labassign3.HourlyEmpl;
import labassign3.SalaryEmpl;


public class Tester1 {
		public static void main(String[] args) {

			Invoice invoice = new Invoice("1", "Bag", 2, 300.0);
			System.out.println("Total payment is: " + invoice.getPayment());

			SalaryEmpl salariedEmp = new SalaryEmpl(1000);
			System.out.println("Total payment of Saliried employee is: " + salariedEmp.getPayment());

			CommEmpl comissionEmp = new CommEmpl(50, 500);
			System.out.println("Total payment of Comission employee is: " + comissionEmp.getPayment());

			HourlyEmpl hourlyEmp = new HourlyEmpl(2, 1000);
			System.out.println("Total payment of Saliried employee is: " + hourlyEmp.getPayment());

		}
}

