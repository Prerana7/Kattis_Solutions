import java.util.*;

public class fox {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int tests = scan.nextInt();
		scan.nextLine();
		for(int i=0; i<tests; i++) {
			//scan.nextLine();
			String fox = scan.nextLine();
			//System.out.println("chech this: "+fox);
			String[] sounds = fox.split(" ");
			HashSet<String> other = new HashSet<String>();
			String x = scan.nextLine();
			while(!x.equals("what does the fox say?")) {
				//System.out.println(x);
				int a = x.indexOf(" ")+6;
				String sound = x.substring(a); 
				//System.out.println(sound);
				other.add(sound);
				x = scan.nextLine();
			}
			String output = "";
			for(String s: sounds) {
				if(!other.contains(s))
					output = output+s+" ";
			}
			System.out.println(output);
		}
	}
}
