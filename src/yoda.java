import java.util.*;

public class yoda {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int second = scan.nextInt();
		String one = "";
		String two = "";
		while(!(first==0 && second ==0)) {
			if(first%10>second%10) {
				one = (first%10)+one;
			} else {
				if(first%10<second%10) {
					two = (second%10)+two;
				}else {
					one = (first%10)+one;
					two = (second%10)+two;
				}
			}
			first = first/10;
			second = second/10;
		}
		Integer x = 0;

		if(one.equals("")) {
			System.out.println("YODA");
		} else {
			Integer y = x.parseInt(one);
			System.out.println(y);
		}
		
		if(two.equals("")) {
			System.out.println("YODA");
		} else {
			Integer z = x.parseInt(two);
			System.out.println(z);
		}

	}
}
