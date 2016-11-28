package de.javabasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public final class JFXVBox extends Application {

	public static VBox vbox() {
		final VBox vbox = new VBox();

		final TextField text = new TextField("text");
		vbox.getChildren().add(text);

		final TextField text1 = new TextField("text");
		vbox.getChildren().add(text1);

		return vbox;
	}

	public void start(final Stage stage) {
		stage.setScene(new Scene(vbox()));
		stage.show();
	}

	public static void main(final String[] args) {
		Application.launch(args);
	}

}

// Refaktor (2)
// http://userpage.fu-berlin.de/~ram/pub/pub_jf47ht81Ht/javafx_anfang_java
// zuhasue wdh!!