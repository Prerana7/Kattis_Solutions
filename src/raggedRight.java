//works

import java.util.*;

public class raggedRight {
	
	public static void main(String[] args) {

		int max = 0;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<String>();
		
		while(scan.hasNextLine()) {
			String s = scan.nextLine();
			if(s.length()>max)
				max = s.length();
			inputs.add(s);
			
		}
		scan.close();
		int score = 0;
		for(String x: inputs) {
			if(inputs.indexOf(x)!=inputs.size()-1) {
				score = score + (max-x.length())*(max-x.length());
			}
		}
		System.out.println(score);
	}
}
