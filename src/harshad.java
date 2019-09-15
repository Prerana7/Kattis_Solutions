import java.util.*;

public class harshad {

	public int addDigits(int n) {
		int sum=0;
		Integer num = (Integer) n;
		ArrayList<Integer> array = new ArrayList<>();
		String s = num.toString();
		for(int i=0; i<s.length(); i++) {
			String digit = s.substring(i, i+1);
			Integer x=0;
			int a = x.parseInt(digit);
			array.add(a);
			
			sum = sum + array.get(i);
		}
		
		if(n%sum==0)
			return n;
		else
			return addDigits(n+1);
	}
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		harshad x = new harshad();
		System.out.println(x.addDigits(g));
		
	}
	
}
