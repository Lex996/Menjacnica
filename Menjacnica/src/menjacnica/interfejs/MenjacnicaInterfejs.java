package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(Kurs k, Valuta v);
	public Kurs obrisiKurs(Kurs k, Valuta v);
	public Kurs nadjiKurs(GregorianCalendar datum, Valuta v);

}
