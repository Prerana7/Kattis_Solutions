import java.util.*;

public class crypt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ciphertext = scan.next();
		String key = scan.next();
		
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String output="";
		
		if(key.length()>ciphertext.length())
			key = key.substring(0, ciphertext.length());
		
		System.out.println(key);
		
		for(int i=0; i<key.length(); i++) {
			String letter = key.substring(i, i+1);
			int index = alphabets.indexOf(letter);
			String cletter = ciphertext.substring(i, i+1);
				
			int start = alphabets.indexOf(cletter)-index;
			if(alphabets.indexOf(cletter)-index<0) {
				start = 26 + start;
			}

			output = output + alphabets.substring(start, start+1);
			if(key.length()<ciphertext.length()) {
				key = key + alphabets.substring(start, start+1);
			}
		}
		
		System.out.println(output);
	}
}
