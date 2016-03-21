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
//		besitzer.setName("Schrödinger");
		Termin termin = new Termin();
		List<Termin> terminListe = new ArrayList<Termin>();
		
//		termin.setWann("20:19");
//		termin.setWas("DSDS gufffcken oder so...");
//		termin.setWo("im Wohnzimmer");
//		terminListe.add(termin);
//		
//		Termin termin2 = new Termin();
//		termin2.setWas("Roland testen");
//		besitzer.setName("Toland");
//		termin2.setWann("kleiner test");
//		termin2.setWo("hier");
//		terminListe.add(termin2);
//		
//		terminkalender.setTermin(terminListe);
//		terminkalender.setBesitzer(besitzer);
//		
		JAXB jaxb = new JAXB();
		System.out.println("Programm Ende....");

			
		// ----------------------------------------------Konstruktor----------------------------------------------

		
		
		
		// ----------------------------------------------Funktionen-----------------------------------------------

		// Zum Erstellen des XML:
//		jaxb.erstelleXML(terminkalender);
		
		// Zum einlesen von Daten:
		File inputFile = new File(".\\Testfile.xml");
//		jaxb.leseXML(inputFile);
		JAXBContext jaxbContext = JAXBContext.newInstance(Terminkalender.class, Termin.class, Besitzer.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Terminkalender terminkalenderXML = (Terminkalender)jaxbUnmarshaller.unmarshal(inputFile);
		
		
		System.out.println(terminkalenderXML.getBesitzer().getName());
		System.out.println("Anzahl Termine: "+ terminkalenderXML.getTermin().size());
		System.out.println("Termin nummer 3: "+ terminkalenderXML.getTermin().get(2).getWas());
		
			
		//----------------------------------------------Getter- / Setter------------------------------------------
		
		
	}
	


	
	

	

	
	
	
	
	
	
	
	
}

