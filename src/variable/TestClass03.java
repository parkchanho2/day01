package variable;

public class TestClass03 {
	public static void main(String[] args) {
		/*
		 형변환- 자료형은 변화시키는것
		 */
		
		int num = 65;
		System.out.println(num);
		System.out.println( (char)num );
		
		char ch ='A', ch3;
		int ch2;
		
		num = 5;
		ch2 = ch + num;
		ch3 = (char)(ch + num);
		
		System.out.println(ch2);
		System.out.println(ch3);
		
		float f1 = (float)1.11;
		float f_2 = 1.11f;
		double dou = 1.11;
		
		String name = "홍길동";
		
		System.out.println("당신이름: " + name);
	}
}
