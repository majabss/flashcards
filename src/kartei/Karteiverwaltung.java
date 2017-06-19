package kartei;

import java.io.Serializable;
import java.util.ArrayList;

public class Karteiverwaltung implements Serializable {
	private Karteikasten unbewertet;
	private Karteikasten eins; // 0
	private Karteikasten zwei; // 0-15
	private Karteikasten drei; // 15-35
	private Karteikasten vier; // 35-55
	private Karteikasten fuenf; // 55-75
	private Karteikasten sechs; // 75-100

	public Karteiverwaltung() {
		unbewertet = new Karteikasten();
		eins = new Karteikasten();
		zwei = new Karteikasten();
		drei = new Karteikasten();
		vier = new Karteikasten();
		fuenf = new Karteikasten();
		sechs = new Karteikasten();
	}

	public void neueKarte(Karteikarte karte) {
		unbewertet.neueKarte(karte);
	}

	public void kartenSortieren() {
		kastenSortieren(unbewertet);
		kastenSortieren(eins);
		kastenSortieren(zwei);
		kastenSortieren(drei);
		kastenSortieren(vier);
		kastenSortieren(fuenf);
		kastenSortieren(sechs);
	}

	public void kastenSortieren(Karteikasten kasten) {
		for (int i = 0; i < kasten.getSize(); i++) {
			Karteikarte k = kasten.getKarte(i);
			if (k.hasRate()) {
				if (k.getRate() <= 1) { // 1
					eins.neueKarte(k);
					kasten.loescheKarte(i);
				} else if (k.getRate() <= 16) { // 2
					zwei.neueKarte(k);
					kasten.loescheKarte(i);
				} else if (k.getRate() <= 36) { // 3
					drei.neueKarte(k);
					kasten.loescheKarte(i);
				} else if (k.getRate() <= 56) { // 4
					vier.neueKarte(k);
					kasten.loescheKarte(i);
				} else if (k.getRate() <= 76) { // 5
					fuenf.neueKarte(k);
					kasten.loescheKarte(i);
				} else {						// 6
					sechs.neueKarte(k);
					kasten.loescheKarte(i);
				}
			} else {	// unbewertet
				unbewertet.neueKarte(k);
				kasten.loescheKarte(i);
			}
		}
	}

}
