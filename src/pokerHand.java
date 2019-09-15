import java.util.*;

public class pokerHand {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		ArrayList<String> ch = new ArrayList<>();
		
		for(int i=0; i<input.length(); i=i+3) {
			String x = input.substring(i,i+1);
			ch.add(x);
		}
		
		int output = 1;
		for(String x: ch) {
			ArrayList<String> ch2 = new ArrayList<>();
			ch2.addAll(ch);
			ch2.remove(x);
			int sum=1;
			for(String y: ch2) {
				if(y.equals(x))
					sum = sum+1;
				if(sum>output)
					output=sum;
			}
		}

		System.out.println(output);
	}
	
}
