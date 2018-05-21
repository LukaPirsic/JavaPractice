package hr.java.vjezbe.entitet;

import java.math.BigDecimal;

public class Procesor extends Komponenta {

	private String tip, tipSucelja;
	private BigDecimal brzina;
	
			//KONSTRUKTOR
	public Procesor() {
	}
	
			//NEKAJ DA MOGU PRISTUPITI NAZ.PROIZ. IZ KOMPONENTE
	public Procesor(String nazivProizvodaca) {
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
	public void setTipSucelja (String tipSucelja) {
		this.tipSucelja = tipSucelja;
	}
	public String getTipSucelja() {
		return tipSucelja;
	}
	public void setBrzina (BigDecimal brzina) {
		this.brzina = brzina;
	}
	public BigDecimal getBrzina () {
		return brzina;
	}
	
	
}
