package de.javabasics;

public final class Main20 extends javafx.application.Application {

	public void start(final javafx.stage.Stage stage) {

		final javafx.scene.control.TextField text = new javafx.scene.control.TextField("abc");

		final javafx.scene.Scene object = new javafx.scene.Scene(text);
		stage.setScene(object);

		stage.show();
	}

	public static void main(final java.lang.String[] args) {
		javafx.application.Application.launch(args);
	}

}