package testpackage;

import java.util.List;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terminkalender", propOrder = {
		"besitzer",
		"termin"
})

@XmlRootElement(name = "terminkalender")
public class Terminkalender{
	
	// ----------------------------------------------Felder---------------------------------------------------
	@XmlElement(required = true)
	protected Besitzer besitzer;
	
	@XmlElement(required = true)
	protected List<Termin> termin;

	
	
	// ----------------------------------------------Konstruktor----------------------------------------------

	
	
	
	// ----------------------------------------------Funktionen-----------------------------------------------

	
	
		
	//----------------------------------------------Getter- / Setter------------------------------------------
	protected Besitzer getBesitzer() {
		return besitzer;
	}
	public void setBesitzer(Besitzer besitzer) {
		this.besitzer = besitzer;
	}
	public List<Termin> getTermin() {
		return termin;
	}
	public void setTermin(List<Termin> termin) {
		this.termin = termin;
	}
	
}
