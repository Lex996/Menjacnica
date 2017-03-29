package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Valuta> valute;

	@Override
	public void dodajKurs(Kurs k, Valuta v) {
	
		
	}

	@Override
	public Kurs obrisiKurs(Kurs k, Valuta v) {
		
		return null;
	}

	@Override
	public Kurs nadjiKurs(GregorianCalendar datum, Valuta v) {
		
		return null;
	}
	
	
	

}
