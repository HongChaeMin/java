package stack_quiz;

import java.util.ArrayList;
import java.util.List;

public class Stack {

	private List<String> stack = new ArrayList<>();
	private int top = -1;

	public boolean push(String value) {
		this.top++;
		return this.stack.add(value);
	}

	public String peek() {
		return this.stack.get(this.top);
	}

	public String pop() {
		this.top--;
		return this.stack.remove(this.stack.size() - 1);
	}

}
