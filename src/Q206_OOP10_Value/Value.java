package Q206_OOP10_Value;

public class Value {
	// WRITE YOUR CODE HERE

	private int val;
	private boolean modified;

	public Value(int val) {
		this.val = val;
	}

	public Value() {

	}
	
	public int getVal() {
		if (val != 0) 	return val;
		else 			return 0;		
	}

	public void setVal(int val) {
		this.val = val;
		modified = true;
	}

	public boolean wasModified() {
		if (this.modified == true) 	return true;
		else						return false;
		
	}

}
