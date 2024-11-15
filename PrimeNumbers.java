public class PrimeNumbers {
	public static void main ( String[] args ) {

		int x = 2;
		System.out.println(1 + "\n2");
		do {
			if (x % 2 == 1 && x % x == 0 && x % 3 == 1 && x % 5 == 1 ) {

				System.out.println(x);
			}
			x++;
		}
		while(x <= 50);		
	}		
}