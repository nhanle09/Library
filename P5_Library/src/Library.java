import java.util.ArrayList;

public class Library {
	private ArrayList<Publication> _publications = new ArrayList();
	private ArrayList<Patron> _patrons = new ArrayList();
	
	void add_publication(Publication pub) {
		_publications.add(pub);
	}
	
	void check_out(int publication_index, int patron_index) {
		_publications.get(publication_index).check_out(_patrons.get(patron_index));
	}
	
	void check_in(int publication_index) {
		_publications.get(publication_index).check_in();
	}
	
	String publication_to_string(int publication_index) {
		return _publications.get(publication_index).to_string();
	}
	
	int number_of_publications() {
		return _publications.size();
	}
	
	void easter_egg() {

		add_publication(new Publication("The Firm", "John Grisham", "1991", 
				new Genre(Genre.fiction), new Media(Media.book), new Age(Age.adult), "0440245923"));
		add_publication(new Publication("Foundation", "Isaac Asimov", "1942",
				new Genre(Genre.fiction), new Media(Media.book), new Age(Age.adult), "0385177259"));
		add_publication(new Publication("Foundation and Empire", "Isaac Asimov", "1943",
				new Genre(Genre.fiction), new Media(Media.book), new Age(Age.adult), "0385177259"));
		add_publication(new Publication("Second Foundation", "Isaac Asimov", "1944",
				new Genre(Genre.fiction), new Media(Media.book), new Age(Age.adult), "0385177259"));
		add_publication(new Publication("War of the Worlds", "Jeff Wayne", "1977",
				new Genre(Genre.performance), new Media(Media.audio), new Age(Age.teen), "9780711969148"));
		add_publication(new Publication("Willy Wonka and the Chocolate Factory", "Roald Dahl", "1971",
				new Genre(Genre.performance), new Media(Media.video), new Age(Age.children), "0142410314"));
		
		Custom_dialog.message("Load Sample Publications", "Sample Publications has been imported successfully!");
	}
}
