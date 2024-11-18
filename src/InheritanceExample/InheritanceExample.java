package InheritanceExample;

class Father{
	
	public void wakeUp() {
		System.out.println("Father wake up at 5 am");
	}
	
	public void hobby() {
		System.out.println("father hobby is swiming");
	}
}

class Son extends Father{
	
	public void wakeUp() {
		super.wakeUp();
		System.out.println("Son Wake up at 6 am");
	}
	
	public void study() {
		System.out.println("son study in 12th");
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		
//		Father f = new Father();
//		f.wakeUp();
		
		Son s = new Son();
		s.wakeUp();
		s.study();
	}
}
