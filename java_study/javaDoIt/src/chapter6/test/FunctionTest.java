package chapter6.test;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		System.out.println(add(num1,num2));
		System.out.println(sub(num1,num2));
		System.out.println(div(num1,num2));
		System.out.println(mul(num1,num2));
		
	}

	
	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int div(int a, int b) {
		return a/b;
	}
	
	public static int mul(int a, int b) {
		return a * b;
	}

}
