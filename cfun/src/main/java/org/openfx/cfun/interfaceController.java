package org.openfx.cfun;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class interfaceController {
	
	
	@FXML
	private AnchorPane Accueil;

	@FXML
	private AnchorPane Sport;
	    
	@FXML TextField txt_console;

	@FXML
	private AnchorPane yesno;

    @FXML
    private Button btn_entree;

    @FXML
    private Button btn_fitness;

    @FXML
    private Button btn_musculation;

    @FXML
    private Button btn_no;

    @FXML
    private Button btn_oui;

    @FXML
    private Button btn_sortie;
    
  
    public void Entree() {
    	Accueil.setVisible(false);
    	Sport.setVisible(true);
    	txt_console.setText("leComplexe.lesInfos()");
    }
    
    public void Sport() {
    	
    	Sport.setVisible(false);
    	yesno.setVisible(true);
    	
    }
    
  
    public void yes() {
    	yesno.setVisible(false);
    	Accueil.setVisible(true);
    	
    }
    
    public void no() {
    	System.exit(0);
    }
    
    public void retour() {
    	Sport.setVisible(false);
    	Accueil.setVisible(true);
    	
    }
    
    public void retour2() {
    	Sport.setVisible(true);
    	yesno.setVisible(false);
    	
    }
}
