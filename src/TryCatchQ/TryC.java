package TryCatchQ;

public class TryC {

	public static void main(String[] args) {
		
		int num = 5;
		
		try {
			System.out.println("hello");
			int value = num/0;
			System.out.println(value);
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
