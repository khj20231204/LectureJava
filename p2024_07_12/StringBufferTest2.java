package p2024_07_12;

public class StringBufferTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb1 = new StringBuffer("gemini");
		System.out.println(sb1);
		
		StringBuffer sb2 = sb1.append(" is beautiful");
		System.out.println(sb1);	// gemini is beautiful
		System.out.println(sb2);	// gemini is beautiful
		if(sb1 == sb2) {	// 주소값 비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		sb1.append(1004);
		System.out.println(sb1);	// gemini is beautiful1004
		System.out.println(sb2);	// gemini is beautiful1004
		
		// sb1의 값을 대문자로 변환 해보자?
		// StringBufer클래스를 String클래스로 변환 시킨다.
		String str = new String(sb1);
		System.out.println(str.toUpperCase());
	}

}



