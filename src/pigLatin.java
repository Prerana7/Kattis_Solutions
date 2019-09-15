import java.util.*;

public class pigLatin {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			String temp = scan.nextLine();
			String[] words = temp.split(" ");
			ArrayList<String> vowels = new ArrayList<>();
			vowels.add("a");
			vowels.add("e");
			vowels.add("i");
			vowels.add("o");
			vowels.add("u");
			vowels.add("y");
			String output = "";
			for(String s: words) {
				if(vowels.contains(s.substring(0, 1))) {
					output = output+s+"yay"+" ";
				} else {
					for(int i=1; i<s.length(); i++) {
						if(vowels.contains(s.substring(i, i+1))) {
							String shift = s.substring(0, i);
							String add = s.substring(i)+shift+"ay";
							output = output+add+" ";
							break;
						}
					}
				}
			}
			System.out.println(output);
		}
	}
}
