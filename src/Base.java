
public class Base {
	int value = 0;

	Base() {
		addValue();
		//System.out.println("Base Constructor Called");
	}

	void addValue() {
		value += 10;
	}

	int getValue() {
		return value;
	}
}
