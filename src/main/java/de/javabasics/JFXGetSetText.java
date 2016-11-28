package de.javabasics;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public final class JFXGetSetText extends Application {

	public void start(final Stage stage) {
		final TextField text = new TextField("pqr");

		text.setText("ghi");
		System.out.println(text.getText());

		Platform.exit();
		System.exit(0);
	}

	public static void main(final String[] args) {
		Application.launch(args);
	}

}