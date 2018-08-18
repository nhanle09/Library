
public class Patron {
	private String _name;
	private String _number;
	
	Patron(String name, String number){
		_name = name;
		_number = number;
	}
	
	String get_name() { return _name; }
	String get_number() { return _number; }
}
