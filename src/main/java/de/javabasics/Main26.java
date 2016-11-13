package de.javabasics;

public final class Main26 extends javafx.application.Application {

	public void start(final javafx.stage.Stage stage) {

		final javafx.scene.control.TextField text0 = new javafx.scene.control.TextField("text0");
		final javafx.scene.control.TextField text1 = new javafx.scene.control.TextField("text1");
		final javafx.scene.control.TextField text2 = new javafx.scene.control.TextField("text2");
		final javafx.scene.control.TextField text3 = new javafx.scene.control.TextField("text3");

		final javafx.scene.layout.VBox vbox0 = new javafx.scene.layout.VBox();
		vbox0.getChildren().add(text0);
		vbox0.getChildren().add(text1);

		final javafx.scene.layout.VBox vbox1 = new javafx.scene.layout.VBox();
		vbox1.getChildren().add(text2);
		vbox1.getChildren().add(text3);

		final javafx.scene.layout.HBox hbox = new javafx.scene.layout.HBox();
		hbox.getChildren().add(vbox0);
		hbox.getChildren().add(vbox1);

		stage.setScene(new javafx.scene.Scene(hbox));
		stage.show();
	}
}

/*
 * mit flowpain public final class Main26 extends javafx.application.Application
 * {
 * 
 * public void start( final javafx.stage.Stage stage ) {
 * 
 * final javafx.scene.control.TextField text0 = new
 * javafx.scene.control.TextField( "text0" ); final
 * javafx.scene.control.TextField text1 = new javafx.scene.control.TextField(
 * "text1" ); final javafx.scene.control.TextField text2 = new
 * javafx.scene.control.TextField( "text2" ); final
 * javafx.scene.control.TextField text3 = new javafx.scene.control.TextField(
 * "text3" );
 * 
 * final javafx.scene.layout.VBox vbox0 = new javafx.scene.layout.VBox();
 * vbox0.getChildren().add( text0 ); vbox0.getChildren().add( text1 );
 * 
 * final javafx.scene.layout.VBox vbox1 = new javafx.scene.layout.VBox();
 * vbox1.getChildren().add( text2 ); vbox1.getChildren().add( text3 );
 * 
 * final javafx.scene.layout.HBox hbox = new javafx.scene.layout.HBox();
 * hbox.getChildren().add( vbox0 ); hbox.getChildren().add( vbox1 );
 * 
 * stage.setScene( new javafx.scene.Scene( hbox ));
 * 
 * 
 * final javafx.scene.layout.FlowPane pane = new javafx.scene.layout.FlowPane();
 * for( int i = 0; i < 33; ++i ) { final javafx.scene.control.TextField text =
 * new javafx.scene.control.TextField( "text" ); pane.getChildren().add( text );
 * }
 * 
 * stage.setScene( new javafx.scene.Scene( pane ));
 * 
 * stage.show(); }}
 */

// meine Lösung jetzt, geht noch nicht > Refactoring!!!
/*
 * public final class Main26 extends javafx.application.Application {
 * 
 * 
 * public static void textMethode (javafx.scene.layout.Pane vbox,
 * javafx.scene.layout.Pane hbox, String t){ final
 * javafx.scene.control.TextField text = new javafx.scene.control.TextField( t
 * ); vbox.getChildren().add( text ); hbox.getChildren().add( text ); }
 * 
 * public void start( final javafx.stage.Stage stage ) {
 * 
 * final javafx.scene.layout.Pane vbox = new javafx.scene.layout.VBox();
 * 
 * final javafx.scene.layout.Pane hbox = new javafx.scene.layout.HBox();
 * 
 * textMethode (vbox, hbox, "text1");
 * 
 * 
 * 
 * 
 * stage.setScene( new javafx.scene.Scene(vbox)); stage.show(); }
 * 
 * 
 * public static void main( final java.lang.String[] args ){
 * javafx.application.Application.launch( args ); } }
 * 
 */