import java.util.*;

public class soda {
	
	public static int sodaBottles(int a, int b, int c) {
		
		int x = (a+b)/c;
		int y = (a+b)%c;
		if(x+y<c)
			return x;
		return x + sodaBottles(x+y, 0, c);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println(sodaBottles(a, b, c));
	}

}
