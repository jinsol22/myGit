package ch01;

public class Test3 {
	public static void main(String[] args) {
		int[] arr = new int[4];//4개의 값을 저장할 수 있는 배열을 생성, 0,1,2,3
		System.out.println(arr.length);
		for(int i = 0; i <=arr.length; i++) {
			arr[i] =+ (i + 10);
			System.out.println(i);
		}
	}
}
