package ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import model.*;
public class ShopProgramGUI implements Initializable{
	private ShopProgram shop;
	
	  @FXML
	    private BorderPane mainPanel;
	    @FXML
	    private TextField nameTxt;

	    @FXML
	    private TextField idTxt;

	    @FXML
	    private RadioButton TrueB;

	    @FXML
	    private RadioButton FalseB;
	    
	    @FXML
	    private Label addresponse;
	    
	    @FXML
	    private Label th;

	    @FXML
	    private TextField Prname;

	    @FXML
	    private TextField Prcost;

	    @FXML
	    private Label PrResponse;
	    
	    @FXML
	    private TextField PrId;
	    
	    private Client x;
	    
	    @FXML
	    private TableView<Client> tcV;

	    @FXML
	    private TableColumn<Client, String> NameClients;

	    @FXML
	    private TableColumn<Client, String> idClients;
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
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ListWindow.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent pa5 = (Parent)fxmlLoader.load();
		mainPanel.getChildren().clear();
    	mainPanel.setTop(pa5);
    	initialize2();
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
    void AddPerson(ActionEvent event) throws RepetitiveException {
    	String name = nameTxt.getText();
    	String id = idTxt.getId();
    	boolean empl = false;
    	if(TrueB.isSelected()) {
    		empl = true;
    	}
    	else if(FalseB.isSelected()) {
    		empl = false;
    		shop.addCliente(name, id);
    		addresponse.setText("you have create a Client");
    		String r = shop.findClient(id).getName();
    		th.setText(r);
    		nameTxt.clear();
    		idTxt.clear();
    	}
    	
    }
    
    @FXML
    void AddProduct(ActionEvent event) {
    	initialize2();
    	String name = Prname.getText();
    	double cost = Double.parseDouble(Prcost.getText());
    	String id = PrId.getText();
    	Product p = new Product (name,cost);
    	
    	//shop.findClient(id).addProducto(p);
    	
    	PrResponse.setText(x.getId());
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		
		
	}
	public void initialize2(){
	  	ObservableList<Client> observableList;
    	observableList = FXCollections.observableArrayList(shop.getNa());
    	
    	tcV.setItems(observableList);
    	NameClients.setCellValueFactory(new PropertyValueFactory<Client,String>("name"));
    	NameClients.setCellValueFactory(new PropertyValueFactory<Client,String>("id"));
	}
    
  
}
