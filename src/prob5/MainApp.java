package prob5;

public class MainApp {

	public static void main(String[] args) {
		try {
			MyStack<String> stack = new MyStack<String>(3); //1. 스트링만 담겠다. 하면 제너릭더추가
			stack.push("요");
			stack.push("세");
			stack.push("하");
			stack.push("녕");
			stack.push("안");

			while (stack.isEmpty() == false) {
				Object s = stack.pop();
				System.out.println( s );
			}

			System.out.println("======================================");

			stack = new MyStack(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
		} catch ( MyStackException ex) {
			System.out.println( ex );
		}

	}

}
