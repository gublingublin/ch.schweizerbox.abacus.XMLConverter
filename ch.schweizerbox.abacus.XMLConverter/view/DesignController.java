package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSeparatorUI;

import controller.Listener;
import controller.RBFileChooser;
import javafx.beans.InvalidationListener;
import javafx.beans.WeakInvalidationListener;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import model.DataEinstellungen;
import model.SaveLoadData;

public class DesignController {

	// ----------------------------------------------Felder---------------------------------------------------
	@FXML private Button BTN_Speichern;
	@FXML private Button BTN_Testbutton;
	@FXML private TextField TF_Quelldatei;
	@FXML public static TextField TF_Testfeld;
	@FXML private TextField TF_Zieldatei;
	@FXML private TextField TF_Archivordner;
	@FXML private CheckBox CHB_DatenArchivieren; 
	@FXML private VBox VB_Archivordner;
	SaveLoadData saveLoadData = new SaveLoadData();

	
	// -----------------------------------------------Listener------------------------------------------------
	
	
    public void initialize() throws FileNotFoundException, ClassNotFoundException, IOException { 
//		System.out.println("hallo welt");
		TF_Quelldatei.setText(saveLoadData.leseDaten().getQuellDatei());
		TF_Zieldatei.setText(saveLoadData.leseDaten().getZielDatei());
		TF_Archivordner.setText(saveLoadData.leseDaten().getArchivOrdner());
		CHB_DatenArchivieren.setSelected(saveLoadData.leseDaten().getDatenArchivieren());
		setArchivordnervisible();
	}
	
	
	
	
	public static void listener(){
		
	
	InvalidationListener iv = (evt) -> {
		if(!TF_Testfeld.isFocused()){
			System.out.println("testfocus");
		}
	};
	System.out.println("focus läuft");
	TF_Testfeld.focusedProperty().addListener(
			new WeakInvalidationListener(iv)
			);
	
	
	}
	

	
	
	// ----------------------------------------------Funktionen-----------------------------------------------

	
	
	public void test(){
		
	}
	
	
	public void saveDataEinstellungen() throws FileNotFoundException, IOException{
		saveLoadData.speichereDaten(TF_Quelldatei.getText(), TF_Zieldatei.getText(), TF_Archivordner.getText(), CHB_DatenArchivieren.isSelected());
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
