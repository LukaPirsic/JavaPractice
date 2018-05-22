package hr.java.vjezbe.entitet;


public interface Memorijska {

	public void uvecajKapacitet (int kapacitet);
	
	public static int pretvoriUTB (int kapacitet) {
		return kapacitet / 1024;
	}
	
}
