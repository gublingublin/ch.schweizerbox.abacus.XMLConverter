package testpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class Main {


	public static void main(String[] args) throws JAXBException {

		// ----------------------------------------------Felder---------------------------------------------------
		Terminkalender terminkalender = new Terminkalender();
		Besitzer besitzer = new Besitzer();
		besitzer.setName("Schrödinger");
		Termin termin = new Termin();
		List<Termin> terminListe = new ArrayList<Termin>();
		
		termin.setWann("20:19");
		termin.setWas("DSDS gufffcken oder so...");
		termin.setWo("im Wohnzimmer");
		terminListe.add(termin);
		
		Termin termin2 = new Termin();
		termin2.setWas("Roland testen");
		besitzer.setName("Toland");
		termin2.setWann("kleiner test");
		termin2.setWo("hier");
		terminListe.add(termin2);
		
		terminkalender.setTermin(terminListe);
		terminkalender.setBesitzer(besitzer);
		
		JAXB jaxb = new JAXB();


			
		// ----------------------------------------------Konstruktor----------------------------------------------

		
		
		
		// ----------------------------------------------Funktionen-----------------------------------------------

		// Zum Erstellen des XML gem. den Daten von Oben:
//		jaxb.erstelleXML(terminkalender);
		
		// Zum einlesen der XML-Daten aus dem Testfile.xml:
		File inputFile = new File(".\\Testfile.xml");
		Terminkalender terminkalenderXML = new Terminkalender();
		
		terminkalenderXML = jaxb.leseXML(inputFile);
		
		// die vom XML an die Klassen übergebenen Daten können nun abgerufen werden:
		System.out.println(terminkalenderXML.getBesitzer().getName());
		System.out.println("Anzahl Termine: "+ terminkalenderXML.getTermin().size());
		System.out.println("Termin nummer 2: "+ terminkalenderXML.getTermin().get(1).getWas());
		
			
		//----------------------------------------------Getter- / Setter------------------------------------------
		
		
	}
	


	
	

	

	
	
	
	
	
	
	
	
}

