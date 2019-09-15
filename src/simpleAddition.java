import java.util.*;
import java.math.*;

public class simpleAddition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger a = new BigInteger(scan.next());
		BigInteger b = new BigInteger(scan.next());
		System.out.println(a.add(b));
	}
}
