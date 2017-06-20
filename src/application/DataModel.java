package application;

import javafx.stage.Stage;

public class DataModel {
	private Stage primaryStage;
	private String pfad;

	public DataModel(Stage primaryStage) {
      this.primaryStage = primaryStage;
      pfad = "karteikarten.bin";
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}
	
	public String getPfad() {
		return pfad;
	}
}
