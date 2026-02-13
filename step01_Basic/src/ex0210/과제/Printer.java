package ex0210.과제;

public class Printer {

	public static void main(String[] args) {

		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
		return;
	}
	
	// 객체생성없는 static 선언
	public static int println(int i) {
		System.out.println("int = " + i);
		return i;
	}
	public static boolean println(boolean b) {
		System.out.println("boolean = " + b);
		return b;
	}
	public static double println(double db) {
		System.out.println("double = " + db);
		return db;
	}
	public static String println(String str) {
		System.out.println("String = " + str);
		return str;
	}
}
