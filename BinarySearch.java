import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
	private List<Integer> list;
	
	public BinarySearch() {
		list = new ArrayList<Integer>();
	}
	
	public boolean binSearch(int n, List list) {
		if (list.isEmpty()) {
			return false;
		} else if (list.get(list.size() / 2).equals(n)) {
			return true;
		} else if (list.size() == 1) {
			return false;
		} else if ((Integer) list.get(list.size() / 2) > n) {			
			return binSearch(n, list.subList(0, list.size() / 2));
		} else {
			return binSearch(n, list.subList(list.size() / 2, list.size()));
		}
	}
	
	public static void main(String[] args) {
		BinarySearch bin = new BinarySearch();
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			bin.list.add(i);
		}
		
		
		System.out.println(bin.binSearch(5, bin.list));
		System.out.println(bin.binSearch(19, bin.list));
		System.out.println(bin.binSearch(7, bin.list));
		System.out.println(bin.binSearch(11, bin.list));
		System.out.println(bin.binSearch(0, bin.list));
		
		bin.list.clear();
		System.out.println();
		
		for (int i = 0; i < 100; i++) {
			bin.list.add(i);
		}
		
		System.out.println(bin.binSearch(76, bin.list));
		System.out.println(bin.binSearch(-4, bin.list));
		System.out.println(bin.binSearch(88, bin.list));
		System.out.println(bin.binSearch(123, bin.list));
		System.out.println(bin.binSearch(99, bin.list));
		
		bin.list.clear();
		System.out.println();
		
		for (int i = 0; i < 1000; i++) {
			bin.list.add(i);
		}
		
		System.out.println(bin.binSearch(453, bin.list));
		System.out.println(bin.binSearch(100654, bin.list));
		System.out.println(bin.binSearch(987, bin.list));
		System.out.println(bin.binSearch(12345, bin.list));
		System.out.println(bin.binSearch(500, bin.list));
		
	}
}