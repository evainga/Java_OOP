package de.javabasics;

public final class Main9 extends javafx.application.Application {
	public void start(final javafx.stage.Stage stage) {
		final javafx.scene.control.TextField v = new javafx.scene.control.TextField("jkl");
		java.lang.System.out.println(v.getText());
		javafx.application.Platform.exit();
	}
}