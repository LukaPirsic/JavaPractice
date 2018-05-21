package hr.java.vjezbe.glavna;

import java.util.Scanner;

import hr.java.vjezbe.entitet.MaticnaPloca;
import hr.java.vjezbe.entitet.Procesor;
import hr.java.vjezbe.entitet.Racunalo;
import hr.java.vjezbe.entitet.RadnaMemorija;
import hr.java.vjezbe.entitet.TvrdiDisk;

public class Glavna {

	public static void main(String[] args) {
		
		Racunalo racunalo = new Racunalo();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Unesi proizvodaca maticne ploce: ");
		racunalo.getMaticnaPloca().setNazivProizvodaca(scanner.nextLine());
		System.out.print("Unesi tip maticne ploce: ");
		racunalo.getMaticnaPloca().setTip(scanner.nextLine());
		
		System.out.print("Unesi proizvodaca procesora: ");
		racunalo.getProcesor().setNazivProizvodaca(scanner.nextLine());
		System.out.print("Unesi tip procesore: ");
		racunalo.getProcesor().setTip(scanner.nextLine());
		System.out.print("Unesi tip sucelja procesora: ");
		racunalo.getProcesor().setTipSucelja(scanner.nextLine());
		System.out.print("Unesi brzinu procesora (u GHz): ");
		racunalo.getProcesor().setBrzina(scanner.nextBigDecimal());
		scanner.nextLine();
		
		System.out.print("Unesi proizvodaca radne memorije: ");
		racunalo.getRadnaMemorija().setNazivProizvodaca(scanner.nextLine());
		System.out.print("Unesi tip radne memorije: ");
		racunalo.getRadnaMemorija().setTip(scanner.nextLine());
		System.out.print("Unesi kapacitet radne memorije: ");
		racunalo.getRadnaMemorija().setKapacitet(scanner.nextInt());
		scanner.nextLine();
		
		System.out.print("Unesi proizvodaca tvrdog diska: ");
		racunalo.getTvrdiDisk().setNazivProizvodaca(scanner.nextLine());
		System.out.print("Unesi tip tvrdog diska: ");
		racunalo.getTvrdiDisk().setTip(scanner.nextLine());
		System.out.print("Unesi kapacitet tvrdog diska (u TB): ");
		racunalo.getTvrdiDisk().setKapacitet(scanner.nextBigDecimal());
		
		System.out.println("Proizvodac maticne ploce: " + racunalo.getMaticnaPloca().getNazivProizvodaca());
		System.out.println("Tip maticne ploce: " + racunalo.getMaticnaPloca().getTip());
		System.out.println("Proizvodac procesora: " + racunalo.getProcesor().getNazivProizvodaca());
		System.out.println("Tip procesora: " + racunalo.getProcesor().getTip());
		System.out.println("Tip sucelja procesora: " + racunalo.getProcesor().getTipSucelja());
		System.out.println("Brzina procesora: " + racunalo.getProcesor().getBrzina());
		System.out.println("Proizvodac radne memorije: " + racunalo.getRadnaMemorija().getNazivProizvodaca());
		System.out.println("Tip radne memorije: " + racunalo.getRadnaMemorija().getTip());
		System.out.println("Kapacitet radne memorije: " + racunalo.getRadnaMemorija().getKapacitet());
		System.out.println("Proizvodac tvrdog diska: " + racunalo.getTvrdiDisk().getNazivProizvodaca());
		System.out.println("Tip tvrdog diska: " + racunalo.getTvrdiDisk().getTip());
		System.out.println("Kapacitet tvrdog diska: " + racunalo.getTvrdiDisk().getKapacitet());

	}

}
