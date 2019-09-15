import java.util.*;

public class exam {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String you = scan.next();
		String fr = scan.next();
		int same = 0;
		int allSame = 0;
		
		for(int i=0; i<fr.length(); i++) {
			if(fr.substring(i, i+1).equals(you.substring(i, i+1))) {
				if(same<a)
					same = same+1;
				allSame = allSame+1;
			}
		}
		
		if(allSame>0) {
			if(same>=a)
				System.out.println(same+fr.length()-allSame);
			if(a>same)
				System.out.println(same+fr.length()-a);
		}
			
		else
			System.out.println(fr.length()-a);
	}

}














