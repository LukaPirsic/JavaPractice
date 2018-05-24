package hr.java.vjezbe.entitet;

import java.util.Scanner;

public class RadnaMemorija extends Komponenta implements Memorijska {

	private String tip;
	private int kapacitet;
	
			//KONSTRUKTOR
	public RadnaMemorija() {
	}
	
			//NEKAJ DA MOGU PRISTUPITI NAZ.PROIZ. IZ KOMPONENTE
	public RadnaMemorija(String nazivProizvodaca) {
		super();
	}
	
			//GET I SET METODE
	public void setNazivProizvodaca(String nazivProizvodaca) {
		this.nazivProizvodaca = nazivProizvodaca;
	}
	public String getNazivProizvodaca() {
		return nazivProizvodaca;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getTip() {
		return tip;
	}
	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
		
	}
	public int getKapacitet() {
		return kapacitet;
	}
	
			//METODA ZA UNOS KONFIGURACIJE
	public static RadnaMemorija fromUserInput(Scanner scanner) {
		
		RadnaMemorija radnaMemorija = new RadnaMemorija();
		
		System.out.print("Unesi proizvodaca radne memorija: ");
		radnaMemorija.setNazivProizvodaca(scanner.nextLine());
		System.out.print("Unesi tip rande memorije: ");
		radnaMemorija.setTip(scanner.nextLine());
		System.out.print("Unesi kapacitet radne memorije: ");
		radnaMemorija.setKapacitet(scanner.nextInt());
		scanner.nextLine();
		
		return radnaMemorija;
	}
	
			//METODA ZA ISPIS KONFIGURACIJE
	public String toString() {
		return "Naziv proizvodaca radne memorije: " + nazivProizvodaca + "\n" + "Tip radne memorije: " + tip + "\n" + "Kapacitet radne memorije: " + kapacitet;
	}

	public void uvecajKapacitet(int kapacitet) {
		this.kapacitet = kapacitet * 2;
	}
	
}



