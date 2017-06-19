package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import kartei.Karteikasten;
import kartei.Karteiverwaltung;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private Karteiverwaltung kk; 
	
	@Override
	public void init() {
		// kk mit Datei initialisiseren
	}
	@Override
	public void start(Stage primaryStage) {
		try {
			// Main
			Parent main = FXMLLoader.load(getClass().getResource("main.fxml"));	         
	        Scene smain = new Scene(main);
	        
			// BorderPane root = new BorderPane();
			// Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			// Hauptbühne setzen (Szene 1)
			primaryStage.setTitle("Flashcards");
			primaryStage.setScene(smain);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
