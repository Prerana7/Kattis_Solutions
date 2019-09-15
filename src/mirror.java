import java.util.*;

public class mirror {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int t=1; t<=a; t++) {
			
			int row = scan.nextInt();
			int col = scan.nextInt();
			
			System.out.println("Test "+t);
			ArrayList<String> lines = new ArrayList<String>();
			for(int i=0; i<row; i++) {
				lines.add(scan.next());
			}
			ArrayList<String> output = new ArrayList<String>();
			for(String s: lines) {
				String reverse = "";
				for(int x=s.length()-1; x>=0; x--) { 				
					reverse = reverse + s.charAt(x);
				}
				output.add(reverse);
			}
			for(int x=row-1; x>=0; x--) {
				System.out.println(output.get(x));
			}
		}
	}
}
