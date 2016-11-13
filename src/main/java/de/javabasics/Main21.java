package de.javabasics;

public final class Main21 extends javafx.application.Application {

	public static javafx.scene.layout.VBox vbox() {
		final javafx.scene.layout.VBox vbox = new javafx.scene.layout.VBox();

		final javafx.scene.control.TextField text = new javafx.scene.control.TextField("text");
		vbox.getChildren().add(text);

		final javafx.scene.control.TextField text1 = new javafx.scene.control.TextField("text");
		vbox.getChildren().add(text1);

		return vbox;
	}

	public void start(final javafx.stage.Stage stage) {
		stage.setScene(new javafx.scene.Scene(vbox()));
		stage.show();
	}

	public static void main(final java.lang.String[] args) {
		javafx.application.Application.launch(args);
	}

}

// Refaktor (2)
// http://userpage.fu-berlin.de/~ram/pub/pub_jf47ht81Ht/javafx_anfang_java
// zuhasue wdh!!