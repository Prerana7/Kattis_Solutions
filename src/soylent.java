import java.util.*;

public class soylent {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y=0;
		
		
		for(int i=1; i<=x; i++) {
			y = scan.nextInt();
			if(y%400==0)
				System.out.println(y/400);
			else
				System.out.println(1 + y/400);
		}
		
	}
}
