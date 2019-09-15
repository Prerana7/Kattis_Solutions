import java.util.*;

public class cetiri {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[3];
		array[0]=scan.nextInt();
		array[1]=scan.nextInt();
		array[2]=scan.nextInt();
		Arrays.sort(array);
		int dif1 = array[1]-array[0];
		int dif2 = array[2]-array[1];
		if(dif1==dif2)
			System.out.println(array[2]+dif1);
		else
			if(dif1>dif2) {
				System.out.println(array[0]+dif2);
			} else
				System.out.println(array[1]+dif1);
				
		
	}
}
