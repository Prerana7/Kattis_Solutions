//this works too

import java.util.Scanner;

public class Quiteaproblem {

    public static void main(String[] args) {
	new Quiteaproblem();
    }
    
    public Quiteaproblem() {
	Scanner scan = new Scanner(System.in);
	while(scan.hasNextLine()){
	    System.out.println(scan.nextLine().toLowerCase().contains("problem") ? "yes" : "no");
	}
	scan.close();
    }

}