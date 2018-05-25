package hr.java.vjezbe.entitet;

import java.util.Scanner;

public class MaticnaPloca extends Komponenta {

	private String tip;

	// KONSTRUKTOR
	public MaticnaPloca() {
	}

	// NEKAJ DA MOGU PRISTUPITI NAZ.PROIZ. IZ KOMPONENTE
	public MaticnaPloca(String nazivProizvodaca) {
		super();
	}

	// GET I SET METODE
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

	// METODA ZA UNOS KONFIGURACIJE
	public static MaticnaPloca fromUserInput(Scanner scanner) {
		MaticnaPloca maticnaPloca = new MaticnaPloca();

		System.out.print("Unesi proizvodaca maticne ploce: ");
		maticnaPloca.setNazivProizvodaca(scanner.nextLine());
		System.out.print("Unesi tip maticne ploce: ");
		maticnaPloca.setTip(scanner.nextLine());

		return maticnaPloca;
	}

		//METODA ZA ISPIS KONFIGURACIJE
	public String toString() {
		return "Naziv proizvodaca maticne ploce: " + nazivProizvodaca + "\n" + "Tip maticne ploce: " + tip;
	}
}
