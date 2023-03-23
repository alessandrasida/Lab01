package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.Lab01.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.*;
public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;
    
    @FXML
    private Button buttonCancella;
    
    @FXML
    private URL location;

    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnReset;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;

    @FXML
    private TextArea txtAreaTempo;
    
    @FXML
    void doInsert(ActionEvent event) {
    	// richiamare addParola e getElenco
    	elenco.addParola(txtParola.getText());
    	LinkedList<String> copia = new LinkedList<String>(elenco.getElenco());
    	String parole = "";
    	for(String p : copia) {
    		parole = parole + p + " ";
    	}
    	txtResult.setText(parole);
    	double tempo = System.nanoTime();
    	txtAreaTempo.setText("Tempo impiegato: " + tempo);
    }
  
    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	txtResult.setText(null);
    	double tempo = System.nanoTime();
    	txtAreaTempo.setText("Tempo impiegato: " + tempo);
    	
    	
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	String ultima = txtParola.getText();
    	elenco.cancellaUltima(ultima);
    	
    	LinkedList<String> copia = new LinkedList<String>(elenco.getElenco());
    	String parole = "";
    	for(String p : copia) {
    		parole = parole + p + " ";
    	}
    	txtResult.setText(parole);
    	double tempo = System.nanoTime();
    	txtAreaTempo.setText("Tempo impiegato: " + tempo);
    }
    
    @FXML
    void initialize() {
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        
        elenco = new Parole() ;
    }

}
