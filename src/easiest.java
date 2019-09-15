import java.util.*;

public class easiest {
	
	public static int number(int input, int sum, int y) {
		
		int sum2=0;
		int product = input*y;
		Integer product2 = (Integer) product;
		String s2 = product2.toString();
		for(int i=0; i<s2.length(); i++) {
			String digit2 = s2.substring(i, i+1);
			Integer p=0;
			int b = p.parseInt(digit2);
			sum2 = sum2 + b;
		}
		
		if(sum==sum2)
			return y;
		
		return number(input, sum, y+1);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input=scan.nextInt();; 
		
		while(input!=0) {
			
			int sum=0;
			Integer input2 = (Integer) input;
			String s = input2.toString();
			for(int i=0; i<s.length(); i++) {
				String digit = s.substring(i, i+1);
				Integer x=0;
				int a = x.parseInt(digit);
				sum = sum + a;
			}
			System.out.println(number(input, sum, 11));
			input = scan.nextInt();
		}
		
	}

}
