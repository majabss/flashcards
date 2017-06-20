package start;

import application.DataModel;

public class StartController {
	// Model
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
	
	// EVENTHANDLER

}
