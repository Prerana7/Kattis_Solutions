
public class prison {

	public static int[] prisonAfterNDays(int[] cells, int N) {
		
        if(N==0)
			return cells;
        
        int[] output = cells.clone();
        
        output[0]=0;
        output[7]=0;
            
        for(int i=1; i<7; i++){
            if(cells[i-1]==cells[i+1]){
                    output[i]=1;
            }
            else{
                output[i]=0;
            }
        }

        return prisonAfterNDays(output, N-1);
            
    }
	
	public static void main (String[] args) {
		
		int[] array = {0, 1, 0, 1, 1, 0, 0, 1};
		prisonAfterNDays(array, 7);
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);
		System.out.println(array[6]);
		System.out.println(array[7]);
	}
	
}
