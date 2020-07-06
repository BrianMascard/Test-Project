

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		try {

			System.out.println("Exception handling method");
			int I=1/0;
			System.out.println("Completed");	
		} 

		catch (Exception e) {
			// TODO: handle exception
			System.out.println("I am inside the catch block");
			System.out.println("Message is "+e.getMessage());
			System.out.println("Message is "+e.getCause());
			System.out.println("Message is "+e.getClass());
		} 

		finally {
			System.out.println("I am inside the finally block");
		}


	}

}
