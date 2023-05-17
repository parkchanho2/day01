package variable;


/*
변수
- 데이터를 저장하는 공간

자료형
- int(4byte): 정수를 저장할 목적
- char(2byte): 문자 하나저장
- float(4byte): 실수 (소수점)
- double(8byte): 실수
- boolean(1byte): true or false
 
 */
public class TestClass01 {
	public static void main(String[] args) {
		/*
		 변수를 만드는 규칙
		 - 첫문자는 소문자이며 합성어라면 합성어의 첫 문자는 대문자로 표기
		 ex) youName
		 - 변수이름은 의미를 부여해서 만드는게 좋다.
		 
		 */
		int age = 20;
		double weight = 1.11;

		System.out.println("나의 나이는 " + age + "살 입니다.");
		System.out.println("나의 몸무게는 " + weight + " kg 입니다.");
	}
}













