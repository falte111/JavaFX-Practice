package org.openfx.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

	@Override
	public void start(Stage stage) throws Exception {
		//Group is like the root node, there are many different types of root nodes, for now we use the most basic one call group
		//Root nodes are like layout managers, we need it to pass it in to the scene class, we are adding the root node to the scene
		Group root = new Group();
		Image image = new Image("/Untitled.jpg");  //"Untitled.jpg" also works
		Scene scene = new Scene(root,javafx.scene.paint.Color.BLACK);
		stage.getIcons().add(image);	
		stage.setScene(scene);
		stage.setWidth(420);
		stage.setHeight(420);
		//False means the program cannot be resized
		stage.setResizable(false);
		stage.setTitle("DEMO PROGRAM");
		stage.show();
	}

}