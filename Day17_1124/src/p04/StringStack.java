package p04;

public class StringStack implements StackInterface {
	String[] element;
	int index;
	
	public StringStack(int capacity) {
		this.element = new String[capacity];
		this.index = 0;
	}

	@Override
	public int length() {
		return this.index;
	}

	@Override
	public String pop() {
		if(index == 0) {
			return null;
		}
		index--;
		return element[index];
	}

	@Override
	public boolean push(String ob) {
		if(index == element.length) {
			return false;
		}
		else {
			element[index++] = ob;
		}
		return true;
	}
	
	
}
