/// Lab 01: CoinCounter
/// Kameron Ibraheem
/// 
/// None
import java.util.Scanner;

public class CoinCounter{
	public static void main(String [] args){
		Scanner scrn = new Scanner(System.in);
		
		System.out.print("Enter # of Quarters: ");
		int q = scrn.nextInt();
		double qt = q * 00.25;

		System.out.print("Enter # of Dimes: ");
		int d = scrn.nextInt();
		double dt = d * 00.10;

		System.out.print("Enter # of Nickels: ");
		int n = scrn.nextInt();
		double nt = n * 00.05;

		System.out.print("Enter # of Pennies: ");
		int p = scrn.nextInt();
		double pt = p * 00.01;

		double total = qt + dt + nt + pt;
		
		System.out.println(q + " Quarters = $" + qt);
		System.out.println(d + " Dimes = $" + dt);
		System.out.println(n + " Nickels = $" + nt);
		System.out.println(p + " Pennies = $" + pt);
		System.out.println("Total = $" + total);

	}
}
