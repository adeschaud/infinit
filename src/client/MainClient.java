package client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class MainClient extends Application{

	public static void main(String[] args) {
		Application.launch();
	}

	@Override
	public void start(Stage oStage) throws Exception {
		FXMLLoader oFXMLLoader = new FXMLLoader(getClass().getClassLoader().getResource("views/login.fxml"));
		
	}

}
