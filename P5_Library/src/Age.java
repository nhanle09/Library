public class Age {
	private int _value;
	
	public Age(int val) {
		_value = val;
	}
	
	static final int children = 0;
	static final int teen = 1;
	static final int adult = 2;
	static final int restricted = 3;
	static final int num_age = 4;
	
	public String to_string() {
		switch(_value) {
		case(children): return "Children";
		case(teen): return "Teenager";
		case(adult): return "Adult";
		case(restricted): return "Restricted";
		default: return "Unknown";
		}
	}
}
