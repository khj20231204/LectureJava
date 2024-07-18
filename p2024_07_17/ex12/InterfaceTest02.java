package p2024_07_17.ex12;

interface IHello02{			// 인터페이스
	public abstract void sayHello(String name);	   //추상 메소드
}
interface IGoodBye02{
	public abstract void sayGoodBye(String name);	//추상 메소드
}
// 인터페이스의 다중상속
class SubClass implements IHello02, IGoodBye02{
	@Override
	public void sayHello(String name) {				// 메소드 오버라이딩
		System.out.println(name+"씨 안녕 하세요.");
	}
	@Override
	public void sayGoodBye(String name) {			// 메소드 오버라이딩
		System.out.println(name+"씨 안녕히 가세요.");
	}		
}
public class InterfaceTest02 {
	public static void main(String[] args) {
		SubClass test = new SubClass();
		test.sayHello("홍길동");	  // 메소드 오버라이딩된 메소드가 호출된다.
		test.sayGoodBye("홍길동");

	}

}
