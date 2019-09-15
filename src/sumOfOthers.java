import java.util.*;

public class sumOfOthers {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] arr = line.split(" ");
			int sum = 0;
			ArrayList<Integer> numbers = new ArrayList<>();
			for(String s: arr) {
				Integer a = 0;
				Integer x = a.parseInt(s);
				numbers.add(x);
				sum = sum+x;
			}
			for(Integer x: numbers) {
				if(x==(sum-x)) {
					System.out.println(x);
					break;
				}
			}
		}
	}
}
