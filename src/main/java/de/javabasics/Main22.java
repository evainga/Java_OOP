package de.javabasics;

public final class Main22 extends javafx.application.Application {

	public void start(final javafx.stage.Stage stage) {

		final javafx.scene.layout.VBox vbox = new javafx.scene.layout.VBox();
		{
			final javafx.scene.control.TextField text = new javafx.scene.control.TextField("text");
			vbox.getChildren().add(text);
		}

		{
			final javafx.scene.control.TextField text = new javafx.scene.control.TextField("text");
			vbox.getChildren().add(text);
		}

		stage.setScene(new javafx.scene.Scene(vbox));
		stage.show();
	}

	public static void main(final java.lang.String[] args) {
		javafx.application.Application.launch(args);
	}

}