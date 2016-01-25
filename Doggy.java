public class Doggy {
	
	String doggyMethod(int n) {
		if (n <= 0) {
			return "";
		}
		String result = doggyMethod(n-3) + n + doggyMethod(n-2);
		return result;
	}
	
	int mcCarthy91(int n) {
		System.out.println(n);
		if (n > 100) {
			return n - 10;
		} else {
			return mcCarthy91(mcCarthy91(n+11));
		}
	}
	
	
	public static void main(String[] args) {
		Doggy dog = new Doggy();
		System.out.println(dog.doggyMethod(3));
		System.out.println(dog.mcCarthy91(50));
		//System.out.println(dog.mcCarthy91(73));
		//System.out.println(dog.mcCarthy91(95));
	}
} 