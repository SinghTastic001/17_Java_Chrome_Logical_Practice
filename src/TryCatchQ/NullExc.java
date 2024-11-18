package TryCatchQ;

public class NullExc {
	public static void main(String[] args) {
		
		String name=" ";
		try {
			System.out.println("hello");
			System.out.println(name.toUpperCase());
			System.out.println("bye");
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
		
	}

}
