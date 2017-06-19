package kartei;

import java.io.Serializable;
import java.util.ArrayList;

public class Karteikasten implements Serializable {
	private ArrayList<Karteikarte> kasten;
	
	public Karteikasten() {
		kasten = new ArrayList<Karteikarte>();
	}
	
	public Karteikasten(Karteikarte karte) {
		this();
		neueKarte(karte);
	}
	
	public Karteikasten(ArrayList<Karteikarte> kasten) {
		this.kasten = kasten;
	}
	

	public Karteikarte getKarte(int index) {
		return kasten.get(index);
	}
	
	public int getSize() {
		return kasten.size();
	}

	public void neueKarte(Karteikarte karte) {
		kasten.add(karte);
	}
	
	public void loescheKarte(String begriff) {
		for (int i = 0; i < kasten.size(); i++) {
			if (kasten.get(i).getBegriff().compareTo(begriff) == 0) {
				kasten.remove(i);
			}
		}
	}
	
	public void loescheKarte(int index) {
		kasten.remove(index);
	}
	
}
