package arrays;

public class prcticeArrays {
//take 2 numbers do the addition. Then double the addition. double should be divide and print the result
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;

		int addition = displaySum(a, b);
		System.out.println("Printing Addition :" + addition);

		int doubleNumber = displayDouble(addition);

		displayDivide(doubleNumber);

	}

	public static int displaySum(int a, int b) {
		int sum = a + b;
		return sum;

	}

	public static int displayDouble(int addition) {

		int doubleNumber = addition * addition;
		System.out.println("Printing Numbers :" + doubleNumber);
		return doubleNumber;

	}

	public static void displayDivide(int doubleNumber) {

		int divideNumber = doubleNumber / 2;
		System.out.println("Printing Numbers :" + divideNumber);

	}

}

//babar-printing numbers
//bruce-not give anything
//reagan-printing numbers display method
//ali-