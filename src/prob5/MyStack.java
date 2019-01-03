package prob5;

public class MyStack {
	private int top = -1;
	private String[] buffer;
	
	private String[] Bigbuffer;
	private int arrlength;
	
	
	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		buffer = new String[capacity];
		arrlength = capacity;
	}

	
	public void push(String s) {
		top++;
		if(top < arrlength) {
			buffer[top] = s;
		}if(top >= arrlength) {
			
			arrlength = arrlength*2;
			Bigbuffer = new String[arrlength];
			System.arraycopy(buffer, 0, Bigbuffer, 0, buffer.length);
			buffer=Bigbuffer;
			
			buffer[top]=s;
		}
	}

	public String pop() throws MyStackException {
		if(isEmpty()) {
			new MyStackException("에러발생");
		}
		String temp = buffer[top];
		buffer[top] = null;
		top--;
	  return temp;
	}

	public boolean isEmpty() {
		return top == -1;
	}
}