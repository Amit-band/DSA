package browserProblem;

public class PrograDriver {
	public static void main(String[] args) {
		BrowserStack bs = new BrowserStack();
		bs.visit("Google");
		bs.visit("Youtube");
		bs.visit("Github");
		bs.visit("Leetcode");
		
//		System.out.println(bs.currentPage());
		
		bs.back();
		bs.visit("Amazon");
		System.out.println(bs.currentPage());
		bs.back();
		System.out.println(bs.currentPage());
		bs.back();
		bs.back();
		System.out.println(bs.currentPage());
		bs.back();
		bs.visit("X.com");
		System.out.println(bs.currentPage());
		bs.back();
		System.out.println(bs.currentPage());
	}
}
