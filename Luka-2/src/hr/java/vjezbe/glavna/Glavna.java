package hr.java.vjezbe.glavna;

import java.util.Scanner;

import hr.java.vjezbe.entitet.Racunalo;

public class Glavna {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Racunalo racunalo = new Racunalo();
		Racunalo racunala[] = new Racunalo[2];

		for (int i = 0; i < racunala.length; i++) {

			racunala[i] = new Racunalo();

			System.out.println(String.format("Unesi podatke %d. racunala:", i + 1));

			//ovo upise kak spada
			racunala[i].getMaticnaPloca().setNazivProizvodaca(scanner.nextLine());
			//ovo ne upiše kak se spada nego mi vraca "null"
			racunala[i].fromUserInput(scanner);
			
			/*racunalo.getProcesor().fromUserInput(scanner);
			racunalo.getRadnaMemorija().fromUserInput(scanner);
			racunalo.getTvrdiDisk().fromUserInput(scanner);
			
			
			/*
			racunala[i].fromUserInput(scanner);
			*/
		}

		for (int i = 0; i < racunala.length; i++) {
			
			System.out.println("Proizvodac maticne ploce: " + racunala[i].getMaticnaPloca().getNazivProizvodaca());
			System.out.println("Tip maticne ploce: " + racunala[i].getMaticnaPloca().getTip());
			/*
			System.out.println("Proizvodac procesora: " + racunala[i].getProcesor().getNazivProizvodaca());
			System.out.println("Tip procesora: " + racunala[i].getProcesor().getTip());
			System.out.println("Tip sucelja procesora: " + racunala[i].getProcesor().getTipSucelja());
			System.out.println("Brzina procesora: " + racunala[i].getProcesor().getBrzina());
			System.out.println("Proizvodac radne memorije: " + racunala[i].getRadnaMemorija().getNazivProizvodaca());
			System.out.println("Tip radne memorije: " + racunala[i].getRadnaMemorija().getTip());
			System.out.println("Kapacitet radne memorije: " + racunala[i].getRadnaMemorija().getKapacitet());
			System.out.println("Proizvodac tvrdog diska: " + racunala[i].getTvrdiDisk().getNazivProizvodaca());
			System.out.println("Tip tvrdog diska: " + racunala[i].getTvrdiDisk().getTip());
			System.out.println("Kapacitet tvrdog diska: " + racunala[i].getTvrdiDisk().getKapacitet());
			*/
		}
	}
}
