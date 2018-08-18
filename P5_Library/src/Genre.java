public class Genre {
	private int _value;
	
	public Genre(int val) {
		_value = val;
	}
	
	static public final int fiction = 0;
	static public final int nonfiction = 1;
	static public final int selfhelp = 2;
	static public final int performance = 3;
	static public final int num_genre = 4;
	
	String to_string() {
		switch(_value) {
		case(fiction) : return "Fiction";
		case(nonfiction) : return "Non-Fiction";
		case(selfhelp) : return "Self-Help";
		case(performance) : return "Performance";
		default: return "Unknown";
		}
	}

}
