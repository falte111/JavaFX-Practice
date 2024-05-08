package org.openfx.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
	
	@FXML
	
	//Adding @FXML annotation means that in your App, the FXML loader will inject all the values in your Main.fxml file into your controller
	private Circle myCircle;
	private double y;
	private double x;
	
	public void up (ActionEvent e) {
		System.out.println("UP");
		myCircle.setCenterY(y-=1);
	}
	
	public void down (ActionEvent e) {
		System.out.println("DOWN");
		myCircle.setCenterY(y+=1);
	}
	
	public void left (ActionEvent e) {
		System.out.println("LEFT");
		myCircle.setCenterX(x-=1);
	}
	
	public void right (ActionEvent e) {
		System.out.println("RIGHT");
		myCircle.setCenterX(x+=1);
	}
	
}
