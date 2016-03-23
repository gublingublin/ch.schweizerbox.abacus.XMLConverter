package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import javafx.scene.chart.PieChart.Data;

public class SaveLoadData {

	// ----------------------------------------------Felder---------------------------------------------------
		DataEinstellungen DataEinstellungen = new DataEinstellungen();
				
		
		
	// ----------------------------------------------Konstruktor----------------------------------------------
		
		
		
		
		
	// ----------------------------------------------Funktionen-----------------------------------------------
	/**speichert die Daten in das File DataEinstellungen.data. Beim Konstruktor soll angegeben werden, welche
	 * Daten benötigt werden.
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void speichereDaten(String quellDatei, String zielDatei, String archivOrdner) throws FileNotFoundException, IOException{
		DataEinstellungen.setQuellDatei(quellDatei);
//		System.out.println(DataEinstellungen.getQuellDatei());
		DataEinstellungen.setZielDatei(zielDatei);
		DataEinstellungen.setArchivOrdner(archivOrdner);
		try(
				OutputStream dateiSchreiber = new FileOutputStream("DataEinstellungen.data");
				ObjectOutputStream objektSchreiber = new ObjectOutputStream(dateiSchreiber)
			) {
				objektSchreiber.writeObject(DataEinstellungen);
				objektSchreiber.flush();
//				System.out.println("Daten gespeichert!");
			}
	}
		
	
	
	/**
	 * @return Liest die Daten aus der Datei Data.data und gibt Sie als Objekt Data zurück.
	 * Die Einzelnen Felder können dann so angesprochen werden.
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public DataEinstellungen leseDaten() throws FileNotFoundException, IOException, ClassNotFoundException{
		try(
				InputStream dateiLeser = new FileInputStream("DataEinstellungen.data");
				ObjectInputStream objektLeser = new ObjectInputStream(dateiLeser)
				) {
				DataEinstellungen geleseneDaten = (DataEinstellungen) objektLeser.readObject();
//				System.out.println(geleseneDaten.getFeld1());
				return geleseneDaten;
			} 
	}
	
		
	//----------------------------------------------Getter- / Setter------------------------------------------
		
	
}
