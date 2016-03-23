package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import controller.RBFileChooser;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import model.SaveLoadData;

public class DesignController {

	// ----------------------------------------------Felder---------------------------------------------------
	@FXML Button BTN_Speichern;
	@FXML TextField TF_Quelldatei;
	@FXML TextField TF_Zieldatei;
	@FXML TextField TF_Archivordner;
	@FXML CheckBox CHB_DatenArchivieren; 
	@FXML VBox VB_Archivordner;

	// -----------------------------------------------Listener------------------------------------------------
	
	
	
	// ----------------------------------------------Funktionen-----------------------------------------------
		
	@FXML
	public void saveDataEinstellungen() throws FileNotFoundException, IOException{
		SaveLoadData saveLoadData = new SaveLoadData();
		saveLoadData.speichereDaten(TF_Quelldatei.getText(), TF_Zieldatei.getText(), TF_Archivordner.getText());
//		System.out.println(TF_Quelldatei.getText());
	}

	@FXML
	public void openFileChooserQuelldatei(){
		RBFileChooser rbFileChooser = new RBFileChooser(TF_Quelldatei, 1);
	}
	
	@FXML
	public void openFileChooserZieldatei(){
		RBFileChooser rbFileChooser = new RBFileChooser(TF_Zieldatei, 1);
	}
	
	@FXML
	public void openFileChooserArchivordner(){
		RBFileChooser rbFileChooser = new RBFileChooser(TF_Archivordner, 2);
	}
	
	@FXML
	public void setArchivordnervisible(){
		boolean aktiv = CHB_DatenArchivieren.isSelected();
		if(aktiv == false){
			VB_Archivordner.setVisible(false);
		} else {
			VB_Archivordner.setVisible(true);
		}
		}
	
}
