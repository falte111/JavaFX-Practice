package org.openfx.hellofx;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
	private Stage stage;
	private Scene scene;
	private Parent root;

	public void switchToScene1(ActionEvent event) throws IOException {
		//This line gets the source of the event (a button, presumably) and then gets the window (stage) that contains it. Ie: It is getting scene2 stage
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		//Get the scene1 fxml file
		root = FXMLLoader.load(getClass().getResource("/Scene1.fxml"));
		//Load the scene with the fxml file
		scene = new Scene(root);
		String css =this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		//Set the stage from scene2 with the new scene ie scene1
		stage.setScene(scene);
		stage.show();
	}

	public void switchToScene2(ActionEvent event) throws IOException {
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		root = FXMLLoader.load(getClass().getResource("/Scene2.fxml"));
		scene = new Scene(root);
		String css =this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
	}
}
