package hailstone;

import java.util.ArrayList;
import java.util.List;

public class Hailstone {
	private List<Integer> list;
	
	public Hailstone() {
		list = new ArrayList<>();
	}
	
	public List hailstone(int n) {
		list.add(n);
		if (n == 1) {
			return list;
		} else if (n % 2 == 0) {
			return hailstone(n / 2);
		} else {
			return hailstone(3 * n + 1);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println();
		Hailstone hail = new Hailstone();		
		System.out.println(hail.hailstone(10));
		hail.list.clear();
		System.out.println();
		System.out.println(hail.hailstone(50));
		hail.list.clear();
		System.out.println();
		System.out.println(hail.hailstone(100));
		hail.list.clear();
		System.out.println();
		System.out.println(hail.hailstone(74));
		hail.list.clear();
		System.out.println();
		hail.hailstone(22);		
		System.out.println(hail.hailstone(22));
	}
}