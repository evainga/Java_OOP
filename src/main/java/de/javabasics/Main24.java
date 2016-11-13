package de.javabasics;

public final class Main24 extends javafx.application.Application {

	public void start(final javafx.stage.Stage stage) {
		final javafx.scene.control.TextField text = new javafx.scene.control.TextField("pqr");

		text.setText("ghi");
		java.lang.System.out.println(text.getText());

		javafx.application.Platform.exit();
		java.lang.System.exit(0);
	}

	public static void main(final java.lang.String[] args) {
		javafx.application.Application.launch(args);
	}

}