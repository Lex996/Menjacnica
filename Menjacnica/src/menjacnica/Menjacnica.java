package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> valute;

	@Override
	public void dodajKurs(Kurs k, Valuta v) {
		for (Valuta valuta : valute) {
			if (valuta.equals(v)) {
				v.getKursevi().add(k);
				return;
			}
		}

	}

	@Override
	public Kurs obrisiKurs(Kurs k, Valuta v) {
		for (Valuta valuta : valute) {
			if (valuta.equals(v)) {
				for (Kurs kurs : v.getKursevi()) {
					if (kurs.equals(k))
					v.getKursevi().remove(kurs);
				}

			}
		}

		return k;
	}

	@Override
	public Kurs nadjiKurs(GregorianCalendar datum, Valuta v) {
		for (Valuta valuta : valute) {
			if (valuta.equals(v)) {

				for (Kurs kurs : v.getKursevi()) {
					if (kurs.getDatum().equals(datum))
						return kurs;
					
				}

			}
		}

		return null;
	}

}
