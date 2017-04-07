package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MainViewController {
	@FXML
	ListView empLstView;
	
	@FXML
	TextField fNameTxtFld;
	
	@FXML
	TextField lNameTxtFld;
	
	@FXML
	TextField idTxtFld;
	
	@FXML
	TextField mNameTxtFld;
	
	@FXML
	Button addEmpBtn;
	
	//Controller fields
	String firstName;
	String lastName;
	String middleName;
	String id;
	
	@FXML public void testButton(ActionEvent event){
		System.out.println("Button working");
		//retrieve values from text fields:
		firstName = fNameTxtFld.getText().toString();
		lastName = lNameTxtFld.getText().toString();
		middleName = mNameTxtFld.getText().toString();
		id = idTxtFld.getText().toString();
		
		System.out.println(firstName + " " + lastName + " " + middleName + " " + id);
	}
	
}
