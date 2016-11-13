package de.javabasics;

public final class Main11 extends javafx.application.Application {
	public void start(final javafx.stage.Stage stage)

	{
		final javafx.scene.control.TextField textField = new javafx.scene.control.TextField("äöüÄÖÜß€");
		final javafx.scene.Scene s = new javafx.scene.Scene(textField);
		stage.setScene(s);
		stage.show();
	}

	public static void main(final java.lang.String[] args) {
		javafx.application.Application.launch();
	}

}