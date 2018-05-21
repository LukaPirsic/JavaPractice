package hr.java.vjezbe.entitet;

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

	@Override
	public void uvecajKapacitet(int kapacitet) {
		// TODO Auto-generated method stub
		
	}
}



