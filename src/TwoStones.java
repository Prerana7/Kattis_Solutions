import java.util.Scanner;

public class TwoStones {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x%2==0)
			System.out.println("Bob");
		else
			System.out.println("Alice");
	}

}
