package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainWindow {
	private Stage myStage;
	private TextField userInput;
	
	public MainWindow(Stage stage) {
		StackPane pane = new StackPane();
		Scene scene = new Scene(pane);
		userInput = new TextField();
		Button btn = new Button("Open Other Window");
		myStage = stage;
		myStage.setTitle("Main Window");
		myStage.setWidth(250);
		
		myStage.setScene(scene);
		pane.getChildren().add(userInput):
		pane.getChildren().add(btn);
	}
	
	public void show()
	{
		myStage.show();
	}
	
}
