package de.javabasics;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public final class JFXNewTextfield extends Application {
	public void start(final Stage stage) {
		final TextField v = new TextField("jkl");
		System.out.println(v.getText());
		Platform.exit();
	}

	public static void main(final java.lang.String[] args) {
		javafx.application.Application.launch(args);
	}

}