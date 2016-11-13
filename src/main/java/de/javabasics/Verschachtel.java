package de.javabasics;

public final class Verschachtel extends javafx.application.Application {

	public static final javafx.scene.control.TextField addText(java.lang.String t) {
		final javafx.scene.control.TextField text = new javafx.scene.control.TextField(t);
		return text;
	}

	public static void children(javafx.scene.layout.Pane box, String s) {
		box.getChildren().add(addText(s));
	}

	public void start(final javafx.stage.Stage stage) {

		final javafx.scene.layout.Pane hbox = new javafx.scene.layout.HBox();
		final javafx.scene.layout.Pane vbox1 = new javafx.scene.layout.VBox();
		final javafx.scene.layout.Pane vbox2 = new javafx.scene.layout.VBox();

		children(vbox1, "text1");
		children(vbox1, "text2");
		children(vbox2, "text3");
		children(vbox2, "text4");

		hbox.getChildren().add(vbox1);
		hbox.getChildren().add(vbox2);

		stage.setScene(new javafx.scene.Scene(hbox));
		stage.show();
	}

	public static void main(final java.lang.String[] args) {
		javafx.application.Application.launch(args);
	}
}