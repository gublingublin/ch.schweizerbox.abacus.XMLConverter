package testpackage;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class JAXB {
	
	// ----------------------------------------------Felder---------------------------------------------------


	
	
	// ----------------------------------------------Konstruktor----------------------------------------------

	
	
	
	// ----------------------------------------------Funktionen-----------------------------------------------
	/** Erzeugt ein XML File mit der übergebenen Klasse und speichert es im Sourcepfad
	 * @param terminkalender
	 * @throws JAXBException
	 */
	public void erstelleXML(Terminkalender terminkalender) throws JAXBException{
		// Hier wird das File gespeichert:
		File output = new File(".\\Testfile.xml");
		// Hier die Klassen angeben die im XML enthalten sein sollen:
		JAXBContext jaxbContext = JAXBContext.newInstance(Terminkalender.class, Termin.class, Besitzer.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(terminkalender, output);
	}
	
	/** liest eine XML-Datei ein und übergibt die Daten an die vorbereitete Klasse.
	 * @param inputFile: die XML Datei, die eingelsen werden soll.
	 * @throws JAXBException
	 */
//	public void leseXML(File inputFile) throws JAXBException{
//		// Welche Klassen sollen mit Daten aus dem XML abgefüllt werden?
//		JAXBContext jaxbContext = JAXBContext.newInstance(Terminkalender.class, Termin.class, Besitzer.class);
//		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//		Terminkalender terminkalender = (Terminkalender)jaxbUnmarshaller.unmarshal(inputFile);
//	}
		
	//----------------------------------------------Getter- / Setter------------------------------------------
	
	
	
}
