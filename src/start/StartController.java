package start;

import java.awt.TextField;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;

public class StartController {
	@FXML TextArea txtDefinition;
	@FXML TextField txtBegriff;

	@FXML Button btSpeichern;
	@FXML Button btAbbrechen;
	@FXML Button btVerlinkung;
	
	/* Model
	private DataModel model;
	// View
	private StartView view;

	public StartController(DataModel model) {
		this.model = model;
		this.view = new StartView();
	}

	public void show() {
		view.show(model.getPrimaryStage());
	}
	
	// EVENTHANDLER */

}
