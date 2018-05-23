package hr.java.vjezbe.entitet;

import java.util.Scanner;

public class Racunalo {

	MaticnaPloca maticnaPloca = new MaticnaPloca();
	Procesor procesor = new Procesor();
	RadnaMemorija radnaMemorija = new RadnaMemorija();
	TvrdiDisk tvrdiDisk = new TvrdiDisk();
		
	public Racunalo() {		
	}
	
	public void setMaticnaPloca(MaticnaPloca maticnaPloca) {
		this.maticnaPloca = maticnaPloca;
	}
	public MaticnaPloca getMaticnaPloca () {
		return maticnaPloca;
	}
	public void setProcesor(Procesor procesor) {
		this.procesor = procesor;
	}
	public Procesor getProcesor() {
		return procesor;
	}
	public void setRadnaMemorija (RadnaMemorija radnaMemorija) {
		this.radnaMemorija = radnaMemorija;
	}
	public RadnaMemorija getRadnaMemorija () {
		return radnaMemorija;
	}
	public void setTvrdiDisk (TvrdiDisk tvrdiDisk) {
		this.tvrdiDisk = tvrdiDisk;
	}
	public TvrdiDisk getTvrdiDisk() {
		return tvrdiDisk;
	}
/*	
			//METODA ZA UNOS KONFIGURACIJE
	public static Racunalo fromUserInput(Scanner scanner) {
		
		Racunalo racunalo = new Racunalo ();
		
		racunalo.getMaticnaPloca().fromUserInput(scanner);
		racunalo.getProcesor().fromUserInput(scanner);
		racunalo.getRadnaMemorija().fromUserInput(scanner);
		racunalo.getTvrdiDisk().fromUserInput(scanner);
				
		return racunalo;
	}
*/	
	
	public static Racunalo fromUserInput(Scanner scanner) {
		Racunalo racunalo = new Racunalo();
		
		racunalo.getMaticnaPloca().fromUserInput(scanner);
		racunalo.getProcesor().fromUserInput(scanner);
		racunalo.getRadnaMemorija().fromUserInput(scanner);
		racunalo.getTvrdiDisk().fromUserInput(scanner);

		return racunalo;
	}
}
