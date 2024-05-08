package org.openfx.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
//		//Group is like the root node, there are many different types of root nodes, for now we use the most basic one call group
//		//Root nodes are like layout managers, we need it to pass it in to the scene class, we are adding the root node to the scene
//		Group root = new Group();
//		Image icon = new Image("/Untitled.jpg");  //"Untitled.jpg" also works
//		Scene scene = new Scene(root,javafx.scene.paint.Color.BLACK);
//		stage.getIcons().add(icon);	
//		stage.setScene(scene);
//		stage.setWidth(600);
//		stage.setHeight(600);
//		//False means the program cannot be resized
//		stage.setResizable(false);
//		stage.setTitle("DEMO PROGRAM");
//		Text text = new Text();
//		text.setText("HELLO WORLD!!!");
//		//X and Y 50 means the text will appear at top left hand corner
//		text.setX(50);
//		text.setY(50);
//		text.setFont(Font.font("Verdana",50));
//		text.setFill(Color.WHITE);
//		
//		//Drawing of lines
//		Line line = new Line();
//		line.setStartX(200);
//		line.setStartY(200);
//		line.setEndX(500);
//		line.setEndY(200);
//		line.setStrokeWidth(5);
//		line.setStroke(Color.RED);
//		line.setOpacity(0.5);
//		line.setRotate(45);
//		
//		//Adding of images
//		Image image = new Image("donald.jpg");
//		ImageView imageView = new ImageView(image);
//		imageView.setX(100);
//		imageView.setY(100);
//		
//		root.getChildren().add(line);
//		root.getChildren().add(text);
//		root.getChildren().add(imageView);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Scene1.fxml"));
		Parent root = loader.load();		
		Scene scene = new Scene(root);
//		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		String css =this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		Image icon = new Image("/Untitled.jpg");
		stage.getIcons().add(icon);	
		stage.setScene(scene);
		stage.setWidth(600);
		stage.setHeight(600);
		stage.show();
	}

}