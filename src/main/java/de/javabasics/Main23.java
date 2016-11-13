package de.javabasics;

public final class Main23 extends javafx.application.Application {

	public static void textMethode(javafx.scene.layout.VBox vbox, String t) {
		final javafx.scene.control.TextField text = new javafx.scene.control.TextField(t);
		vbox.getChildren().add(text);
	}

	public void start(final javafx.stage.Stage stage) {

		final javafx.scene.layout.VBox vbox = new javafx.scene.layout.VBox();

		textMethode(vbox, "19:21");
		textMethode(vbox, "19:02");
		textMethode(vbox, "19:03");

		for (int i = 0; i < 10; i++)
			textMethode(vbox, "default");

		stage.setScene(new javafx.scene.Scene(vbox));
		stage.show();
	}

	public static void main(final java.lang.String[] args) {
		javafx.application.Application.launch(args);
	}

}