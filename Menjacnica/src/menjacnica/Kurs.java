package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	private GregorianCalendar datum;
	private double prodajni;
	private double kupovni;
	private double srednji;
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		this.prodajni = prodajni;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		this.srednji = srednji;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Kurs){
			Kurs k=(Kurs) obj;
			if(k.getDatum().equals(getDatum()) && k.getKupovni()==getKupovni() && k.getProdajni()==getProdajni() && k.getSrednji()==getSrednji()){
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "Kurs [datum=" + datum + ", prodajni=" + prodajni + ", kupovni=" + kupovni + ", srednji=" + srednji
				+ "]";
	}
	
	

}
