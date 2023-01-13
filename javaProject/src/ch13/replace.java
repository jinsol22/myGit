package ch13;

public class replace {
	public static void main(String[] args) {
		String a="java program";
		System.out.println(a.replace("a", "A"));
		
		a=a.replace("a", "A");
		System.out.println(a);
	}
}
