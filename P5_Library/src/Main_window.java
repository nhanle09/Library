import java.util.Scanner;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main_window extends Application {

	private Library _library;
	//private Controller _controller;
	
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("Library Database");
		
		Scene main_scene = new Scene(new VBox(), 640, 480);
		final VBox vbox = new VBox();
		
		MenuBar main_bar = new MenuBar();
		// FILE
		Menu menu_file = new Menu("File");
		MenuItem file_sample = new MenuItem("Load Sample Items");
		file_sample.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent sampleEvent) {
				_library.easter_egg();
			}
		});
		MenuItem file_quit = new MenuItem("Quit");
		file_quit.setOnAction(new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent exitEvent) {
				System.exit(0);
			}
		});
		menu_file.getItems().addAll(file_sample, file_quit);
		// PUBLICATION
		Menu menu_pub = new Menu("Publication");
		MenuItem pub_list = new MenuItem("List Publications");
		MenuItem pub_add = new MenuItem("Add Publication");
		MenuItem pub_checkout = new MenuItem("Checkout");
		MenuItem pub_checkin = new MenuItem("Checkin");
		menu_pub.getItems().addAll(pub_list, pub_add, pub_checkout, pub_checkin);
		// PATRON
		Menu menu_pat = new Menu("Patron");
		MenuItem pat_list = new MenuItem("List Patron");
		MenuItem pat_add = new MenuItem("Add Patron");
		menu_pat.getItems().addAll(pat_list, pat_add);
		// HELP
		Menu menu_help = new Menu("Help");
		MenuItem help_manual = new MenuItem("Manual");
		MenuItem help_about = new MenuItem("About");
		menu_help.getItems().addAll(help_manual, help_about);
		// Add everything together
		main_bar.getMenus().addAll(menu_file, menu_pub, menu_pat, menu_help);
		((VBox) main_scene.getRoot()).getChildren().addAll(main_bar, vbox);
		primaryStage.setScene(main_scene);
		primaryStage.show();
	}
	
	public void launch_app() {
		launch();
	}
}
