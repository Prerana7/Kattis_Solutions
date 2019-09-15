import java.util.*;

public class numberFun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=1; i<=x; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a+b == c || Math.abs(a-b)==c || a*b==c || (a/b ==c && a%b==0) || (b/a == c && b%a==0)) {
				System.out.println("Possible");
			} else {
				System.out.println("Impossible");			
			}
		}
			
			
	}
	
}
