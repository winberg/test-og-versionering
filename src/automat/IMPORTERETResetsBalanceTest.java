package automat;
import automat.BenytBilletautomat;
public class IMPORTERETResetsBalanceTest {
	public static void main(String[] args) 
	{
		Billetautomat automat = new Billetautomat();
		
		int errors = 0;
		
		System.out.println("Checking if the balance is reset when the ticket machine is reset.");
		System.out.println("Adding 20 kr to the machine..");
		
		automat.indsætPenge(20);
		
		System.out.println("Enabling 'MontÃ¸r tilstand' to reset the machine");
		
		automat.montørLogin("1234");
		automat.nulstil();
		
		if(automat.getBalance() != 0) {
			System.out.println("Error! The balance wasn't reset");
			errors++;
		}

		if(errors > 0) {
			System.out.println("There are errors, damn!");
		}else{
			System.out.println("There are no errors, yay!");
		}
		
	}

}

