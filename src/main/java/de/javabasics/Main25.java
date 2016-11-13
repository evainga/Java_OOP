package de.javabasics;

public final class Main25 extends javafx.application.Application {

	public static void m(javafx.scene.control.TextField field) {
		java.lang.System.out.println(field.getText());
		field.setText("def");
	}

	public void start(final javafx.stage.Stage stage) {

		final javafx.scene.control.TextField text = new javafx.scene.control.TextField("pqr");

		text.setText("ghi");
		m(text);
		java.lang.System.out.println(text.getText());

		javafx.application.Platform.exit();
		java.lang.System.exit(0);
	}

	public static void main(final java.lang.String[] args) {
		javafx.application.Application.launch(args);
	}
}