import java.util.*;

public class abc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer[] arr = new Integer[3];
		arr[0] = scan.nextInt();
		arr[1] = scan.nextInt();
		arr[2] = scan.nextInt();
		
		Arrays.sort(arr);
		
		String order = scan.next();
		
		order = order.replaceAll("A", arr[0].toString()+ " ");	
		order = order.replaceAll("B", arr[1].toString()+" ");	
		order = order.replaceAll("C", arr[2].toString()+ " ");
		System.out.println(order);
	}
}
