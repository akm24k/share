
public class xx1{
	public static void main(String[] args) throws Exception {
		var s = new string("24k string");
		println(s);
	}

	static <T> void print(T t) { System.out.print(t); }
	static <T> void println() { System.out.println(); }
	static <T> void println(T t) { System.out.println(t); }
	static void printf(String fmt, Object... args) { System.out.printf(fmt, args); }
}
