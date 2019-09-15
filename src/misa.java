import java.util.*;

public class misa implements Comparable{
	
		private int fx;
		private int fy;
		private int sx;
		private int sy;
		
		misa(int fx, int fy, int sx, int sy){
			this.fx = fx;
			this.fy = fy;
			this.sx = sx;
			this.sy = sy;
		}
		
		@Override
		public int compareTo(Object o) {
			misa that = (misa)o;
			if(that.fx>this.fx)
				return 1;
			if(this.fx==that.fx&&this.fy==that.fy&&this.sx==that.sx&&this.sy==that.sy)
				return 0;
			else
				return -1;
		}
		
		public boolean equals(Object o) {
			misa other = (misa)o;
			if(this.compareTo(other)==0)
				return true;
			else
				return false;
		}
		
		@Override
		public int hashCode() {
			ArrayList<Object> arr = new ArrayList<>();
			arr.add(this.fx);
			arr.add(this.fy);
			arr.add(this.sx);
			arr.add(this.sy);
			return arr.hashCode();
		}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		int[][] array = new int[row][col];
		for(int i=0; i<row; i++) {
			String r = scan.next();
			for(int j=0; j<col; j++) {
				//System.out.println("entered loop");
				//System.out.println(r);
				if(r.substring(j,j+1).equals("o")) {
					array[i][j] = 1;
					//System.out.println("added 1");
				} else
					array[i][j] = 0;
			}
		}
		
		
		int max =0;
		HashSet<misa> set = new HashSet<misa>();
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(array[i][j]==1) {
					if(i-1>=0) {
						if(j-1>=0 && array[i-1][j-1]==1) {
							misa a = new misa((i-1),(j-1),i,j);
							if(!set.contains(a)) {set.add(a);}
						}
						if(array[i-1][j]==1) {
							misa a = new misa((i-1),(j),i,j);
							if(!set.contains(a)) {set.add(a);}
						}
						if(j+1<col && array[i-1][j+1]==1) {
							misa a = new misa((i-1),(j+1),i,j);
							if(!set.contains(a)) {
								set.add(a);
							}
						}
					}
					if(j-1>=0 && array[i][j-1]==1) {
						set.add(new misa((i),(j-1),i,j));
					}
					
					if(j+1<col && array[i][j+1]==1) {
						set.add(new misa(i,j,i,(j+1)));
					}
					
					if(i+1<row) {
						if(j-1>=0 && array[i+1][j-1]==1) {
							set.add(new misa(i,j,i+1,j-1));
						}
						if(array[i+1][j]==1) {
							set.add(new misa(i,j,i+1,j));
						}
						if(j+1<col && array[i+1][j+1]==1) {
							misa a = new misa(i,j,i+1,j+1);
							if(!set.contains(a)) {
								set.add(a);
							}
							//System.out.println("added pt "+a.fx+" "+a.fy+" "+a.sx+" "+a.sy);
						}
					}
				}
				
				if(array[i][j]==0) {
					int temp = 0;
					if(i-1>=0) {
						if(j-1>=0 && array[i-1][j-1]==1)
							temp++;
						if(array[i-1][j]==1)
							temp++;
						if(j+1<col && array[i-1][j+1]==1)
							temp++;
					}
					
					if(j-1>=0 && array[i][j-1]==1)
						temp++;
					if(j+1<col && array[i][j+1]==1)
						temp++;
					
					if(i+1<row) {
						if(j-1>=0 && array[i+1][j-1]==1)
							temp++;
						if(array[i+1][j]==1)
							temp++;
						if(j+1<col && array[i+1][j+1]==1)
							temp++;
					}
					
					if(temp>max)
						max = temp;
				}

			}
		}
	}
}
