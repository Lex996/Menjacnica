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
		if(datum.after(new GregorianCalendar()))
		this.datum = datum;
		else throw new RuntimeException("Ne moze se menjati kurs za datum koji je prosao!");
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if(prodajni>0)
		this.prodajni = prodajni;
		else throw new RuntimeException("Prodajni kurs mora biti veci od 0!");
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if(kupovni>0)
		this.kupovni = kupovni;
		else throw new RuntimeException("Kupovni kurs mora biti veci od 0!");
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if(srednji>0)
		this.srednji = srednji;
		else throw new RuntimeException("Srednji kurs mora biti veci od 0!");
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
			if(k.getDatum().YEAR==getDatum().YEAR && k.getDatum().MONTH==getDatum().MONTH && k.getDatum().DAY_OF_MONTH==getDatum().DAY_OF_MONTH && k.getKupovni()==getKupovni() && k.getProdajni()==getProdajni() && k.getSrednji()==getSrednji()){
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
