import java.util.*;

public class warehouse3 implements Comparable{
	private String name;
	private int count;
	
	
	public warehouse3(String name, int count) {
		this.name = name;
		this.count = count;
	}

	public int compareTo(Object o) {
		warehouse3 w = (warehouse3) o;
		if(this.count==w.count) {
			return this.name.compareTo(w.name);
		}
		else {
			if(this.count>w.count)
				return -1;
			else
				return 1;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tests = scan.nextInt();
		for(int i=1; i<=tests; i++) {
			int numToys = scan.nextInt();
			
			String s = "s";
			String t = "s";
			//-ve if this before that.
			
			TreeSet<warehouse3> set = new TreeSet<warehouse3>();
			ArrayList<String> names = new ArrayList<String>();
			ArrayList<Integer> counts = new ArrayList<Integer>();
			
			for(int j=0; j<numToys; j++) {
				String toy = scan.next();
				int number = scan.nextInt();
				if(names.contains(toy)) {
					int index = (names.indexOf(toy));
					int temp = counts.get(index);
					warehouse3 replica = new warehouse3(toy, counts.get(index));
					counts.remove(index);
					set.remove(replica);
					counts.add(index, temp+number);
					warehouse3 replica2 = new warehouse3(toy, replica.count+number);
					set.add(replica2);
				} else {
					warehouse3 x = new warehouse3(toy, number);
					set.add(x);
					counts.add(number);
					names.add(toy);
				}

			}
			System.out.println(set.size());
			for(warehouse3 m: set) {
				System.out.println(m.name+" "+m.count);
			}
		}
	}
}
