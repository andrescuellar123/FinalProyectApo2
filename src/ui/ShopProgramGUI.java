package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import model.ShopProgram;

public class ShopProgramGUI {
	private ShopProgram shop;
	
	  @FXML
	    private BorderPane mainPanel;
	    @FXML
	    private TextField nameTxt;

	    @FXML
	    private TextField idTxt;

	    @FXML
	    private ChoiceBox<String> isEmployee;



	/**
	 * @param shop
	 */
	public ShopProgramGUI(ShopProgram shop) {
		super();
		this.shop = shop;
	}

	@FXML
	void AddProductWindow(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddProductWindow.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent pa4 = (Parent)fxmlLoader.load();
		mainPanel.getChildren().clear();
    	mainPanel.setTop(pa4);
	}

	@FXML
	void BetterEmployeeWindow(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BetterEmployeeWindow.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent pa6 = (Parent)fxmlLoader.load();
		mainPanel.getChildren().clear();
    	mainPanel.setTop(pa6);
	}

	@FXML
	void ListWindow(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddProductWindow.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent pa5 = (Parent)fxmlLoader.load();
		mainPanel.getChildren().clear();
    	mainPanel.setTop(pa5);
	}

	@FXML
	void OrganizeWindow(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OrganizeWindow.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent pa2 = (Parent)fxmlLoader.load();
		mainPanel.getChildren().clear();
    	mainPanel.setTop(pa2);
	}

	@FXML
	public void RegisterWindow(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RegisterWindow.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent pa1 = (Parent)fxmlLoader.load();
		mainPanel.getChildren().clear();
    	mainPanel.setTop(pa1);
	}
	

	@FXML
	public void SearchWindow(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SearchWindow.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent pa3 = (Parent)fxmlLoader.load();
		mainPanel.getChildren().clear();
    	mainPanel.setTop(pa3);
	}

    @FXML
    void AddPerson(ActionEvent event) {
    	String name = nameTxt.getText();
    	String id = idTxt.getId();
    	boolean empl = Boolean.parseBoolean(isEmployee.getValue().toString());
    	
    }
}
