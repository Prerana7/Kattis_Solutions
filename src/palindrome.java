//CTCI book
import java.util.*;

public class palindrome {
	public static void main(String[] args) {
		//System.out.println(Character.getNumericValue('b'));
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		input = input.toLowerCase();
		HashMap<String, Integer> letters = new HashMap<>();
		for(int i=0; i<input.length(); i++) {
			String key = input.substring(i, i+1);
			if(!key.equals(" ")) {
				if(!letters.containsKey(key))
					letters.put(key, 1);
				else
					letters.replace(key, letters.get(key)+1);
			}
		}
		int odd = 0;
		for(Integer i: letters.values()) {
			if(!(i%2==0)) {
				odd = odd+1;
			}
			if(odd>1) {
				System.out.println("false");
				System.exit(0);
			}
		}
		System.out.println("true");
	}
}
