
public class Publication {
	
	private String _title, _author, _copyright, _isbn;
	private Genre _genre;
	private Media _media;
	private Age _target_age;
	private Boolean _checked_out;
	private Patron _patron;
	
	public Publication(String p_title,
			   String p_author,
			   String p_copyright,
			   Genre p_genre,
			   Media p_media,
			   Age p_target_age,
			   String p_isbn) {
		_title = p_title;
		_author = p_author;
		_copyright = p_copyright;
		_genre = p_genre;
		_media= p_media;
		_target_age = p_target_age;
		_isbn = p_isbn;
		_patron = new Patron("", "");
		_checked_out = false;
}
	String get_title() {return _title;}
	String get_author() {return _author;}
	String get_copyright() {return _copyright;}
	String get_isbn() {return _isbn;}
	String get_genre() {return _genre.to_string();}
	String get_media() {return _media.to_string();}
	String get_age() {return _target_age.to_string();}
	Boolean get_checkout_status() {return _checked_out;}
	Patron get_patron() {return _patron;}
	
	public Boolean is_checked_out() {
		return _checked_out;
	}
	
	public void check_out(Patron patron) {
		if (_checked_out) {
			System.out.println("Already checked out");
		} else {
			_patron = patron;
			_checked_out = true;
		}
	}
	
	public void check_in() {
		if (_checked_out) {
			_checked_out = false;
		} else {
			System.out.println("Already checked in");
		}
	}
	
	public String to_string() {
		String pub = "\"" + _title + "\"" + " by " + _author + ", " + _copyright + 
			     " (" + _target_age.to_string() + " " + _genre.to_string() + " "  
		         + _media.to_string() + ") " + "ISBN: " + _isbn;
		if (_checked_out) {
			pub += "\nChecked out to " + _patron.get_name() + " (" + _patron.get_number() + ")";
		}
		return pub;
	}
}
