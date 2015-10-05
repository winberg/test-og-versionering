package automat;

public class IMPORTERETTjekMontorFkt
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;
		
		retur = automat.getBilletpris();
		if (retur != 10) {
			System.out.println("FEJL, getBilletpris() != 10");
		}

		System.out.println("*** Tjek af salg af en billet");
		automat.indsætPenge(10);
		automat.udskrivBillet();
		retur = automat.returpenge();
		if (retur != 0) {
			System.out.println("FEJL, returpenge() skulle give 0, men den gav: "+retur);
			antalFejl = antalFejl + 1;
		}

		System.out.println("*** Tjek af, at penge kan komme retur");
		automat.indsætPenge(100);
		automat.udskrivBillet();
		retur = automat.returpenge();
		if (retur != 90) {
			System.out.println("FEJL, returpenge() skulle give 90, men den gav: "+retur);
			antalFejl = antalFejl + 1;
		}
		
		System.out.println("*** Tjek af, at brugere ikke kan bruge montÃ¸rfunktionen");
		retur = automat.getAntalBilletterSolgt();
		if (retur != 0) {
			System.out.println("FEJL, AntalBilletterSolgt() skulle give 0, men den gav: "+retur);
			antalFejl = antalFejl + 1;
		}
		
		System.out.println("*** Tjek af, at kun den korrekte montÃ¸rkode fungerer");
		automat.montørLogin("6789");	
		retur = automat.getAntalBilletterSolgt();
		if (retur != 0) {
			System.out.println("FEJL, AntalBilletterSolgt() skulle give 0, men den gav: "+retur);
			antalFejl = antalFejl + 1;
		}

		System.out.println("*** Tjek af, at montÃ¸ren kan se hvor mange billetter der er solgt");
		automat.montørLogin("1234");
		retur = automat.getAntalBilletterSolgt();
		if (retur != 2) {
			System.out.println("FEJL, AntalBilletterSolgt() skulle give 2, men den gav: "+retur);
			antalFejl = antalFejl + 1;
		}

		System.out.println("*** Tjek af andre billetpriser");
		automat.setBilletpris(20);
		automat.indsætPenge(100);
		automat.udskrivBillet();
		retur = automat.returpenge();
		if (retur != 80) {
			System.out.println("FEJL, returpenge() skulle give 80, men den gav: "+retur);
			antalFejl = antalFejl + 1;
		}
		retur = automat.getAntalBilletterSolgt();
		if (retur != 3) {
			System.out.println("FEJL, AntalBilletterSolgt() skulle give 3, men den gav: "+retur);
			antalFejl = antalFejl + 1;
		}
		
		System.out.println("*** Tjek af, at det kun er montÃ¸ren der kan bruge montÃ¸rfunktionerne");
		automat.setBilletpris(2);
		if (automat.getBilletpris() == 2) {
			System.out.println("FEJL, det skal ikke vÃ¦re muligt at Ã¦ndre prisen uden at vÃ¦re logget ind");
			antalFejl = antalFejl + 1;
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Der blev fundet "+antalFejl+" fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, Ã˜V!!!");			
		}
	}
}