package automat;

public class IMPORTERETTjekMontørTilstand
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;
		
		System.out.println("*** Tjek af, at brugere ikke kan bruge montÃ¸rfunktionen");
		
		// Vi benytter automat.setBilletpris(20) for at Ã¦ndre prisen pÃ¥ billet til 20 kr. gennem automaten.
		automat.setBilletpris(20);
		
		// Nu ber vi systemet om at hente billetprisen fra automaten. Hvis denne er forskellig fra 10 er der en rejl.
		// Fejlen ligger i at du kan Ã¦ndre billetprisen uden at vÃ¦re logget ind som montÃ¸r.
		retur = automat.getBilletpris();
		if (retur != 10) {
			System.out.println("FEJL, GetBilletPris() skulle give 10, men den gav: "+retur);
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