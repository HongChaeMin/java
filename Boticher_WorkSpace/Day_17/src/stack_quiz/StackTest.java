package stack_quiz;

public class StackTest {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push("��");
		stack.push("��");
		stack.push("��");
		stack.push("��");
		stack.push("��");
		stack.push("��");
		stack.push("��");
		System.out.println(stack.peek());
		
		System.out.println();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}