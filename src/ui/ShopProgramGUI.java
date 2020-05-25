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
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
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

	private Employee y;

	@FXML
	private TableView<Client> tcV1;
	@FXML
	private TableView<Employee> tcVEmployees;

	@FXML
	private TextField phTxt1;

	@FXML
	private TableColumn<Client, String> NameClients1;

	@FXML
	private TableColumn<Client, String> idClients1;

	@FXML
	private TableColumn<Employee, String> NameEmployees;

	@FXML
	private TableColumn<Employee, String> idEmployees;

	@FXML
	private TableColumn<Employee, Integer> totalCients;

	@FXML
	private TableColumn<Client, Double> totalProducts;

	@FXML
	private TextField PrEmployeeId;


	@FXML
	private TextField idToSearch;

	@FXML
	private RadioButton clientOfSearchB;

	@FXML
	private ToggleGroup SEARCH;

	@FXML
	private RadioButton employeeOfSearchB;

	@FXML
	private Label TypeOfSearchLB;

	@FXML
	private Label NameOfSearchLB;

	@FXML
	private Label idOfSearchLB;

	@FXML
	private Label phoneOfSearchLB;

	@FXML
	private Label EmployeeMonthTotal;

	@FXML
	private Label employeeMonthName;

	@FXML
	private TableView<Employee> NamesTv;

	@FXML
	private TableColumn<Employee, String> NamesTc;


	@FXML
	private Label NamesOrder;

	@FXML
	private Label IdsOrder;

	@FXML
	private Rectangle CuadradoNames;

	@FXML
	private Rectangle CuadradoIds;


    @FXML
    private TableColumn<Employee, String> IdTc;


    @FXML
    private Label CATEGORY;

	/**
	 * @param shop
	 */
	 public ShopProgramGUI(ShopProgram shops) {
		 shop = shops;
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
		 initializeEmployeeOfTheMonth();
	 }

	 @FXML
	 public void ListWindow(ActionEvent event) throws IOException {
		 FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ListWindow.fxml"));

		 fxmlLoader.setController(this);    	
		 Parent pa5 = (Parent)fxmlLoader.load();
		 mainPanel.getChildren().clear();
		 mainPanel.setTop(pa5);
		 initializeTable();


	 }

	 @FXML
	 void OrganizeWindow(ActionEvent event) throws IOException {
		 FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Organize2.fxml"));

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
		 String id = idTxt.getText();
		 String phone = phTxt1.getText();

		 if(TrueB.isSelected()) {

			 shop.addHumanTree(name, id, phone);
			 addresponse.setText("you have create a Employee");
			 y = new Employee(name, id, phone,true);
			 String r = y.getName();
			 th.setText(r);
			 nameTxt.clear();
			 idTxt.clear();
		 }
		 else if(FalseB.isSelected()) {

			 shop.addCliente(name, id,phone);
			 addresponse.setText("you have create a Client");
			 String r = shop.findClient(id).getName();
			 th.setText(r);
			 nameTxt.clear();
			 idTxt.clear();
		 }

	 }

	 @FXML
	 void AddProduct(ActionEvent event) {
		 try {
			 String name = Prname.getText();
			 double cost = Double.parseDouble(Prcost.getText());
			 String id = PrId.getText();
			 Product p = new Product (name,cost);

			 shop.findClient(id).addProducto(p);

			 String idEmployee = PrEmployeeId.getText();
			 x = shop.findClient(id);


			 //shop.searchEmployee(idEmployee).addClient(x.getName(),x.getId(),x.getPhone());
			 //+" Employee " +y.getName()
			 y = shop.searchEmployee(idEmployee);
			 shop.addClientToEmployee(idEmployee, x.getId(), x.getName(), x.getPhone());
			 PrResponse.setText(x.getName()+" "+ x.getProd().get(x.getProd().size()-1).getName());
		 }catch(NullPointerException e) {
			 System.out.println("We didnt find the person (dont exisist in the system)");
		 }
	 }

	 @Override
	 public void initialize(URL location, ResourceBundle resources) {

		 


	 }
	 private void initializeTable(){
		 ObservableList<Client> observableList ;
		 observableList = FXCollections.observableArrayList(shop.getNa());

		 ObservableList<Employee> observableList2 ;
		 observableList2 = FXCollections.observableArrayList(shop.getNa2(shop.getEmpleadoRaiz()));

		 tcV1.setItems(observableList);

		 NameClients1.setCellValueFactory(new PropertyValueFactory<Client,String>("name"));
		 idClients1.setCellValueFactory(new PropertyValueFactory<Client,String>("id"));
		 totalProducts.setCellValueFactory(new PropertyValueFactory<Client,Double>("total"));

		 tcVEmployees.setItems(observableList2);
		 NameEmployees.setCellValueFactory(new PropertyValueFactory<Employee,String>("name"));
		 idEmployees.setCellValueFactory(new PropertyValueFactory<Employee,String>("id"));
		 totalCients.setCellValueFactory(new PropertyValueFactory<Employee,Integer>("numClients"));

	 }

	 private void initializeEmployeeOfTheMonth() {
		 try {
			 shop.orderByIdEmployeeMenorToBig();
			 shop.searchEmployee(shop.getEmpleadoRaiz().getId());
			 Employee f = shop.findingTheEmployeeOfTheMonth();
			 EmployeeMonthTotal.setText(""+f.getNumClients());

			 employeeMonthName.setText(f.getName());
		 
		 }catch(NullPointerException e) {
			 System.out.println("there is no many employees to know "
					 + "who is the emloyee of the month (at least two)");
		 }
	 }


	 @FXML
	 void binaryType(ActionEvent event) {
		 try {
			 String id = idToSearch.getText();
			 TypeOfSearchLB.setText("Binary");
			 if(clientOfSearchB.isSelected()) {
				 Client searched = shop.findBinaryClient(id);
				 NameOfSearchLB.setText(searched.getName());
				 idOfSearchLB.setText(searched.getId());
				 phoneOfSearchLB.setText(searched.getPhone());
			 }
			 if(employeeOfSearchB.isSelected()) {
				 Employee searched = shop.findBinaryEmployee(id);
				 NameOfSearchLB.setText(searched.getName());
				 idOfSearchLB.setText(searched.getId());
				 phoneOfSearchLB.setText(searched.getPhone());
				 shop.orderByIdEmployeeMenorToBig();
			 }
		 }catch(NullPointerException e) {
			 System.out.println("We didnt find the person (maybe is the other type "
					 + "of peroson or just dont exisist in the system) or the numeber of employees its not pair");
		 }
	 }

	 @FXML
	 void tradicionalType(ActionEvent event) {
		 try {
			 String id = idToSearch.getText();
			 TypeOfSearchLB.setText("Tradicional");
			 if(clientOfSearchB.isSelected()) {
				 Client searched = shop.findClient(id);
				 NameOfSearchLB.setText(searched.getName());
				 idOfSearchLB.setText(searched.getId());
				 phoneOfSearchLB.setText(searched.getPhone());
			 }
			 if(employeeOfSearchB.isSelected()) {
				 Employee searched = shop.searchEmployee(id);
				 NameOfSearchLB.setText(searched.getName());
				 idOfSearchLB.setText(searched.getId());
				 phoneOfSearchLB.setText(searched.getPhone());
			 }
		 }catch(NullPointerException e) {
			 System.out.println("We didnt find the person (maybe is the other type "
					 + "of peroson or just dont exisist in the system)");
		 }
	 }



	 @FXML
	 void posOrder(ActionEvent event) {
		 ObservableList<Employee> observableList2 ;
		 observableList2 = FXCollections.observableArrayList(shop.getPosOrder());

		 NamesTv.setItems(observableList2);


		 NamesTc.setCellValueFactory(new PropertyValueFactory<Employee,String>("name"));
		 IdTc.setCellValueFactory(new PropertyValueFactory<Employee,String>("id"));
		 CATEGORY.setText("You choose to organize : POSTORDER");

	 }

	    @FXML
	    void preOrder(ActionEvent event) {
	    	 ObservableList<Employee> observableList2 ;
			 observableList2 = FXCollections.observableArrayList(shop.getPreOrder());

			 NamesTv.setItems(observableList2);


			 NamesTc.setCellValueFactory(new PropertyValueFactory<Employee,String>("name"));
			 IdTc.setCellValueFactory(new PropertyValueFactory<Employee,String>("id"));
			 CATEGORY.setText("You choose to organize : PREORDER");
	    }
	    
	    @FXML
	    void Inorder(ActionEvent event) {
	    	 ObservableList<Employee> observableList2 ;
				 observableList2 = FXCollections.observableArrayList(shop.getInOrder());

				 NamesTv.setItems(observableList2);


				 NamesTc.setCellValueFactory(new PropertyValueFactory<Employee,String>("name"));
				 IdTc.setCellValueFactory(new PropertyValueFactory<Employee,String>("id"));
				 CATEGORY.setText("You choose to organize : INORDER");
	    }
	    

	    @FXML
	    void IdOrd(ActionEvent event) {
	    	 ObservableList<Employee> observableList2 ;
			 observableList2 = FXCollections.observableArrayList(shop.orderByIdEmployeeMenorToBig());

			 NamesTv.setItems(observableList2);


			 NamesTc.setCellValueFactory(new PropertyValueFactory<Employee,String>("name"));
			 IdTc.setCellValueFactory(new PropertyValueFactory<Employee,String>("id"));
			 
			 CATEGORY.setText("You choose to organize : MAYOR ID");
	    }
}
