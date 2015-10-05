package automat;

public class IMPORTERETTjekBilletautomatAendreBeloeb {
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;





		automat.udskrivBillet();
		int retur2 = automat.returpenge();
		if (retur2 < 0){
			System.out.println("Fejl. Penge retur giver et negativt belÃ¸b "+ retur2);
			antalFejl++;
		} else {
			System.out.println("Penge retur"+ retur2);
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
