package hr.java.vjezbe.entitet;

import java.math.BigDecimal;

public class TvrdiDisk extends Komponenta {

	private String tip;
	private BigDecimal kapacitet;
	
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
	public void setKapacitet(BigDecimal kapacitet) {
		this.kapacitet = kapacitet;
	}
	public BigDecimal getKapacitet() {
		return kapacitet;
	}
}
