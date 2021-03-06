package org.openfx.cfun;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class interfaceController{

	//définit le nombre de place disponible par défaut
	private static int nbMuscu = 4;
	private static int nbFit = 5;
	
	//liste des boutons, page, ou zone de texte correspondant au fx:id du interface.fxml
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
    private Label txt_console1;
    
    @FXML
    private Label txt_console2;

    @FXML
    private TextField txt_numero;

    @FXML
    private AnchorPane yesno;
    
    @FXML
    private Button btn_admin;
    
    @FXML
    private Button btn_client;
    
    @FXML
    private Button btn_fin;
    
    @FXML
    private AnchorPane Montant;
    
    //liste des OnAction des boutons setVisible permet d'afficher les pages ou non
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
    
    //onaction pour le bouton musculation
    public void Musculation() 
    {	
    	Sport.setVisible(false);
    	yesno.setVisible(true);
    	
    	//création d'un objet avec les information de information
    	Complexe leComplexe = new Complexe(nbMuscu, nbFit, "Musculation \n");
    	Arrivee ARV = new Arrivee(leComplexe,'M');
    	
    	//liaison au code avec l'utilisation de l'objet
    	leComplexe.nouvelUsagerMusculation();
    	
    	ARV.setNumeroArrivee();
    	
    	//affichage console
    	System.out.println(ARV.afficheBillet() + "" + leComplexe.lesInfos());
    	nbMuscu = nbMuscu -1;
    	
    	//affichage dans le textField pour que le client voie le billet
    	txt_console1.setText(ARV.afficheBillet() + "" + leComplexe.lesInfos());
    }
    
    
    public void Fitness()
    {
    	Sport.setVisible(false);
    	yesno.setVisible(true);
    	Complexe leComplexe = new Complexe(nbMuscu, nbFit, "Fitness ");
    	Arrivee ARV = new Arrivee(leComplexe,'F');
    	leComplexe.nouvelUsagerFitness();
    	ARV.setNumeroArrivee();
    	//console
    	System.out.println(ARV.afficheBillet() + "" + leComplexe.lesInfos());
    	nbFit = nbFit-1;
    	
    	txt_console1.setText(ARV.afficheBillet() + "" + leComplexe.lesInfos());
    	
    }
    
    //fonction onAction utiliser pour revenir a l'accueil
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
    
    //permet de sortir le ticket dans la console
    public void OKsortie()
    {
    	tickesortie.setVisible(false);
    	Montant.setVisible(true);
    	Complexe leComplexe = new Complexe(nbMuscu, nbFit, "Cfun ");
    	Arrivee ARV = new Arrivee(leComplexe,'F');
    	System.out.println(ARV.afficheTicket());
    	
    	txt_console2.setText(ARV.afficheTicket());
    	
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
    
    public void fin()
    {
    	Accueil.setVisible(true);
    	Montant.setVisible(false);
    }
}

