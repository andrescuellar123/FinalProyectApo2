package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ShopProgram;

public class Main extends Application{
	private ShopProgramGUI shopGUI;
	private ShopProgram shop;
	
	public Main() {
		shop = new ShopProgram(null,null);
		shopGUI = new ShopProgramGUI(shop);
	}
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("welcome.fxml"));

		fxmlLoader.setController(shopGUI);
		
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("The Shop Program");
		primaryStage.show();
	}

}
