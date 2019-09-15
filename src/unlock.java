import java.util.*;

public class unlock {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] code = new int[3][3];
		code[0][0] = scan.nextInt();
		code[0][1] = scan.nextInt();
		code[0][2] = scan.nextInt();
		code[1][0] = scan.nextInt();
		code[1][1] = scan.nextInt();
		code[1][2] = scan.nextInt();
		code[2][0] = scan.nextInt();
		code[2][1] = scan.nextInt();
		code[2][2] = scan.nextInt();
		double length = 0;
		
		int x=0;
		int y=0;
		boolean done = false;
		
		while(done==false) {
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(code[i][j]==1) {
						x=i; 
						y=j; 
						done=true;
					}
				}
			}
		}
		
		while(code[x][y]!=9) {
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(code[i][j]==code[x][y]+1) {
						length = length + Math.sqrt(((x-i)*(x-i))+((y-j)*(y-j)));
						x=i;
						y=j;
					}
				}
			}
		}

		
		System.out.printf("%.10f %n",length);
		
		
	}

}
