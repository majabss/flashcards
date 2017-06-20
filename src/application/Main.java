package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kartei.Karteiverwaltung;
import start.StartController;

public class Main extends Application {
	private Karteiverwaltung kk;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void init() {
		// kk mit Datei initialisieren
	}

	@Override
	public void start(Stage primaryStage) {
		DataModel model = new DataModel(primaryStage);
		
		// Ersten Controller aufrufen
		StartController startC = new StartController(model);
		startC.show();

		try {
			// Main
			Parent main = FXMLLoader.load(getClass().getResource("start.fxml"));
			Scene smain = new Scene(main);

			// BorderPane root = new BorderPane();
			// Scene scene = new Scene(root,400,400);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			// Hauptbühne setzen (Szene 1)
			primaryStage.setTitle("Flashcards");
			primaryStage.setScene(smain);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
