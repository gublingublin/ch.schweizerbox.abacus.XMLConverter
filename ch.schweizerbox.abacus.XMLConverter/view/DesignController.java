package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSeparatorUI;

import controller.Listener;
import controller.RBFileChooser;
import javafx.beans.InvalidationListener;
import javafx.beans.WeakInvalidationListener;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import model.SaveLoadData;

public class DesignController {

	// ----------------------------------------------Felder---------------------------------------------------
	@FXML private Button BTN_Speichern;
	@FXML private Button BTN_Testbutton;
	@FXML private TextField TF_Quelldatei;
	@FXML private TextField TF_Zieldatei;
	@FXML private TextField TF_Archivordner;
	@FXML private CheckBox CHB_DatenArchivieren; 
	@FXML private VBox VB_Archivordner;
	

	
	// -----------------------------------------------Listener------------------------------------------------
	
	public void listener(){
		
	
	InvalidationListener iv = (evt) -> {
		if(!TF_Quelldatei.isFocused()){
			System.out.println("testfocus");
		}
	};
	System.out.println("focus läuft");
	TF_Quelldatei.focusedProperty().addListener(
			new WeakInvalidationListener(iv)
			);
	
	
	}
	
//	Listener listener = new Listener();
//	public void startListener(){
//		listener.listener();
//	}
	
	
	// ----------------------------------------------Funktionen-----------------------------------------------

	
	
	public void test(){
		System.out.println("test...");
	}
	
	
	public void saveDataEinstellungen() throws FileNotFoundException, IOException{
		SaveLoadData saveLoadData = new SaveLoadData();
		saveLoadData.speichereDaten(TF_Quelldatei.getText(), TF_Zieldatei.getText(), TF_Archivordner.getText());
		JOptionPane.showMessageDialog(null, "Die Daten wurden gespeichert.");
//		System.out.println(TF_Quelldatei.getText());
	}

	
	public void openFileChooserQuelldatei(){
		RBFileChooser rbFileChooser = new RBFileChooser(TF_Quelldatei, 1);
	}
	
	
	public void openFileChooserZieldatei(){
		RBFileChooser rbFileChooser = new RBFileChooser(TF_Zieldatei, 3);
	}
	
	
	public void openFileChooserArchivordner(){
		RBFileChooser rbFileChooser = new RBFileChooser(TF_Archivordner, 2);
	}
	
	
	public void setArchivordnervisible(){
		boolean aktiv = CHB_DatenArchivieren.isSelected();
		if(aktiv == false){
			VB_Archivordner.setVisible(false);
		} else {
			VB_Archivordner.setVisible(true);
		}
		}

	// ----------------------------------------------getter/setter---------------------------------------------------
	
	public TextField getTF_Quelldatei() {
		return TF_Quelldatei;
	}

	public void setTF_Quelldatei(TextField tF_Quelldatei) {
		TF_Quelldatei = tF_Quelldatei;
	}


	
	
}
