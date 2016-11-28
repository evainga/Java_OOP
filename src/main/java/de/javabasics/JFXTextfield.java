package de.javabasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public final class JFXTextfield extends Application {
	public void start(final Stage stage) {

		final TextField text = new TextField("abc");
		final Scene object = new Scene(text);
		stage.setScene(object);
		stage.show();
	}

	public static void main(final String[] args) {
		Application.launch(args);
	}

}