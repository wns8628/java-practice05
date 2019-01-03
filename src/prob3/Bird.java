package prob3;

public abstract class Bird {
	private String name;

	public abstract void fly();
	public abstract void sing();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	@Override
//	public String toString() {
//		return "이름은" + name + "입니다.";
//	}
//	
	
}
