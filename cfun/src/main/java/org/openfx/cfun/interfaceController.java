package org.openfx.cfun;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class interfaceController{

	private static int nbMuscu = 4;
	private static int nbFit = 5;
	
	
	
    @FXML
    private AnchorPane Accueil;

    @FXML
    private AnchorPane Sport;

    @FXML
    private Button btn_annuler;

    @FXML
    private Button btn_entree;

    @FXML
    private Button btn_fitness;

    @FXML
    private Button btn_musculation;

    @FXML
    private Button btn_no;

    @FXML
    private Button btn_ok;

    @FXML
    private Button btn_oui;

    @FXML
    private Button btn_retour;

    @FXML
    private Button btn_retour2;

    @FXML
    private Button btn_sortie;

    @FXML
    private AnchorPane tickesortie;
    
    @FXML
    private AnchorPane debut;

    @FXML
    private TextField txt_console;

    @FXML
    private TextField txt_numero;

    @FXML
    private AnchorPane yesno;
    
    @FXML
    private Button btn_admin;
    
    @FXML
    private Button btn_client;
    
    
    public void Entree()
    {
    	Accueil.setVisible(false);
    	Sport.setVisible(true);
    }
    
    public void Sortie()
    {
    	tickesortie.setVisible(true);
    	Accueil.setVisible(false);
    }
    
    public void Sport()
    {
    	Sport.setVisible(false);
    	yesno.setVisible(true);
    }
    
    public void Musculation() 
    {	
    	Sport.setVisible(false);
    	yesno.setVisible(true);
    	Complexe leComplexe = new Complexe(nbMuscu, nbFit, "Musculation \n");
    	Arrivee ARV = new Arrivee(leComplexe,'M');
    	leComplexe.nouvelUsagerMusculation();
    	txt_console.setText(ARV.afficheBillet());
    	txt_console.setText(leComplexe.lesInfos());
    	
    	//console
    	System.out.println(ARV.afficheBillet());
    	System.out.println(leComplexe.lesInfos());
    	nbMuscu = nbMuscu -1;
    }
    
    public void Fitness()
    {
    	Sport.setVisible(false);
    	yesno.setVisible(true);
    	Complexe leComplexe = new Complexe(nbMuscu, nbFit, "Fitness ");
    	Arrivee ARV = new Arrivee(leComplexe,'F');
    	leComplexe.nouvelUsagerFitness();
    	txt_console.setText(ARV.afficheBillet());
    	txt_console.setText(leComplexe.lesInfos());
    	
    	//console
    	System.out.println(ARV.afficheBillet());
    	System.out.println(leComplexe.lesInfos());
    	nbFit = nbFit-1;
    }
    
    
    public void yes()
    {
    	tickesortie.setVisible(false);
    	yesno.setVisible(false);
    	Sport.setVisible(false);
    	debut.setVisible(false);
    	Accueil.setVisible(true);
    }
    
    public void no()
    {
    	System.exit(0);
    }
    
    public void OKsortie()
    {
    	tickesortie.setVisible(false);
    	Accueil.setVisible(true);
    	Complexe leComplexe = new Complexe(nbMuscu, nbFit, "Cfun ");
    	Arrivee ARV = new Arrivee(leComplexe,'F');
    	System.out.println(ARV.afficheTicket());
    	System.out.println(leComplexe.lesInfos());
    }
    
    public void retour()
    {
    	Sport.setVisible(false);
    	Accueil.setVisible(true);
    	
    }
    
    public void retour2()
    {
    	Sport.setVisible(true);
    	yesno.setVisible(false);
    	
    }
}

