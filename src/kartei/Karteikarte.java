package kartei;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

public class Karteikarte implements Serializable {
	private String begriff;
	private String definition;
	private int anzFalsch;
	private int anzRichtig;
	private ArrayList<Karteikarte> verlinkungen;
	
	public Karteikarte() {
		verlinkungen = new ArrayList<Karteikarte>();
	}
	
	public Karteikarte(String begriff, String definition) {
		this();
		setBegriff(begriff);
		setDefinition(definition);
	}
	
	public Karteikarte(String begriff, String definition, Karteikarte verlinkung) {
		this(begriff, definition);
		neueVerlinkung(verlinkung);
	}
	
	public Karteikarte(String begriff, String definition, ArrayList<Karteikarte> verlinkungen) {
		this(begriff, definition);
		this.verlinkungen = verlinkungen;
	}
	
	
	public String getBegriff() {
		return begriff;
	}

	public void setBegriff(String begriff) {
		if (begriff != null && begriff != "")
			this.begriff = begriff;
		else 
			throw new IllegalArgumentException("Begriff darf nicht leer sein");
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		if (begriff != null && begriff != "")
			this.definition = definition;
		else 
			throw new IllegalArgumentException("Definition darf nicht leer sein");
	}
	
	public boolean hasRate() {
		return anzRichtig > 0 || anzFalsch > 0;
	}
	
	public float getRate() {
		return (float)anzFalsch / ((float)anzRichtig + (float)anzFalsch) * 100;
	}
	

	public void neueVerlinkung(Karteikarte karte) {
		verlinkungen.add(karte);
		verlinkungen.sort(new Comparator<Karteikarte>() {

			@Override
			public int compare(Karteikarte o1, Karteikarte o2) {
				return o1.begriff.compareTo(o2.begriff);
			}
			
		});
	}
	
	public void falsch() {
		anzFalsch++;
	}
	
	public void richtig() {
		anzRichtig++;
	}
}
