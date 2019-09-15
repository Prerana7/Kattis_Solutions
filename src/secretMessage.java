import java.util.*;

public class secretMessage {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int p=0; p<a; p++) {
			String input = scan.next();
			int n = (int)Math.ceil(Math.sqrt(input.length()));
			int size = n*n;
			int added = size - input.length();
			for(int x=1; x<=added; x++) {
				input = input + "*";
			}
			int index = 0;
			char[][] array = new char[n][n];
			for(int j=n-1; j>=0; j--) {
				for(int i=0; i<n; i++) {
					array[i][j] = input.charAt(index);
					index++;
				}
			}
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(!(array[i][j]=='*')) {
						System.out.print(array[i][j]);
					}
				}
			}
			System.out.println();
		}
	}
}
