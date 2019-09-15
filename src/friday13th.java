import java.util.*;

public class friday13th {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int inputs = scan.nextInt();
		for(int a=0; a<inputs; a++) {
			int number = 0;
			int days = scan.nextInt();
			int months = scan.nextInt();
			int start = 0;
			for(int b=1; b<=months; b++) {
				int mdays = scan.nextInt();
				int i=1;
				int j = start;
				//System.out.println(j);
				ArrayList<Integer> array = new ArrayList<>(7);
				array.add(0);
				array.add(0);
				array.add(0);
				array.add(0);
				array.add(0);
				array.add(0);
				array.add(0);
//				if(mdays==13)
//					number = number + 1;
				while(i<mdays) {
					array.add(j, i);
					//System.out.println("added "+i+" at index "+j);
					if(i==13) {
						//System.out.println("index of 13 is "+array.indexOf(i));
						if(array.indexOf(i)==5) {
							number = number + 1;
							//System.out.println("13THS HAVE BEEN CHANGED TO "+number);
						}
					}
					if(i<mdays) {
						i++;
					}
//					else
//						System.out.println("this");
						
					if(j==6) {
						j=0;
					}
					else
						j++;
				}
				if(array.indexOf(i-1)==6) {
					start = 1;
				} else {
					if(array.indexOf(i-1)==5) {
						start = 0;
					}
					else {
						start = array.indexOf(i-1)+2;
					}
				}
				if(i==13) {
					if(array.indexOf(12)==4)
						number = number + 1;
				}
				//System.out.println("i= "+i);
				//System.out.println("index= "+start);
			}
			System.out.println(number);
		}
		
	}
}
