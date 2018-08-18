import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Library_Main extends Application{
	
	private Library _library = new Library();
	
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("Library Database");
		
		// Setup Boxes
		Scene main_scene = new Scene(new VBox(), 640, 480);
		final VBox main_box = new VBox();
		MenuBar main_bar = new MenuBar();
		final HBox content_box = new HBox();
		
		// Main Menus
		Menu menu_file = new Menu("File");
		Menu menu_pub = new Menu("Publication");
		Menu menu_pat = new Menu("Patron");
		Menu menu_help = new Menu("Help");
		main_bar.getMenus().addAll(menu_file, menu_pub, menu_pat, menu_help);
		
		// FILE
		MenuItem file_sample = new MenuItem("Load Sample Items");
		MenuItem file_quit = new MenuItem("Quit");
		menu_file.getItems().addAll(file_sample, file_quit);
		
		// PUBLICATION
		MenuItem pub_list = new MenuItem("List Publications");
		MenuItem pub_add = new MenuItem("Add Publication");
		MenuItem pub_checkout = new MenuItem("Checkout");
		MenuItem pub_checkin = new MenuItem("Checkin");
		menu_pub.getItems().addAll(pub_list, pub_add, pub_checkout, pub_checkin);
		
		// PATRON
		MenuItem pat_list = new MenuItem("List Patron");
		MenuItem pat_add = new MenuItem("Add Patron");
		menu_pat.getItems().addAll(pat_list, pat_add);
		
		// HELP
		MenuItem help_manual = new MenuItem("Manual");
		MenuItem help_about = new MenuItem("About");
		menu_help.getItems().addAll(help_manual, help_about);
		
		// ACTIONS
		// Load Sample Actions
		file_sample.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent sampleEvent) {
				_library.add_publication(new Publication("The Firm", "John Grisham", "1991", 
						new Genre(Genre.fiction), new Media(Media.book), new Age(Age.adult), "0440245923"));
			}
		});
		// Quit actions
		file_quit.setOnAction(new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent exitEvent) {
				System.exit(0);
			}
		});
		
		// Add everything together
		
		((VBox) main_scene.getRoot()).getChildren().addAll(main_bar, main_box);
		primaryStage.setScene(main_scene);
		primaryStage.show();
	}
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
