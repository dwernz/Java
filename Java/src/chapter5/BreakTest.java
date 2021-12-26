package chapter5;

// Fig. 5.13: BreakTest.java
// break statement existing a for statement.
public class BreakTest {

	public static void main(String[] args) {
		int count; // control variable also used after loop terminates
		
		for (count = 1; count <= 10; count++) {
			if (count == 5) {
				break;
			}
			
			System.out.printf("%d ",  count);
		}
		
		System.out.printf("%nBroke out of loop at count = %d%n", count);
	}

}
