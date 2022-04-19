package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Input = 13;
		boolean flag = false;
		for (int i = 2; i < (Input / 2); i++) {
			int remainder = Input / i;
			if (remainder == 0) {
				flag = true;
			}

		}
		if (!flag)
			System.out.println(Input + " is a prime number.");
		else
			System.out.println(Input + " is not a prime number.");

	}

}
