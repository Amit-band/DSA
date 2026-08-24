package stackimplementation;

public class ProgramDriver {
	public static void main(String[] args) {
		BrowserStacks bs = new BrowserStacks();
		bs.visit("Youtube");
		bs.visit("Amazon");
		bs.visit("flipkart");
		System.out.println(bs.reload());
		bs.back();
		System.out.println(bs.reload());
		bs.back();
		System.out.println(bs.reload());
		bs.forward();
		System.out.println(bs.reload());
		bs.forward();
		System.out.println(bs.reload());
	}
}
