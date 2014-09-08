import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/* 
		 * Takes keyboard input from the user and then calculates and prints how much needs to be saved monthly and in total
		 * Input: Null
		 * Output: Null
		 */
		Scanner input = new Scanner(System.in);
		
		double s_month;
		
		double t_savings = 0;
		
		System.out.print("Enter years to work:");
		double w_years = input.nextDouble();
		
		System.out.print("Enter investment annual return in percent:");
		double a_return1 = (input.nextDouble() * .01);
		
		System.out.print("Enter years retired:");
		double r_years = input.nextDouble();
		
		System.out.print("Enter retirement annual return in percent:");
		double a_return2 = (input.nextDouble() * .01);
		
		System.out.print("Enter required income:");
		double r_income = input.nextDouble();

		System.out.print("Enter monthly SSI:");
		double m_SSI = input.nextDouble();
		
		double m_withdraw = r_income - m_SSI;
		
		double x = 0;
		
		while (x < (r_years * 12)){
			x += 1;
			t_savings = (t_savings + m_withdraw) / (1 + (a_return2/12)) ;
		}
		System.out.print("What you need saved: " + t_savings);
			

		s_month = - PMT.pmt(a_return1/12, w_years * 12, 0, t_savings, false);
		
		System.out.println("What you need saved each month: " + s_month);

	}
}
