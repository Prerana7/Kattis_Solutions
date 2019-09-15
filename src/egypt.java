import java.util.*;

public class egypt {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            if(x!=0 && y!=0 && z!=0) {
                int[] arr = new int[3];
                arr[0] = x;
                arr[1] = y;
                arr[2] = z;
                Arrays.sort(arr);
                if((arr[0]*arr[0])+(arr[1]*arr[1])==(arr[2]*arr[2])) {
                    System.out.println("right");
                }
                else
                    System.out.println("wrong");
            }
            if(x==0 && y==0 && z==0)
                break;
            if(x==0 || y==0 || z==0)
                System.out.println("wrong");
            
        }
        //scan.close();
        //System.exit(0);
    }
}