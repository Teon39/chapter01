package chapter01;

public class TypeCast {

	public static void main(String[] args) {
		//implicity(암묵적) Type Cast
		int i = 10;
		long l = i;
		//long의 범위가 더 크니까 그냥 알아서 바꿈
		
		System.out.println(i + ":" + l);
		
		//explicity(명시적) Type Cast
		long l2 = 1234567890L;
		int i2 = (int)l2;
		//작은쪽으로 갈때
		
		System.out.println(i2+":"+l2);

	}

}
