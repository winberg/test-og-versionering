package automat;

public class IMPORTERETManSkalLoggeIndForAtAendreBilletprisen {
	public static void main(String[] arg) {
		java.util.Scanner tastatur = new java.util.Scanner(System.in);
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;

		automat.setBilletpris(20);
		retur = automat.getBilletpris();
		if (retur == 20){
			System.out.println("Billetprisen skulle ikke kunne Ã¦ndres, hvis man ikke er logget ind. Prisen skulle derfor vÃ¦re 10, men er: " + retur);
			antalFejl++;
		}
		
		System.out.println("Der blev fundet " + antalFejl + " fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, Ã˜V!!!");
		}

	}
}