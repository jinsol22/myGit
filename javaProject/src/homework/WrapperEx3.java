package homework;

public class WrapperEx3 {
	public static void main(String[] args) {
		
		String st ="Hello1234";
		System.out.println("(Chracter 사용)");
		
		for(int i=0; i<st.length(); i++) {
			char c = st.charAt(i);
			if(Character.isUpperCase(c)) {
				System.out.println(c+"는 대문자입니다.");
			}else if(Character.isLowerCase(c)) {
				System.out.println(c+"는 소문자입니다.");
			}else if(Character.isDigit(c)) {
				System.out.println(c+"는 숫자입니다.");
		}

	}
		System.out.println("----------------------");
		System.out.println("(Integer 사용)"
				+ "");
		System.out.println("문자 "+st.substring(5)+"입니다.");
		System.out.println("숫자 "+Integer.parseInt(st.substring(5))+"입니다.");
		System.out.println("숫자 "+Integer.parseInt(st.substring(5))+"+ 2 = " +(Integer.parseInt(st.substring(5))+2)+"입니다.");
			}
}

