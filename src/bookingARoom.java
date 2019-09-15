import java.util.*;

public class bookingARoom {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rooms = scan.nextInt();
		int filled = scan.nextInt();
		if(rooms==filled)
			System.out.println("too late");
		else {
			HashSet<Integer> occupied = new HashSet<Integer>();
			for(int i=0; i<filled; i++) {
				occupied.add(scan.nextInt());
			}
			for(int j=1; j<=rooms; j++) {
				if(!occupied.contains(j)) {
					System.out.println(j);
					break;
				}
			}
		}
	}
}
