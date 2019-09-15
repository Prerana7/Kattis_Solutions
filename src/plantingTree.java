import java.util.*;

public class plantingTree {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int seeds = scan.nextInt();
		ArrayList<Integer> days = new ArrayList<Integer>();
		for(int i=0; i<seeds; i++) {
			int x = scan.nextInt();
			days.add(x+1);
		}
		Collections.sort(days);
		
		//you can do this with just an int max =0; but im this works and im lazy
		ArrayList<Integer> diff = new ArrayList<Integer>();
		int n=0;
		for(int j=days.size()-1; j>=0; j--) {
			if(days.size()-n<=days.get(j)) {
				diff.add(Math.abs(days.size()-n-days.get(j)));
				//System.out.println(Math.abs(days.size()-n-days.get(j)));
			} else {
				diff.add(0);
				//System.out.println(0);
			}
			n++;
		}
		Collections.sort(diff);
		System.out.println(diff.get(diff.size()-1)+1+days.size());
	}
}
