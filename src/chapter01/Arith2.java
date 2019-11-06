package chapter01;

public class Arith2 {

	public static void main(String[] args) {
		int n = 1;
		System.out.println(n++); //후위: n을 출력한 후 더한다
		System.out.println(n);
		
		System.out.println(--n);
		//전위: 연산 먼저 하고 출력

	}

}
