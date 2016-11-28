package de.javabasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public final class JFXVBoxesRefactored extends Application {

	public static void textMethode(VBox vbox, String t) {
		final TextField text = new TextField(t);
		vbox.getChildren().add(text);
	}

	public void start(final Stage stage) {

		final VBox vbox = new VBox();

		textMethode(vbox, "19:21");
		textMethode(vbox, "19:02");
		textMethode(vbox, "19:03");

		for (int i = 0; i < 10; i++)
			textMethode(vbox, "default");

		stage.setScene(new Scene(vbox));
		stage.show();
	}

	public static void main(final String[] args) {
		Application.launch(args);
	}

}