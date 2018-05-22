package hr.java.vjezbe.entitet;


public class TvrdiDisk extends Komponenta  {

	private String tip;
	private int kapacitet;
	
			//KONSTRUKTOR
	public TvrdiDisk() {
	}
	
			//NEKAJ DA MOGU PRISTUPITI NAZ.PROIZ. IZ KOMPONENTE
	public TvrdiDisk(String nazivProizvodac) {
		super();
	}
	
			//GET I SET METODE
	public void setNazivProizvodaca(String nazivProizvodaca) {
		this.nazivProizvodaca = nazivProizvodaca;
	}
	public String getNazivProizvodaca() {
		return nazivProizvodaca;
	}
	public void setTip (String tip) {
		this.tip = tip;
	}
	public String getTip () {
		return tip;
	}
	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}
	public int getKapacitet() {
		return Memorijska.pretvoriUTB(kapacitet);
	}
	/*
	@Override
	public void uvecajKapacitet(int zadaniFaktor) {
		zadaniFaktor = getKapacitet() * 2;
	}
	*/
}
