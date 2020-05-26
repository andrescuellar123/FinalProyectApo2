package ui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import Thread.ImageAppearThread;
import Thread.ImageDisappearThread;
import Thread.WindmillThread;
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
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
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




	@FXML
	private Rectangle RectaNegro1;

	@FXML
	private Rectangle RectaNegro2;

	@FXML
	private Rectangle RectaAmarillo1;
	@FXML
	private Rectangle RectaAmarillo2;


	@FXML
	public ImageView APPEARDISA;
	

    @FXML
    private ImageView DIRECTIONIMG;
    
    
    @FXML
    private Label resp;
    
    @FXML
    private TextField NAMEDATA;
    @FXML
    private Label indication;
	/**
	 * @param shop
	 */
	public ShopProgramGUI(ShopProgram shops) {
		shop = shops;
	}

	@FXML
	void AddProductWindow(ActionEvent event) throws IOException {
		shop.setSpin(false);
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddProductWindow.fxml"));

		fxmlLoader.setController(this);    	
		Parent pa4 = (Parent)fxmlLoader.load();
		mainPanel.getChildren().clear();
		mainPanel.setTop(pa4);


	}

	@FXML
	void BetterEmployeeWindow(ActionEvent event) throws IOException {
		shop.setSpin(false);
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BetterEmployeeWindow.fxml"));

		fxmlLoader.setController(this);    	
		Parent pa6 = (Parent)fxmlLoader.load();
		mainPanel.getChildren().clear();
		mainPanel.setTop(pa6);
		initializeEmployeeOfTheMonth();
	}

	@FXML
	public void ListWindow(ActionEvent event) throws IOException {
		shop.setSpin(false);
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ListWindow.fxml"));

		fxmlLoader.setController(this);    	
		Parent pa5 = (Parent)fxmlLoader.load();
		mainPanel.getChildren().clear();
		mainPanel.setTop(pa5);
		initializeTable();


	}

	@FXML
	void OrganizeWindow(ActionEvent event) throws IOException {
		shop.setSpin(false);
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OrganizeWindow.fxml"));

		fxmlLoader.setController(this);    	
		Parent pa2 = (Parent)fxmlLoader.load();
		mainPanel.getChildren().clear();
		mainPanel.setTop(pa2);

	}

	@FXML
	public void RegisterWindow(ActionEvent event) throws IOException {
		shop.setSpin(false);
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RegisterWindow.fxml"));

		fxmlLoader.setController(this);    	
		Parent pa1 = (Parent)fxmlLoader.load();
		mainPanel.getChildren().clear();
		mainPanel.setTop(pa1);
	}


	@FXML
	public void SearchWindow(ActionEvent event) throws IOException {
		shop.setSpin(false);
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SearchWindow.fxml"));

		fxmlLoader.setController(this);    	
		Parent pa3 = (Parent)fxmlLoader.load();
		mainPanel.getChildren().clear();
		mainPanel.setTop(pa3);
	}
		
    @FXML
    void writeDataWindow(ActionEvent event) throws IOException {
    	shop.setSpin(false);
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WriteDataWindow.fxml"));

		fxmlLoader.setController(this);    	
		Parent pa7 = (Parent)fxmlLoader.load();
		mainPanel.getChildren().clear();
		mainPanel.setTop(pa7);
		DIRECTIONIMG.setVisible(false);
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
			phTxt1.clear();
			TrueB.setSelected(false);
		}
		else if(FalseB.isSelected()) {

			shop.addCliente(name, id,phone);
			addresponse.setText("you have create a Client");
			String r = shop.findClient(id).getName();
			th.setText(r);
			nameTxt.clear();
			idTxt.clear();
			phTxt1.clear();
			FalseB.setSelected(false);
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


		
			y = shop.searchEmployee(idEmployee);
			shop.addClientToEmployee(idEmployee, x.getId(), x.getName(), x.getPhone());
			PrResponse.setText("Client name is: "+x.getName()+" and bought: "+ x.getProd().get(x.getProd().size()-1).getName());
			Prname.clear();
			PrId.clear();
			Prcost.clear();
			PrEmployeeId.clear();
		}catch(NullPointerException e) {
			System.out.println("We didnt find the person (dont exisist in the system)");
		}
		catch(NumberFormatException e) {
			System.out.println("Write properly the information");
		}
	}

		 @Override
		 public void initialize(URL location, ResourceBundle resources) {

				new WindmillThread(shop, this).start();
				new ImageAppearThread(shop, this).start();
				new ImageDisappearThread(shop, this).start();
				shop.addWindMill(RectaNegro1.getRotate());
				shop.addWindMill(RectaNegro2.getRotate());
				shop.addWindMill(RectaAmarillo1.getRotate());
				shop.addWindMill(RectaAmarillo2.getRotate());
			 
				
	
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
			shop.searchEmployee(shop.getEmpleadoRaiz().getId());
			shop.orderByIdEmployeeMenorToBig();
			shop.searchEmployee(shop.getEmpleadoRaiz().getId());
			Employee f = shop.findingTheEmployeeOfTheMonth();
			EmployeeMonthTotal.setText(""+f.getNumClients());

			employeeMonthName.setText(f.getName());

		}catch(NullPointerException e) {
			System.out.println("there is no many employees to know "
					+ "who is the emloyee of the month (at least two) ");
			System.out.println("Or there is not sells registered in the program");
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
					+ "of person or just dont exisist in the system)");
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
	void posOrder(ActionEvent event) throws EmployeeNullException {
		ObservableList<Employee> observableList2 ;
		observableList2 = FXCollections.observableArrayList(shop.getPosOrder());

		NamesTv.setItems(observableList2);


		NamesTc.setCellValueFactory(new PropertyValueFactory<Employee,String>("name"));
		IdTc.setCellValueFactory(new PropertyValueFactory<Employee,String>("id"));
		CATEGORY.setText("You choose to organize : POSTORDER");

	}

	@FXML
	void preOrder(ActionEvent event) throws EmployeeNullException {
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

		CATEGORY.setText("You choose to organize :  ID");
	}



	public void updateWindMill() {
		List<Windmill> ls = shop.getWindmill();

		RectaNegro1.setRotate(ls.get(0).getRotation());
		RectaNegro2.setRotate(ls.get(1).getRotation());
		RectaAmarillo1.setRotate(ls.get(2).getRotation());
		RectaAmarillo2.setRotate(ls.get(3).getRotation());
	}


	public void updateAppear() {

		APPEARDISA.setVisible(true);


	}
	public void updateDisappear() {

		APPEARDISA.setVisible(false);


	}
	
    @FXML
    void writeData(ActionEvent event) throws IOException, ClientNullException, EmployeeNullException {
    	try {
    	String nameData = NAMEDATA.getText();
    	indication.setVisible(false);
    	shop.writteData(nameData);
    	DIRECTIONIMG.setVisible(true);
    	 Color c = Color.RED;
    	resp.setTextFill(c);
    	resp.setText("To know where is the report check out the folder in the image");
    	}
    	catch(FileNotFoundException e) {
    		System.out.println("Dont write / when you are writing the name of file  ");
    	}
    }
}
