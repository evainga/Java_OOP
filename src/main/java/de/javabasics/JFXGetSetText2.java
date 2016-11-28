package de.javabasics;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public final class JFXGetSetText2 extends Application {

	public static void m(TextField field) {
		System.out.println(field.getText());
		field.setText("def");
	}

	public void start(final Stage stage) {

		final TextField text = new TextField("pqr");

		text.setText("ghi");
		m(text);
		java.lang.System.out.println(text.getText());

		Platform.exit();
		System.exit(0);
	}

	public static void main(final String[] args) {
		Application.launch(args);
	}
}