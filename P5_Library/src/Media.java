public class Media {
	private int _value;
	public Media(int val) {
		_value = val;
	}
	
	static final int book = 0;
	static final int periodical = 1;
	static final int newspaper = 2;
	static final int audio = 3;
	static final int video = 4;
	static final int num_media = 5;
	
	String to_string() {
		switch(_value) {
		case(book) : return "Book";
		case(periodical) : return "Periodical";
		case(newspaper) : return "Newspaper";
		case(audio) : return "Audio";
		case(video) : return "Video";
		default: return "Unknown";
		}
	}

}