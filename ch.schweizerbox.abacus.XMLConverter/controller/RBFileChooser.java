package controller;

import java.io.File;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class RBFileChooser{

	
// ----------------------------------------------Konstruktoren----------------------------------------------
	/** Zeigt einen FileChooser an in welchem Files oder Ordner ausgewählt werden können.
	 * @param Eingabefeld = Wo soll der Pfad hingeschrieben werden?
	 * @param FileChooserTyp: 
	 * 			1: Auswahl einer Datei
	 * 			2: Auswahl eines Ordners
	 */
	public RBFileChooser(TextField Eingabefeld, int FileChooserTyp){
		switch (FileChooserTyp) {
		case 1:
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Öffne Datei");
			fileChooser.getExtensionFilters().addAll(
					 new ExtensionFilter("Alle Dateien", "*.*"),
					 new ExtensionFilter("Text Dateien", "*.txt"),
			         new ExtensionFilter("Bilddateien", "*.png", "*.jpg", "*.gif"),
			         new ExtensionFilter("Audiodateien", "*.wav", "*.mp3", "*.aac"));
			 File selectedFile = fileChooser.showOpenDialog(null);
			 if (selectedFile != null) {
			 Eingabefeld.setText(selectedFile.getAbsolutePath());
			 }
		break;
		
		case 2:
			DirectoryChooser directoryChooser = new DirectoryChooser();
			directoryChooser.setTitle("Speicherpfad auswählen");
			File selectedDirectory = directoryChooser.showDialog(null);
			if(selectedDirectory != null){
			Eingabefeld.setText(selectedDirectory.getAbsolutePath());
			}
			break;
		
		default:
			System.out.println("Es wurde kein FileChooserTyp ausgewählt. Bitte Angaben machen!");
			break;
		}
		
		}
	
}