package menjacnica;

import java.util.LinkedList;

public class Valuta {
	
	private String naziv;
	private String skraceniNaziv;
	private LinkedList<Kurs> kursevi;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv!=null && naziv!="")
		this.naziv = naziv;
		else throw new RuntimeException("Naziv ne moze biti prazan");
	}
	public String getSkraceniNaziv() {
		
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv!=null && skraceniNaziv!="" )
		this.skraceniNaziv = skraceniNaziv;
		else throw new RuntimeException("Skraceni naziv ne moze biti prazan");
		
	}
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(LinkedList<Kurs> kursevi) {
		this.kursevi = kursevi;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Valuta){
			Valuta v= (Valuta) obj;
			if(v.getNaziv().equals(getNaziv()) && v.getSkraceniNaziv().equals(getSkraceniNaziv())){
				return true;
			}
			
		}
		return false;
	}
	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", kursevi=" + kursevi + "]";
	}
	
	

}
