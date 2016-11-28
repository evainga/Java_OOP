package de.javabasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JFXBoxesRefactored extends Application {

	@SuppressWarnings("restriction")
	public static void addVBox(Pane box, String s) {
		box.getChildren().add(new TextField(s));
	}

	@SuppressWarnings("restriction")
	public void start(final Stage stage) {

		Pane hbox = new HBox();
		Pane vbox1 = new VBox();
		Pane vbox2 = new VBox();

		addVBox(vbox1, "text1");
		addVBox(vbox1, "text2");
		addVBox(vbox2, "text3");
		addVBox(vbox2, "text4");

		hbox.getChildren().add(vbox1);
		hbox.getChildren().add(vbox2);

		stage.setScene(new Scene(hbox));
		stage.show();
	}

	@SuppressWarnings("restriction")
	public static void main(final String[] args) {
		launch();
	}
}