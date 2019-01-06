package prob5;

public class MyStack<T>{
	private int top = -1;
	private T[] buffer;
		
	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		buffer = (T[])new Object[capacity];
	}

	
	public void push(T s) {
		top++;
		if(top < buffer.length) {
			buffer[top] = s;
		}if(top >= buffer.length) {
		
			T[] Bigbuffer = (T[])new Object[buffer.length*2];
			System.arraycopy(buffer, 0, Bigbuffer, 0, buffer.length);
			buffer=Bigbuffer;
			
			buffer[top]=s;
		}
	}

	public T pop() throws MyStackException {
		
		if(isEmpty()) {
			throw new MyStackException("스택이 비었습니다.");
		} else {
			T temp = buffer[top];
			buffer[top] = null;
			top--;
			return temp;
		}
	}

	public boolean isEmpty() {
		return top == -1;
	}
}