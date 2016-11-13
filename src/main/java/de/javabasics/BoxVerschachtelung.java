package de.javabasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public final class BoxVerschachtelung extends Application {

	public static void addVBox(Pane box, String s) {
		final TextField text = new TextField(s);
		box.getChildren().add(text);
	}

	public void start(final javafx.stage.Stage stage) {

		final Pane hbox = new HBox();
		final Pane vbox1 = new VBox();
		final Pane vbox2 = new VBox();

		addVBox(vbox1, "text1");
		addVBox(vbox1, "text2");
		addVBox(vbox2, "text3");
		addVBox(vbox2, "text4");

		hbox.getChildren().add(vbox1);
		hbox.getChildren().add(vbox2);

		stage.setScene(new Scene(hbox));
		stage.show();
	}

	public static void main(final String[] args) {
		Application.launch(args);
	}
}