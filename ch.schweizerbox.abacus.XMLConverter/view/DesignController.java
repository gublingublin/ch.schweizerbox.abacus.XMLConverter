package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import controller.RBFileChooser;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import model.SaveLoadData;

public class DesignController {

	// ----------------------------------------------Felder---------------------------------------------------
	@FXML private Button BTN_Speichern;
	@FXML private TextField TF_Quelldatei;
	@FXML private TextField TF_Zieldatei;
	@FXML private TextField TF_Archivordner;
	@FXML private CheckBox CHB_DatenArchivieren; 
	@FXML private VBox VB_Archivordner;

	
	// -----------------------------------------------Listener------------------------------------------------
	
	
	
	// ----------------------------------------------Funktionen-----------------------------------------------
		
	@FXML
	public void test(){
		System.out.println("loooooos");
	}
	
	
	@FXML
	public void saveDataEinstellungen() throws FileNotFoundException, IOException{
		SaveLoadData saveLoadData = new SaveLoadData();
		saveLoadData.speichereDaten(TF_Quelldatei.getText(), TF_Zieldatei.getText(), TF_Archivordner.getText());
		JOptionPane.showMessageDialog(null, "Die Daten wurden gespeichert.");
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
