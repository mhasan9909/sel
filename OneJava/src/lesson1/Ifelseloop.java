package lesson1;

public class Ifelseloop {

	public static void main(String[] args) {
		
		int f = 10;
		String ft = "i am doing good job";
		
		if(f>10) {
			System.out.println("f is greater than 10!!");
		}
		else {
			System.out.println("f is not greater than 10!!");

		}
		if(ft.endsWith("b")) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		int a = 401;
		if(a>407) {
			System.out.println("1");
		}
		else if(a>600) {
			System.out.println("2");
		}
		else if(a>500) {
			System.out.println("3");
		}
		else{
			System.out.println("4");
		}
	}

}
