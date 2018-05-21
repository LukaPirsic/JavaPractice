package hr.java.vjezbe.entitet;

public class MaticnaPloca extends Komponenta {
	
	private String tip;
	
			//KONSTRUKTOR
	public MaticnaPloca() {
	}
	
			//NEKAJ DA MOGU PRISTUPITI NAZ.PROIZ. IZ KOMPONENTE
	public MaticnaPloca(String nazivProizvodaca) {
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
	
}
