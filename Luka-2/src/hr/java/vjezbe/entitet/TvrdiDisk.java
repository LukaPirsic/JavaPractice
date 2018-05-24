package hr.java.vjezbe.entitet;

import java.math.BigDecimal;
import java.util.Scanner;

public class TvrdiDisk extends Komponenta {

	private String tip;
	private int kapacitet;

	// KONSTRUKTOR
	public TvrdiDisk() {
	}

	// NEKAJ DA MOGU PRISTUPITI NAZ.PROIZ. IZ KOMPONENTE
	public TvrdiDisk(String nazivProizvodac) {
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

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}

	public int getKapacitet() {
		return Memorijska.pretvoriUTB(kapacitet);
	}

	// METODA ZA UNOS KONFIGURACIJE
	public static TvrdiDisk fromUserInput(Scanner scanner) {

		TvrdiDisk tvrdiDisk = new TvrdiDisk();

		System.out.print("Unesi proizvodaca tvrdog diska: ");
		tvrdiDisk.setNazivProizvodaca(scanner.nextLine());
		System.out.print("Unesi tip tvrdog diska: ");
		tvrdiDisk.setTip(scanner.nextLine());
		System.out.print("Unesi kapacitet tvrdog diska (u TB): ");
		tvrdiDisk.setKapacitet(scanner.nextInt());
		scanner.nextLine();

		return tvrdiDisk;
	}

	// METODA ZA ISPIS KONFIGURACIJE
	public String toString() {
		return "Naziv proizvodaca tvrdog diska: " + nazivProizvodaca + "\n" + "Tip tvrdog diska: " + tip + "\n"
				+ "Kapacitet tvrdog diska: " + kapacitet;
	}

	/*
	 * @Override public void uvecajKapacitet(int zadaniFaktor) { zadaniFaktor =
	 * getKapacitet() * 2; }
	 */
}
