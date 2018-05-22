package hr.java.vjezbe.glavna;

import java.util.Scanner;

import hr.java.vjezbe.entitet.Racunalo;

public class Glavna {

	public static void main(String[] args) {

		Racunalo racunalo = new Racunalo();

		Racunalo racunala[] = new Racunalo[2];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < racunala.length; i++) {

			racunala[i] = new Racunalo();

			System.out.println(String.format("Unesi podatke %d. racunala:", i + 1));

			System.out.print("Unesi proizvodaca maticne ploce: ");
			racunala[i].getMaticnaPloca().setNazivProizvodaca(scanner.nextLine());
			System.out.print("Unesi tip maticne ploce: ");
			racunala[i].getMaticnaPloca().setTip(scanner.nextLine());
			System.out.print("Unesi proizvodaca procesora: ");
			racunala[i].getProcesor().setNazivProizvodaca(scanner.nextLine());
			System.out.print("Unesi tip procesora: ");
			racunala[i].getProcesor().setTip(scanner.nextLine());
			// PETLJA KOJA VRACA NA POCEKAT AKO NIJE BROJ ODABRAN IZMEDU 1 - 4
			int temp = 6;
			while (temp < 1 || temp > 4) {
				System.out.println("Unesi tip sucelja procesora (odaberite broj ispred zeljenog sucelja): ");
				System.out.println("1) " + racunalo.getProcesor().SOCKET_AM2);
				System.out.println("2) " + racunalo.getProcesor().SOCKET_AM3);
				System.out.println("3) " + racunalo.getProcesor().LGA_1151);
				System.out.println("4) " + racunalo.getProcesor().SOCKET_G3);
				temp = scanner.nextInt();

				if (temp > 0 && temp < 5) {

					switch (temp) {
					case 1:
						racunala[i].getProcesor().setTipSucelja(racunalo.getProcesor().SOCKET_AM2);
						break;
					case 2:
						racunala[i].getProcesor().setTipSucelja(racunalo.getProcesor().SOCKET_AM3);
						break;
					case 3:
						racunala[i].getProcesor().setTipSucelja(racunalo.getProcesor().LGA_1151);
						break;
					case 4:
						racunala[i].getProcesor().setTipSucelja(racunalo.getProcesor().SOCKET_G3);
						break;
					}
				} else {
					System.out.println("Pogreska kod odabira, molim pokusajte ponovno!");
				}
			}

			System.out.print("Unesi brzinu procesora (u GHz): ");
			racunala[i].getProcesor().setBrzina(scanner.nextBigDecimal());
			scanner.nextLine();
			System.out.print("Unesi proizvodaca radne memorije: ");
			racunala[i].getRadnaMemorija().setNazivProizvodaca(scanner.nextLine());
			System.out.print("Unesi tip radne memorije: ");
			racunala[i].getRadnaMemorija().setTip(scanner.nextLine());
			System.out.print("Unesi kapacitet radne memorije: ");
			racunala[i].getRadnaMemorija().setKapacitet(scanner.nextInt());
			scanner.nextLine();
			System.out.print("Unesi proizvodaca tvrdog diska: ");
			racunala[i].getTvrdiDisk().setNazivProizvodaca(scanner.nextLine());
			System.out.print("Unesi tip tvrdog diska: ");
			racunala[i].getTvrdiDisk().setTip(scanner.nextLine());
			System.out.print("Unesi kapacitet tvrdog diska (u TB): ");
			racunala[i].getTvrdiDisk().setKapacitet(scanner.nextInt());
			scanner.nextLine();

		}

		for (int i = 0; i < racunala.length; i++) {

			System.out.println("Proizvodac maticne ploce: " + racunala[i].getMaticnaPloca().getNazivProizvodaca());
			System.out.println("Tip maticne ploce: " + racunala[i].getMaticnaPloca().getTip());
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

		}
	}
}
