package prob5;

public class MyStack {
	private int top = -1;
	//-1 에서? 넣을떄 1올리고 넣고? 
	//꽉차면 새로두배의 스택만들고 카피하고 top을 올리자
	// pop 빈거는 top 이-1인지 계속검사해야겠지
	// ㅁㅁ= buffer[top]
	// 넣고 가리키게하고 null바꾸고 
	// return 하고
	private String[] buffer;
	private String[] Bigbuffer;
	private int arrlength;
	
	
	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		buffer = new String[capacity];
		arrlength = capacity;
	}

	
	public void push(String s) {
		if(top < arrlength-1) {
			top++;
			buffer[top] = s;
		}if(top >= arrlength-1) {
			arrlength = arrlength*2;
			Bigbuffer = new String[arrlength];
			System.arraycopy(buffer, 0, Bigbuffer, 0, buffer.length);
			buffer=Bigbuffer;
			
			top++;
			buffer[top]=s;
		}
	}

	public String pop() throws MyStackException {
		if(isEmpty()) {
//			new MyStackException();
			return "익셉션~";
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