package it.polito.tdp.alien;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	AlienDictionary diz = new AlienDictionary();
	
    @FXML
    private TextField txtInserito;

    @FXML
    private Button btnTranslate;

    @FXML
    private Button btnClear;
    
    @FXML
    private TextArea txtArea;

    @FXML
    void doClear(ActionEvent event) {

    }

    @FXML
    void doTranslate(ActionEvent event) {
    

    	String testo = txtInserito.getText();
    	testo = testo.toLowerCase();
    	String[] array = testo.split(" ");

    	if(array.length==1)
    	{
        	if(array[0].matches("[a-zA-Z]*")==false)
        	{
        		this.txtArea.setText("Le parole devono contenere solo lettere");
        		return;
        	}
    		String translation= diz.translateWord(array[0]);
    		this.txtArea.setText(translation);
    	}
    	else if(array.length==2)
    	{
        	if(array[0].matches("[a-zA-Z]*")==false || array[1].matches("[a-zA-Z]*")==false)
        	{
        		this.txtArea.setText("Le parole devono contenere solo lettere");
        		return;
        	}
    		this.txtArea.setText("Aggiungere: "+array[0]+"trad"+array[1]);
    		diz.addWord(array[0], array[1]);
    		this.txtArea.setText("Parola Aggiunta");
    	}

    }

}
