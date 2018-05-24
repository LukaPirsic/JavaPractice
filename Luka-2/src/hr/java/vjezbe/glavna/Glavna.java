package hr.java.vjezbe.glavna;

import java.util.Scanner;

import hr.java.vjezbe.entitet.Ferkvencija;
import hr.java.vjezbe.entitet.Memorijska;
import hr.java.vjezbe.entitet.Racunalo;
import hr.java.vjezbe.entitet.RadnaMemorija;

public class Glavna {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//Racunalo racunalo = new Racunalo();
		RadnaMemorija radnaMemorija = new RadnaMemorija();
		Racunalo racunala[] = new Racunalo[2];
				
				//UNOS KONFIGURACIJE
		for (int i = 0; i < racunala.length; i++) {

			racunala[i] = new Racunalo();
				
			System.out.println(String.format("Unesi podatke %d. racunala:", i + 1));
			racunala[i] = Racunalo.fromUserInput(scanner);

		}
			//ISPIS KONFIGURACIJE
		for (int i = 0; i < racunala.length; i++) {

			System.out.println(String.format("%d. racunalo", i + 1));
			System.out.println("------------");
			System.out.println(racunala[i].toString());
		}

		// TRAŽENJE KOJE RACUNALO IMA MANJE RADNE MEMORIJE
		if (racunala[0].getRadnaMemorija().getKapacitet() < racunala[1].getRadnaMemorija().getKapacitet()) {
			
			// OVO MI NE RADI ONO KAJ BI TREBALO 
			radnaMemorija.uvecajKapacitet(racunala[0].getRadnaMemorija().getKapacitet());
			{
				System.out.println(racunala[0].getRadnaMemorija().getKapacitet());
			}
		} else if (racunala[0].getRadnaMemorija().getKapacitet() > racunala[1].getRadnaMemorija().getKapacitet()) {
			radnaMemorija.uvecajKapacitet(racunala[1].getRadnaMemorija().getKapacitet());
			{
				System.out.println(racunala[0].getRadnaMemorija().getKapacitet());
			}
		}
		/*
		 * //TRAZENJE KOJE RACUNALO IMA BRZI PROCESOR
		 * if(racunala[0].getProcesor().getBrzina().compareTo(racunala[1].getProcesor().
		 * getBrzina())>0){
		 * 
		 * 
		 * System.out.print("a"); }else { System.out.print("b"); }
		 */

	}

}
